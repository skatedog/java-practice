
public class Chapter05 {
	public static void main(String[] args) {
		String string1;
		
		string1 = "あいう";
		System.out.println(string1 + "の文字数" + string1.length());
		
		string1 = "";
		System.out.println(string1 + "の文字数" + string1.length());
		
//		string1 = null;
//		System.out.println(string1 + "の文字数" + string1.length());
		
		int[] array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		
		int[] array2 = new int[] { 10, 20, 30 };
		int[] array3 = { 10, 20, 30 };
		
		System.out.println(array1[0]);
		System.out.println(array2[1]);
		System.out.println(array3[2]);
		
		long l = 123456789L;
		System.out.println(l);
		double d = 3.14;
		System.out.println(d);
		boolean b = true;
		System.out.println(b);
		
		Integer i = 100;
		System.out.println(i);
		Float f = 1.4142f;
		System.out.println(f);
		Character c = 'あ';
		System.out.println(c);
		
		int[] array4 = { 0, 1, 2, 3, 4 };
		System.out.println(array4[3]);
	}
}
