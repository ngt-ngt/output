package pokeRogue;

import java.util.Random;
import java.util.Scanner;

public class RogueMain {
	public static void main(String[] args) {

		int[][] fieldData = {{9,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},
							{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};

		int[][] now = {{0},{0}};
		int i = 9;

		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		boolean f = true; //続く


		// 動作
		//do {
			fieldSet(fieldData);
			System.out.println("▼下に進む");

			Down(fieldData);
			fieldSet(fieldData);

			System.out.println("▼もう一度下に進む");
			Down(fieldData);
			fieldSet(fieldData);

			System.out.println("▼さらに下に進む");
			Down(fieldData);
			fieldSet(fieldData);
		//}while(f == true);





	}







	/*マップ出力メソッド
	 * 0:まだ通ってない　1:通った
	 * 3:出口			9:今いる場所
	 */
	public static void fieldSet(int[][] fieldData) {
		System.out.println("   0 1 2 3 4 5"); // 上の数字
		System.out.println("  ------------");
		for(int i = 0; i < 6; i++) {

			System.out.print(i + "|"); // 横の数字

			for(int j = 0; j < 6; j++) {

				if(fieldData[i][j] == 9) {
					System.out.print(" @");
				} else if(fieldData[i][j] == 1) {
					System.out.print(" #");
				}else if ((fieldData[i][j] == 0) || (fieldData[i][j] == 3)) {
					System.out.print("・"); // ．でマスを表す
				}
			}
			System.out.println(); // 改行
		}

	}

	public static void Down(int[][] fieldData) {
		int a = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(fieldData[i][j] == 9) { // 9のある場所を探す
					fieldData[i][j] = 1;	// 現在地を1に変更して
					fieldData[i+1][j] = 9;	// 1つ下のマス（？）を9に変更
					a = 1;	// if文が一度反応したら止めたいので
					break;
				}
				}
			if (a == 1) { // 外側のfor文も終了
				break;
			}
		}

	}


}