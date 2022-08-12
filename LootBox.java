import java.util.Random;
import java.util.Scanner;

public class LootBox {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);

		// 配列の初期化
		int n = 0;
		int r = 0;
		int sr = 0;
		int ssr = 0;
		int cnt = 0; // 回した回数
		int money = 0; // かかったお金
		boolean mawasu = false; // trueならガチャ回す
		
		// 10コ入れられる配列つくる
		int[] gacha = new int[10];

		System.out.println("10連ガチャ3000円");
		System.out.println("10回目はSR以上確定です");
		System.out.println("１：回してみる");
		int yesNo = scanner.nextInt();
		
		//受け取った値が1なら
		if (yesNo == 1) {
			mawasu = true;
		}
		
		//mawasuがtrueの間ループ
		while (mawasu == true) {

			// 配列に入れていく
			for (int i = 0; i <= 9; i++) {
				gacha[i] = rand.nextInt(100); //100で指定するので0~99の値になる
				// System.out.print(gacha[i] + " ： "); //乱数の値が見たい時に表示する

				// レア度
				if (gacha[i] >= 20) {
					System.out.println("N！");
					n++;
				} else if (gacha[i] >= 5) {
					System.out.println("R！");
					r++;
				} else if (gacha[i] >= 1) {
					System.out.println("SR!!");
					sr++;
				} else {
					System.out.println("SSR!!!!!");
					ssr++;
				}
				if (i == 9) {
					gacha[9] = rand.nextInt(100);
					// System.out.print(gacha[i] + " ： ");
					if (gacha[9] >= 1) {
						System.out.println("SR！！");
						sr++;
					} else {
						System.out.println("SSR!!!!!");
						ssr++;
					}
				}
			}
			cnt ++;
			money += 3000;
			System.out.println("もう一度回す？");
			System.out.println("1:回す　2:やめる");
			yesNo = scanner.nextInt();
			if (yesNo == 2) {
				mawasu = false;
			}
		}
		
		//ループおわり
		System.out.println("ガチャを回すことをやめました");
		// 最終的な消費金額とガチャ結果
		System.out.print(cnt + "0回のガチャで　");
		System.out.println("かかったお金は " + money + "円");
		System.out.println("レア度別の排出回数は…");
		System.out.println(" N：" + n + "　R:" + r + "　SR：" + sr + "　SSR：" + ssr + " でした！");
		System.out.println("ガチャはお金持ちの遊び！");
	}
}
