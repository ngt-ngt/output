import java.util.Random;

public class Yakyu {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		int scoreA = 0;
		int scoreB = 0;
		
		//↓Aチームの点数
		for (int a = 1; a < 10; a++) {
			//ランダムな点数が出るscoreを作成する forの外にすると数値が固定されるっぽいので中で作成
			int score = rand.nextInt(10);
			//表示する
			System.out.print(score + " ");
			
			//最終的な合計が欲しいのでscoreAに足していく
			scoreA += score;
		}
		//for文の外でscoreAを出力　合計が出る（はず）
		System.out.println(scoreA);
		
		//Bチームの点数 ループは8回まで
		for (int a = 1; a < 9; a++) {
			int score = rand.nextInt(10);
			//表示する
			System.out.print(score + " ");
			//scoreBに足していく
			scoreB += score;
		}
		
		//BのスコアがAより高いなら×を出力、Aより低いならもう一度ランダムを回す
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
