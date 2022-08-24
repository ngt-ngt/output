package main;

import java.util.Scanner;

import model.Pet;

/**
 * ペットを育てるゲーム（風）アプリ
 * @author 4A10
 *
 */
public class Game {

	public static void main(String[] args) {

		//TODO:　入力ハンドリング用の装置準備
		Scanner input = new Scanner(System.in);

		//TODO:　ゲームの説明を表示
		System.out.println("ペットを育てます。");
		System.out.println("ペットに名前をつけてください。");
		String name = input.nextLine();

		//TODO:　ペットの生成
		Pet p = new Pet(name);
		p.showProf();


		do {
			showSelection();
			int select = input.nextInt();

			//TODO:選択内容の実行
			//TODO:終了条件の確認

			if (!doAction(select, p)) {
				break;
			}
		} while (true);


		//TODO:　結果発表
		p.showProf();

	}


	/**
	 * 選択肢に応じた処理をします
	 * @param select　選択番号
	 * @param p　世話をするペットの名前
	 * @return　ループを繰り返す(世話を続ける)場合はtrue
	 */
	private static boolean doAction(int select, Pet p) {
		switch (select) {
		case 0: {
			p.doPley();
		}break;
		case 1: {
			p.doEat();
		}break;
		case 2: {
			p.doWork();
		}break;
		case 3: {
			p.doSleep();
		}break;
		case 9: {
			System.out.println(p.name + "を野に放ちました");
			System.out.println("野生でもたくましく生きていってね");
			System.out.println();
			p.fuck();
			return false;
		} //break;
		default: {
			System.out.println("選択肢の番号を選んでね");
			return true; //続ける
		} //break;
		}

		//今の状態を一言で
		p.sayMsg();


		//ペットに愛された場合は終了
		if( p.isLover() ) {
			System.out.println("…");
			System.out.println("……");
			System.out.println("………");
			System.out.println("なんかめちゃくちゃなつかれたみたいです");
			System.out.println("よかったね");
			System.out.println("～TRUE END～");
			return false; //終了
		}

		//ペットがくたびれきった場合も終了
		if( p.isTired() ) {
			System.out.println("…");
			System.out.println("……");
			System.out.println("………");
			System.out.println("疲れすぎたみたいです");
			System.out.println( p.name + "が倒れこんで動かなくなりました");
			System.out.println("+++ BAD END +++");
			return false; //終了
		}

		//賢くなりすぎたら終了
		if(p.isKashiko()) {
			System.out.println( p.name + "はとてもかしこくなりました");
			System.out.println("…");
			System.out.println("……");
			System.out.println("………");
			System.out.println( p.name + "「…」");
			System.out.println("ある日" +  p.name + "が去ってしまいました");
			System.out.println( "愚かな人類のペットでいることに耐えられなかったみたいですね");
			System.out.println("... BAD END ...");
			return false; //終了
		}
		return true;
	}



	/**
	 * ユーザーに選択肢を見せる
	 */
	private static void showSelection() {
		System.out.println("");
		System.out.println("なにをしますか？");
		System.out.println("-----------------");
		System.out.println("0：あそぶ");
		System.out.println("1：ごはん");
		System.out.println("2：しつけ");
		System.out.println("3：おやすみ");
		System.out.println("9：ペットを捨てる");
		System.out.println("-----------------");
	}

}
