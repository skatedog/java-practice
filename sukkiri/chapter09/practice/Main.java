
public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		
		System.out.println("初期値");
		System.out.println(baseHp + ":" + t.hp);
		
		heal(baseHp);
		System.out.println("baseHpを増やした場合");
		System.out.println(baseHp + ":" + t.hp);
		
		heal(t);
		System.out.println("インスタンスを引数にした場合");
		System.out.println(baseHp + ":" + t.hp);
	}
}
