package koburon;

public class Talk {
	Timer time = new Timer();
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
			time.waitTime(2000);
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
		time.waitTime(2000);
		System.out.println("");
		System.out.println("どうしようかな");
		System.out.println("0：たたく");
		System.out.println("1：たたかない");
	}

	// 選択肢の前に出るセリフ
	public void doSay() {
		time.waitTime(2000);
		System.out.println();
		System.out.println("コブロン▼");

		if(cnt <= 2) {
			System.out.println("「フニャ！　ぼく　コブロン！！");
			time.waitTime(1500);
			System.out.println("　ストンストン村は　今日も　いい天気！");
			time.waitTime(1500);
			System.out.println("　もちろん　きのうも");
			time.waitTime(1500);
			System.out.println("　いい天気だったよ！」"); 	// 元気
		}else if(cnt <= 4){
			System.out.println("「フニャ～　ぼく　コブロン！");
			time.waitTime(1500);
			System.out.println("　ストンストン村は　今日も　いい天気！");
			time.waitTime(1500);
			System.out.println("　あしたも　あさっても");
			time.waitTime(1500);
			System.out.println("　きっと　いい天気なのさ！」"); 	// まだ元気
		}else if(cnt == 5) {
			System.out.println("「フニャ～　ぼく　コブロン…かな？");
			time.waitTime(1500);
			System.out.println("　ストンストン村は　今日も　いい天気…たぶん！」");
			time.waitTime(2000);
			System.out.println("「ところで　キミ　ダレだっけ？");
			time.waitTime(1500);
			System.out.println("　なんだか　さいきん　ものわすれが");
			time.waitTime(1500);
			System.out.println("　ひどくなったような　気がするんだ」"); 	// だめになってきた
		}else if(cnt == 6) {
			System.out.println("「フニャニャ～");
			time.waitTime(1500);
			System.out.println("　ぼくは　コブロン…だったかな？");
			time.waitTime(1500);
			System.out.println("　なんだか　さいきん　ものわすれが");
			time.waitTime(1500);
			System.out.println("　ひどくなったような気がするんだ");
			time.waitTime(1500);
			System.out.println("　今日　あさごはん　たべたっけ？」"); 	// だめそう
		}else if(cnt == 7) {
			System.out.println("「フ～ニャニャ　フ～ニャ");
			System.out.println("　ニャ～フ　ニャ～フ　ニャフ～ン♪」"); 	// たいへんだ
		}
	}


	// 叩いたときのセリフ　回数で変化
	public boolean doHit(int cnt) {
		time.waitTime(2000);
		System.out.println("ﾎﾟｶﾝ!");
		time.waitTime(1000);
		System.out.println("コブロン▼");

		if (cnt <= 7) {
			System.out.println("「フニャ～");
			time.waitTime(1500);
			System.out.println("　たたかないでよ～」");
			time.waitTime(2500);
			System.out.println("> タンコブをGET");
			return true;

		} else if (cnt == 8) { 		// 死！
			System.out.println("「フニャニャニャ～");
			time.waitTime(3000);
			System.out.println("　も　もう　ダメだ～～」");
			time.waitTime(3000);
			System.out.println("「さよな…ら」");
			time.waitTime(3000);
			System.out.println("> タンコブをGET");
		}  return false;

	}


}
