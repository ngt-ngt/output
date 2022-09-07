package scene;

import java.util.Scanner;

public class Scene {

	public void scene1() {
		System.out.println("〇ーキド博士「ここに3匹のポケモンがいるじゃろう」");

		System.out.println("[1:フシギダネ][2:ヒトカゲ][3:ゼニガメ]");
		Scanner scn = new Scanner(System.in);
		int select = scn.nextInt();

		System.out.println("オーキ〇博士「よし、お前にはヒトカゲをやろう」");
		// 選ばせてやるとは言ってない
	}

	public void scene2() {
		System.out.println("～～～ 突然の戦闘 ～～～");


	}
}