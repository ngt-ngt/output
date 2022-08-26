package koburon;

public class Talk {
	int cnt = 0; // 叩いた回数をカウント

	// 選択
	public boolean doAction(int select) {
		Talk t = new Talk();
		switch (select) {
		case 0: {
			cnt++;
			System.out.println("> たたく");
			return t.doHit(cnt);
		}
		case 1: {
			System.out.println("> たたかない");
			System.out.println("やさしさ。");
			return false;
		}
		default:{
			System.out.println("選択肢の番号じゃないよ");
			return true;
		}
		}
	}



	// 選択肢を見せる
	public void showSelection() {
		System.out.println("");
		System.out.println("どうしようかな");
		System.out.println("0：たたく");
		System.out.println("1：たたかない");
	}

	// 選択肢の前に出るセリフ
	public void doSay() {
		System.out.println();
		System.out.println("コブロン▼");

		if(cnt <= 2) {
			System.out.println("「フニャ！　ぼく　コブロン！！");
			System.out.println("　ストンストン村は　今日も　いい天気！");
			System.out.println("　もちろん　きのうも");
			System.out.println("　いい天気だったよ！」"); 	// 元気
		}else if(cnt <= 4){
			System.out.println("「フニャ～　ぼく　コブロン！");
			System.out.println("　ストンストン村は　今日も　いい天気！");
			System.out.println("　あしたも　あさっても");
			System.out.println("　きっと　いい天気なのさ！」"); 	// まだ元気
		}else if(cnt == 5) {
			System.out.println("「フニャ～　ぼく　コブロン…かな？");
			System.out.println("　ストンストン村は　今日も　いい天気…たぶん！」");
			System.out.println("「ところで　キミ　ダレだっけ？");
			System.out.println("　なんだか　さいきん　ものわすれが");
			System.out.println("　ひどくなったような　気がするんだ」"); 	// だめになってきた
		}else if(cnt == 6) {
			System.out.println("「フニャニャ～");
			System.out.println("　ぼくは　コブロン…だったかな？");
			System.out.println("　なんだか　さいきん　ものわすれが");
			System.out.println("　ひどくなったような気がするんだ");
			System.out.println("　今日　あさごはん　たべたっけ？」"); 	// だめそう
		}else if(cnt == 7) {
			System.out.println("「フ～ニャニャ　フ～ニャ");
			System.out.println("　ニャ～フ　ニャ～フ　ニャフ～ン♪」"); 	// たいへんだ
		}
	}


	// 叩いたときのセリフ　回数で変化
	public boolean doHit(int cnt) {
		System.out.println("ﾎﾟｶﾝ!");
		System.out.println("コブロン▼");

		if (cnt <= 6) {
			System.out.println("「フニャ～");
			System.out.println("　たたかないでよ～」");
			System.out.println("> タンコブをGET");
			return true;

		} else if (cnt == 7) { 		// 死！
			System.out.println("「フニャニャニャ～");
			System.out.println("　も　もう　ダメだ～～」");
			System.out.println("「さよな…ら」");
			System.out.println("> タンコブをGET");
		}  return false;

	}


}
