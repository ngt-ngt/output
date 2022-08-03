import java.util.Random;

public class Yakyu {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		//合計点の変数は事前に初期化しておく
		int scoreA = 0;
		int scoreB = 0;
		
		//↓上のやつ
		for (int a = 1; a < 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println("計");
		
		
		//↓Aチームの点数
		for (int a = 1; a < 10; a++) {
			//ランダムな点数が出る変数score　　for文の外だと数値が固定されるので中で作成する
			int score = rand.nextInt(10);
			//表示
			System.out.print(score + " ");
			
			//合計の点数が欲しいのでscoreAに足していく
			scoreA += score;
		}
		//for文の外でscoreAを出力　合計が出る（はず）
		System.out.println(scoreA);
		
		
		
		//Bチームの点数 ループは8回まで
		for (int a = 1; a < 9; a++) {
			int score = rand.nextInt(10);
			//表示
			System.out.print(score + " ");
			//scoreBに足していく
			scoreB += score;
		}
		
		//9回目　BのスコアがA以上なら× を出力、Aより低いならもう一度ランダムで回して合計に足す
		if (scoreA <= scoreB) {
			System.out.print("× ");
		} else {
			int score = rand.nextInt(10);
			System.out.print(score + " ");
			scoreB += score;
		}
	
		
		//for文の外でscoreBを出力　合計が出て完成！
		System.out.println(scoreB);
	}

}
