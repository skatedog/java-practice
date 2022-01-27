public class Main{
	public static void main(String[] args) {
		introduceOneself();
		email("テストメール", "a@a", "テストです");
		email("b@b", "テスト2です");
		System.out.println(calcTriangleArea(10.0, 5.0));
		System.out.println(calcCircleArea(5.0));
	}
	
	// 練習 5-1
	public static void introduceOneself() {
		String name = "hoge";
		int age = 20;
		double height = 175.0;
		char eto = '寅';
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);
		System.out.println("身長:" + height);
		System.out.println("干支:" + eto);
	}

	// 練習 5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	// 練習 5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);		
	}
	
	// 練習 5-4
	public static double calcTriangleArea(double bottom, double height) {
		double value = bottom * height / 2;
		return value;
	}
	
	public static double calcCircleArea(double radius) {
		double value = 3.14 * radius * radius;
		return value;
	}
}