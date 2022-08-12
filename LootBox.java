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
		boolean mawasu = false; // trueなら1回だけガチャを回す
		boolean mawasu10 = false; // trueなら10連ガチャ回す
		int box = 0; // 犬種の判定に使う
		String dog; // returnで戻ってきた文字列の受け取り用

		// 10連用　10コ入れられる配列を用意する
		int[] gacha = new int[10];

		System.out.println("犬ガチャ　1回:300円　10連：3000円");
		System.out.println("10連ガチャはSR以上確定です");
		System.out.println("１：単発で回す　2:10連で回す");
		int yesNo = scanner.nextInt();

		// 受け取った値が1なら単発 2なら10連でループさせる
		if (yesNo == 1) {
			mawasu = true;
		} else if (yesNo == 2) {
			mawasu10 = true;
		}
		
		// 単発
		while (mawasu == true) {
			box = rand.nextInt(100);
			// レア度
			if (box >= 30) {
				dog = dogsN(box = rand.nextInt(100));
				System.out.println("N! 　　" + dog);
				n++;

			} else if (box >= 5) {
				dog = dogsR(box = rand.nextInt(100));
				System.out.println("R!  　" + dog);
				r++;

			} else if (box >= 1) {
				dog = dogsSR(box = rand.nextInt(100));
				System.out.println("SR!!  " + dog);
				sr++;

			} else {
				dog = dogsSSR(box = rand.nextInt(100));
				System.out.println("SSR!!!! " + dog);
				ssr++;
			}
			cnt += 1;
			money += 300;
			System.out.println("もう一度回す？");
			System.out.println("1:回す 2:やめる");
			yesNo = scanner.nextInt();
			if (yesNo == 2) {
				mawasu = false;
			}
		}
		
		// 10連　mawasu10がtrueの間ループ
		while (mawasu10 == true) {
			// 配列に入れていく
			for (int i = 0; i <= 9; i++) {
				gacha[i] = rand.nextInt(100);
				// System.out.print(gacha[i] + " ： "); //乱数の値が見たい時に表示する
				// レア度
				if (gacha[i] >= 30) {
					dog = dogsN(box = rand.nextInt(100));
					System.out.println("N! 　　" + dog);
					n++;

				} else if (gacha[i] >= 5) {
					dog = dogsR(box = rand.nextInt(100));
					System.out.println("R!  　" + dog);
					r++;

				} else if (gacha[i] >= 1) {
					dog = dogsSR(box = rand.nextInt(100));
					System.out.println("SR!!  " + dog);
					sr++;

				} else {
					dog = dogsSSR(box = rand.nextInt(100));
					System.out.println("SSR!!!! " + dog);
					ssr++;
				}

				if (i == 9) {
					gacha[9] = rand.nextInt(100);
					// System.out.print(gacha[i] + " ： ");
					if (gacha[9] >= 1) {
						dog = dogsSR(box = rand.nextInt(100));
						System.out.println("SR!! " + dog);
						sr++;

					} else {
						dog = dogsSSR(box = rand.nextInt(100));
						System.out.println("SSR!!!! " + dog);
						ssr++;
					}
				}
			}
			cnt += 10;
			money += 3000;
			System.out.println("もう一度回す？");
			System.out.println("1:回す 2:やめる");
			yesNo = scanner.nextInt();
			if (yesNo == 2) {
				mawasu10 = false;
			}
		}

		// ループおわり
		System.out.println("犬ガチャをやめました");
		// 最終的な消費金額とガチャ結果
		System.out.print(cnt + "回のガチャで　");
		System.out.println("かかったお金は " + money + "円");
		System.out.println("レア度別の排出回数は…");
		System.out.println(" N：" + n + "　R:" + r + "　SR：" + sr + "　SSR：" + ssr + " でした！");
		System.out.println("犬は可愛いですね");
	}

	// 犬の種類判定 小型犬
	public static String dogsN(int box) {
		String dog = null;
		if (box >= 90) {
			dog = "チワワ";
		} else if (box >= 80) {
			dog = "ポメラニアン";
		} else if (box >= 70) {
			dog = "狆";
		} else if (box >= 60) {
			dog = "パピヨン";
		} else if (box >= 50) {
			dog = "トイプードル";
		} else if (box >= 40) {
			dog = "ペキニーズ";
		} else if (box >= 30) {
			dog = "マルチーズ";
		} else if (box >= 20) {
			dog = "ダックスフンド";
		} else if (box >= 10) {
			dog = "ミニチュアピンシャー";
		} else {
			dog = "シーズー";
		}
		return dog;
	}

	// 中型犬
	public static String dogsR(int box) {
		String dog = null;
		if (box >= 90) {
			dog = "柴犬";
		} else if (box >= 80) {
			dog = "コーギー";
		} else if (box >= 70) {
			dog = "スピッツ";
		} else if (box >= 60) {
			dog = "ビーグル";
		} else if (box >= 50) {
			dog = "ボストンテリア";
		} else if (box >= 40) {
			dog = "アメリカンコッカースパニエル";
		} else if (box >= 30) {
			dog = "ボーダーコリー";
		} else if (box >= 20) {
			dog = "シェットランドシープドッグ";
		} else if (box >= 10) {
			dog = "サモエド";
		} else {
			dog = "シュナウザー";
		}
		return dog;
	}

	// 大型犬
	public static String dogsSR(int box) {
		String dog = null;
		if (box >= 90) {
			dog = "ダルメシアン";
		} else if (box >= 80) {
			dog = "ゴールデンレトリバー";
		} else if (box >= 70) {
			dog = "ドーベルマン";
		} else if (box >= 60) {
			dog = "セントバーナード";
		} else if (box >= 50) {
			dog = "土佐犬";
		} else if (box >= 40) {
			dog = "サルーキ";
		} else if (box >= 30) {
			dog = "ボルゾイ";
		} else if (box >= 20) {
			dog = "アフガンハウンド";
		} else if (box >= 10) {
			dog = "グレートデーン";
		} else {
			dog = "チベタンマスティフ";
		}
		return dog;
	}

	// 絶滅した犬種
	public static String dogsSSR(int box) {
		String dog = null;
		if (box >= 70) {
			dog = "チズム";
		} else if (box >= 40) {
			dog = "ブレンバイザー";
		} else {
			dog = "クリ";
		}
		return dog;
	}
}
