
public class Chapter07 {
	public static void main(String[] args) {
		// if文
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は5未満です。");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です。");
		}
		
		// else if文
		if (number < 5) {
			System.out.println(number + "は5未満です。");
		} else if (number < 10) {
			System.out.println(number + "は5以上10未満です。");
		} else {
			System.out.println(number + "は10以上です。");
		}
		
		// switch文
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました。");
			break;
		case 2:
			System.out.println("ふつうでした。");
			break;
		default:
			System.out.println("がんばろう。");
		}
		
		// 確認問題
		// 問題1
		int i = 100;
		
		if (i <= 5) {
			System.out.println("とても近いです");
		} else if (i <= 10) {
			System.out.println("近いです");
		} else if (i <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		// 問題2
		String color = "blue";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
