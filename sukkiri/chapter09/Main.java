
public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		
		Hero h2 = new Hero();
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}
