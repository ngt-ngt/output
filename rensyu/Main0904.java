package rensyu;
import java.util.Random;

public class Main0904 {

	public static void main(String[] args) {
		// チワワとポメラニアンのキメラを作ろう!（改）
		
		Random rnd = new Random();
		int[] word = new int[7];
		int r = rnd.nextInt(5)+2; // 合計文字数はランダム　最低でも2文字
		
		for (int i = 0; i <= r; i++) {
			word[i] = rnd.nextInt(7);
		}		
		
		char[] dog = {'チ','ワ','ポ','メ','ラ','ニ','ア','ン'};
		for (int i = 0; i <= r; i++) { 
		System.out.print(dog[word[i]]);
		}

	}

}
