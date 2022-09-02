package rensyu;

public class Main0902 {

	public static void main(String[] args) {
		// 復習
		// バブルソート

		int[] array = { 21, 40, 3, 5, 34, 50 };
		boolean flag = true;

		// flagがtrueの間ループ
		while (flag) {
			flag = false; // 最初にfalseへ変更しておく
			
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					int box = array[i];
					array[i] = array[i - 1];
					array[i - 1] = box;
					
					flag = true; //交換が1度でも行われたらtrueに
				}

			}
		} // 1度も交換せずにfalseのままなら終了

		// 配列の中身確認
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}

	}

}
