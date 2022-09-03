package rensyu;
import java.util.Random;

public class Main0903 {

	public static void main(String[] args) {
		// チワワとポメラニアンのキメラを作ろう!
		
		Random rnd = new Random();
		char[] word = new char[7];
		
		int r = rnd.nextInt(5)+2; // 合計文字数はランダム　最低でも2文字
		for (int i = 0; i <= r; i++) { // forでランダム分ループ
			int c = rnd.nextInt(8);
			
			switch(c) {
			case 0:
				word[i] = 'チ';
				break;
			case 1:
				word[i] = 'ワ';
				break;
			case 2:
				word[i] = 'ポ';
				break;
			case 3:
				word[i] = 'メ';
				break;
			case 4:
				word[i] = 'ラ';
				break;
			case 5:
				word[i] = 'ニ';
				break;
			case 6:
				word[i] = 'ア';
				break;
			case 7:
				word[i] = 'ン';
				break;
			}	
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		

	}

}
