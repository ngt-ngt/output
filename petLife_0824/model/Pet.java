package model;
import java.util.Random;

public class Pet {
	Random rand = new Random();


	/**
	 * ペットの名前
	 */
	public String name;

	/**
	 * かしこさ
	 */
	int wise;

	/**
	 * こうかん度
	 */
	int love;

	/**
	 * くたびれ度
	 */
	int tire;

	/**
	 * 呼び出しと共にペットに名前をつける
	 * @param name
	 */
	public Pet(String name) {
		this.name = name;

	}
	//今のままだと起動しないので後でなんか出来たらいいな
	public Pet() {
		this("名前なし太郎");
	}


	/**
	 * 現在の状態を表示
	 */
	public void showProf() {
		System.out.println("[なまえ] " + this.name);
		System.out.println("[かしこさ]" + this.wise);
		System.out.println("[なつき度]" + this.love);
		System.out.println("[しんどさ]" + this.tire);

	}
	/**
	 * あそぶ
	 */
	public void doPley() {
		System.out.println("> あそんであげました");
		this.wise += 1;
		this.love += 5;
		this.tire += 8;
		System.out.println("：");
		System.out.println("喜んでいる…");
	}

	public void doEat() {
		System.out.println("> ごはんをあげよう");
		this.wise += 1;
		this.love += 5;
		this.tire += 1;
		System.out.println("：");
		System.out.println("結構なついたみたいです");
	}

	public void doWork() {
		System.out.println("> しつけてやるぞ");
		this.wise += 5;
		this.love -= 5;
		this.tire += 5;
		System.out.println("：");
		System.out.println("結構嫌われたみたいですね");

	}
	public void doSleep() {
		System.out.println("> 寝ろ！");
		this.wise += 2;
		this.love += 2;
		this.tire -= 5;
		System.out.println("：");
		System.out.println("疲れが少し取れました");

	}

	/**
	 * 好感度判定
	 * @return 基準値を超えていたらtrue
	 */
	public boolean isLover() {
		return this.love >= 80;
	}
	/**
	 * 疲労度判定
	 * @return 基準値を超えていたらtrue
	 */
	public boolean isTired() {
		return this.tire >= 80;
	}
	/**
	 * かしこさ判定
	 * @return 基準値を超えていたらtrue
	 */
	public boolean isKashiko() {
		return this.wise >= 200; //超賢い&そこまで人間が好きじゃない
	}

	/**
	 * 現状について何か一言
	 */
	public void sayMsg() {
		if( this.tire > 70) {
			System.out.println(this.name + " 「ほんとに死ぬよ？」"); //かわいそう
		} else if( this.tire > 60) {
			System.out.println(this.name + " 「そろそろ死にます」");
		} else if( this.tire > 30) {
			System.out.println(this.name + "「ちょっとしんどい…」");
		}
		if ( this.love > 60) {
			System.out.println(this.name + " 「すきー」"); //かわいい
		} else if (this.love > 40) {
			System.out.println(this.name + " 「ふつうにすきー」");
		} else if (this.love > 20) {
			System.out.println(this.name + " 「んー…」");
		} else if (this.love < 1) {
			System.out.println(this.name + "「きらい！！」 "); // loveが0以下
		}

		if (this.wise > 150 && this.love < 50) {	// 賢いし人間が好きじゃない
			System.out.println(this.name + " 「愚かな人類よ…」");
		} else if ( this.wise > 50) {
			System.out.println(this.name + " 「有り余るかしこさを感じる…」");
		}else if(this.wise > 20){
			System.out.println(this.name + " 「かしこくなってきた気がする」");
		}

	}

	/**
	 * ペットを捨てたとき
	 */
	public void fuck() {
		//ランダムで暴言（？）吐いてもらう
		int bougen = rand.nextInt(4);

		switch (bougen) {
		case 0: {
			System.out.println(this.name +"「人間のやることじゃないよ…」");
		}break;
		case 1: {
			System.out.println(this.name +"「ひどくない？」");
		}break;
		case 2: {
			System.out.println(this.name +"「なんで？」");
		}break;
		case 3: {
			System.out.println(this.name +"「こんなことある？」");
		}
		}
		// 好感度で何か追加する
		if (this.love > 60) {
			System.out.println(this.name +"「人間のこと信じてたのに…」"); //なつかれてた
		}else if(this.love < 5) {
			System.out.println(this.name +"「人間なんか大嫌い！」"); //全然なついてない
		}else if(this.tire > 60) {
			System.out.println(this.name +"「でも解放されてよかった…」"); //めちゃくちゃに疲れている
		}
		System.out.println("+++ END +++"); //おわり
}

}
