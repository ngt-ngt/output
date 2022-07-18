package test;
import java.util.Random;
import java.util.Scanner;

public class Janken {
	public static void main(String[] arg) {
		//入力の受け取りができるように
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("じゃんけんをします。次のいずれかを入力してください。");
		System.out.println("0:グー 1:チョキ 2:パー");
		
		//整数なのでnextInt
		int userHand = scanner.nextInt();
		String[] hand = {"グー","チョキ","パー"};
		

		//0,1,2 以外の場合は止める　while文のcontinueでやり直させる方がスマートだとは思うが今はこれで行く
		if ((userHand == 0) || (userHand == 1) || (userHand == 2)){
			System.out.println("あなたの手：" + hand[userHand]);
		}else {
			System.out.println("0,1,2のいずれかで入力してください。");
			return;
		}
		
		//CPUの手　乱数は0から始まるので3で指定する
		Random rand = new Random();
		int cpuHand = rand.nextInt(3);
		System.out.println("CPUの手：" + hand[cpuHand]);
		
		String result = judgeJanken(userHand,cpuHand);
		
		showResult(userHand,cpuHand,result);
	}
	
	
	
	
		//判定 judge
	public static String judgeJanken(int userHand, int cpuHand) {
		String result ="";
		if ((userHand ==0 && cpuHand ==1) || (userHand ==1 && cpuHand ==2) || (userHand ==2 && cpuHand ==0)) {
			result = "勝ち！";
		} else if ((userHand ==0 && cpuHand ==2) || (userHand ==1 && cpuHand ==0) || (userHand ==2 && cpuHand ==1)) {
			result = "負け";
		} else {
			result = "引き分け";
		}
		return result;
	}
	
		//結果
	public static void showResult(int userHand, int cpuHand, String result) {

		System.out.println("結果:" + result);
	}
	

}
