
public class Chapter08 {
	public static void main(String[] args) {
		// while文
		int number1 = 1;
		while (number1 < 50) {
			number1 *= 2;
			System.out.println("number1 = " + number1);
		}
		
		// do while文
		int number2 = 1;
		do {
			number2 *= 2;
			System.out.println("number2 = " + number2);
		} while (number2 < 50);
		
		// for文
		for (int number3 = 1; number3 <= 5; number3++) {
			System.out.println("number3 = " + number3);
		}
		
		// 拡張for文
		int[] array = { 1, 2, 3, 4, 5 };
		for (int n : array) {
			System.out.println(n);
		}
		
		// break文 ループ処理を終了させる
		for (int i = 1; i < 5; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
		
		// continue文 ループ処理をスキップさせる
		for (int i = 1; i < 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
		
		// 確認問題
		int i = 1;
		while (i < 5) {
			System.out.println(i * i);
			i++;
		}
		
		int[] array1 = { 1, 2, 3, 4, 5 };
		for (int i2 = 0; i2 < array1.length; i2++) {
			System.out.println(array1[i2]);
		}
		
		for (int val: array1) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
