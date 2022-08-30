package rogue;

import java.util.Random;
import java.util.Scanner;

	public class RogueMain {
		public static void main(String[] args) {

			int[][] fieldData = {{9,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},
								{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};


			Random rnd = new Random();
			Scanner scn = new Scanner(System.in);
			boolean f = true; //続く
			
			
			// 動作
			do {
				fieldSet(fieldData);
				
				System.out.println("下に進む：0　　上に進む：1");
				System.out.println("右に進む：2　　左に進む：3");
				int go = scn.nextInt(); // 進む方向を選択
				
				switch(go) {
				case 0: goDown(fieldData);
				break;
				case 1: goUp(fieldData);
				break;
				case 2: goRight(fieldData);
				break;
				case 3: goLeft(fieldData);
				break;
				}
				fieldSet(fieldData);
			}while(f == true);
			
		}
		
		/*マップ出力メソッド
		 * 0:まだ通ってない　1:通った
		 * 3:出口		9:今いる場所
		 */
		public static void fieldSet(int[][] fieldData) {
			System.out.println("   0 1 2 3 4 5"); // 上の数字
			System.out.println("  ------------");
			for(int i = 0; i < 6; i++) {

				System.out.print(i + "|"); // 横の数字

				for(int j = 0; j < 6; j++) {

					if(fieldData[i][j] == 9) {
						System.out.print("　@");
					} else if(fieldData[i][j] == 1) {
						System.out.print("　#");
					}else if ((fieldData[i][j] == 0) || (fieldData[i][j] == 3)) {
						System.out.print("　・"); // ．でマスを表す
					}
				}
				System.out.println(); // 改行
			}

		}
		// 進むことが可能かどうか判定するメソッド
		public static void doCheck(int go) {
		
			
		
		}
		
		// 下に進むメソッド
		public static void goDown(int[][] fieldData) {
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
		// 上に進むメソッド
		public static void goUp(int[][] fieldData) {
			int a = 0;
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if(fieldData[i][j] == 9) {
						fieldData[i][j] = 1;
						fieldData[i-1][j] = 9;
						a = 1;
						break;
					}
					}
				if (a == 1) {
					break;
				}
			}
		}
		// 右に進むメソッド
		public static void goRight(int[][] fieldData) {
			int a = 0;
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if(fieldData[i][j] == 9) {
						fieldData[i][j] = 1;
						fieldData[i][j+1] = 9;
						a = 1;
						break;
					}
					}
				if (a == 1) {
					break;
				}
			}
		}
		// 左に進むメソッド
		public static void goLeft(int[][] fieldData) {
			int a = 0;
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if(fieldData[i][j] == 9) {
						fieldData[i][j] = 1;
						fieldData[i][j-1] = 9;
						a = 1;
						break;
					}
					}
				if (a == 1) {
					break;
				}
			}
		}

	}


