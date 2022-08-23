package wordle;

import java.util.Arrays;
import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) {
		String[] anser = { "H", "O", "T", "E", "L" }; //お題
		String[] word = new String[5]; //回答用
		String[] ans = { "×", "×", "×", "×", "×" }; //結果表示用
		boolean status = false; //△の判定に使う



			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + "文字目");
				Scanner scanner = new Scanner(System.in); //文字を受け取る
				word[i] = scanner.nextLine(); //入力された文字をwordに入れる

			}

			// 結果判定　位置も同じなら〇
			for (int i = 0; i < 5; i++) {
				if (word[i].equals(anser[i])) {
					ans[i] = "〇";

					//位置だけ違うなら△
				} else if (ans[i] != "〇") {
					for (int k = 0; k < 5; k++) {
						status = anser[k].equals(word[i]);
						if (status == true) {
							ans[i] = "△";
							break;
						}
					}
				}
			}
			System.out.println("あなたの回答：" + Arrays.toString(word));
			System.out.println("結果は " + Arrays.toString(ans));

		//↓　残骸　↓

		//とりあえずごり押しで
		//		//位置も同じなら〇
		//		if (word[0].equals(anser[0])) {
		//			ans[0] = "〇";
		//			//位置だけ違うなら△
		//		} else if (ans[0] != "〇") {
		//			for (int i = 0; i < 5; i++) {
		//				status = anser[i].equals(word[0]);
		//				if (status == true) {
		//					ans[0] = "△";
		//					break;
		//				}
		//			}
		//		}
		//
		//		if (word[1].equals(anser[1])) {
		//			ans[1] = "〇";
		//			//位置だけ違うなら△
		//		} else if (ans[1] != "〇") {
		//			for (int i = 0; i < 5; i++) {
		//				status = anser[i].equals(word[1]);
		//				if (status == true) {
		//					ans[1] = "△";
		//					break;
		//				}
		//			}
		//
		//		}
		//		//位置も同じなら〇
		//		if (word[2].equals(anser[2])) {
		//			ans[2] = "〇";
		//			//位置だけ違うなら△
		//		} else if (ans[2] != "〇") {
		//			for (int i = 0; i < 5; i++) {
		//				status = anser[i].equals(word[2]);
		//				if (status == true) {
		//					ans[2] = "△";
		//					break;
		//				}
		//			}
		//		}
		//		//位置も同じなら〇
		//		if (word[3].equals(anser[3])) {
		//			ans[3] = "〇";
		//			//位置だけ違うなら△
		//		} else if (ans[3] != "〇") {
		//			for (int i = 0; i < 5; i++) {
		//				status = anser[i].equals(word[3]);
		//				if (status == true) {
		//					ans[3] = "△";
		//					break;
		//				}
		//			}
		//		}
		//		//位置も同じなら〇
		//		if (word[4].equals(anser[4])) {
		//			ans[4] = "〇";
		//			//位置だけ違うなら△
		//		} else if (ans[4] != "〇") {
		//			for (int i = 0; i < 5; i++) {
		//				status = anser[i].equals(word[4]);
		//				if (status == true) {
		//					ans[4] = "△";
		//					break;
		//				}
		//			}
		//		}



		//		//たぶんforで回す…？
		//		for (int i = 0; i <= word.length; i++) { //配列の中身分回る
		//			for (int k = 0; k <= word.length; k++) { //もう一個forで回す
		//				if (word[i] == anser[k]) {
		//					System.out.print("〇");
		//				} else {
		//					System.out.print("×");
		//				}
		//			}
		//		}
	}
}