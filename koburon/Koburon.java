package koburon;

import java.util.Scanner;

public class Koburon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Talk t = new Talk();


		// 叩く?
		do {
			t.doSay(); // セリフ表示
			t.showSelection(); // 選択肢表示
			int select = scn.nextInt();	 // 値受け取り

			if( !t.doAction ( select ) ) { 	// doActionがfalseなら終了
				break;
			}

		} while (true); // たたかない選択をするかコブロンが死ぬまでループ

		System.out.println("... END ...");
	}



}
