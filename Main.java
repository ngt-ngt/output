package omikuji;

public class Main {

	public static void main(String[] args) {

		System.out.println("おみくじを引く:1  引かない:2　イカ:3");
		int s = new java.util.Scanner(System.in).nextInt();

		if (s == 1) {

			int r = new java.util.Random().nextInt(100);
			System.out.println("数字：" + r);

			if (r > 90) {
				System.out.println("大吉～～～～～～～～");
			} else if (r > 60) {
				System.out.println("中吉");
			} else if (r > 20) {
				System.out.println("小吉");
			} else {
				System.out.println("凶  明日死ぬ");
			}

		} else if (s == 2) {
			System.out.println("あなたはおみくじを引きませんでした");
		} else if (s == 3) {
			System.out.println("くコ:彡 ｲｶ");
		} else {
			System.out.println("番号が違うよ");
		}

	}
}
