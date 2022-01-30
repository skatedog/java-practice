
public class Main {
	public static void main(String[] args) {
		Dancer d = new Dancer();
		d.dance();
		Matango m = new Matango();
		d.attack(m);
		System.out.println(m.hp);
	}
}
