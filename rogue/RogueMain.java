package rogue;

import java.util.Random;
import java.util.Scanner;

public class RogueMain {
	public static void main(String[] args) {

		int[][] fieldData = { { 9, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);

		// 動作
		int r1 = rnd.nextInt(6);
		int r2 = rnd.nextInt(6);
		fieldData[r1][r2] = 3;	// 階段の位置決定


		fieldSet(fieldData);

		do {
			System.out.println("----------------------------");
			System.out.println("下に進む：0　　上に進む：1");
			System.out.println("左に進む：2　　右に進む：3");
			int action = scn.nextInt(); // 進む方向を選択

			if(!doGo(action, fieldData)) {
				break;
			}

			fieldSet(fieldData);

		} while (true);

	}

	/*マップ出力メソッド
	 * 0:まだ通ってない　1:通った
	 * 3:階段		9:今いる場所
	 */
	public static void fieldSet(int[][] fieldData) {
		System.out.println("   0 1 2 3 4 5"); // 上の数字
		System.out.println("  ------------");
		for (int i = 0; i < 6; i++) {

			System.out.print(i + "|"); // 横の数字

			for (int j = 0; j < 6; j++) {

				if (fieldData[i][j] == 9) {
					System.out.print(" @");
				} else if (fieldData[i][j] == 1) {
					System.out.print(" #");
				} else if (fieldData[i][j] == 0) {
					System.out.print("・"); 	// ．でマスを表す
				} else if (fieldData[i][j] == 3) {
					System.out.print(" %");
				}
			}
			System.out.println(); // 改行
		}

	}

	// 進むことが可能かどうか判定するメソッド（後で作る）
	public static void doCheck(int action) {

	}

	// 進むメソッド
	public static boolean doGo(int action, int[][] fieldData) {
		switch (action) {
		case 0:
			goDown(fieldData); //下に進む
			break;
		case 1:
			goUp(fieldData); //上に進む
			break;
		case 2:
			goLeft(fieldData); //左に進む
			break;
		case 3:
			goRight(fieldData); //右に進む
			break;
		default:
			break;
		}
		return true;
	}



	// 下に進むメソッド
	public static void goDown(int[][] fieldData) {
		int stop = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (fieldData[i][j] == 9) { // 9のある場所を探す
					if(fieldData[i + 1][j] == 3) { // もし移動先が3（階段）だったら
						steps();

					} else {
						fieldData[i][j] = 1; // 移動先が階段以外なら現在地を1に変更して
						fieldData[i + 1][j] = 9; // 1つ下のマス（？）を9に変更
					}
					stop = 1; // if文が一度反応したら止めたいので
					break;
				}
			}
			if (stop == 1) { // 外側のfor文も終了
				break;
			}
		}
	}

	// 上に進むメソッド
	public static void goUp(int[][] fieldData) {
		int stop = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (fieldData[i][j] == 9) {
					fieldData[i][j] = 1;
					fieldData[i - 1][j] = 9;
					stop = 1;
					break;
				}
			}
			if (stop == 1) {
				break;
			}
		}
	}

	// 右に進むメソッド
	public static void goRight(int[][] fieldData) {
		int stop = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (fieldData[i][j] == 9) {
					fieldData[i][j] = 1;
					fieldData[i][j + 1] = 9;
					stop = 1;
					break;
				}
			}
			if (stop == 1) {
				break;
			}
		}
	}

	// 左に進むメソッド
	public static void goLeft(int[][] fieldData) {
		int stop = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (fieldData[i][j] == 9) {
					fieldData[i][j] = 1;
					fieldData[i][j - 1] = 9;
					stop = 1;
					break;
				}
			}
			if (stop == 1) {
				break;
			}
		}
	}

	public static void steps() {
		System.out.println("～終了～");
	}

}
