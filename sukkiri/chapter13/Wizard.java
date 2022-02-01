
public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	
	public int getHp() { return this.hp; }
	public int getMp() { return this.mp; }
	public String getName() { return this.name; }
	public Wand getWand() { return this.wand; }
	
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;			
		}
	}
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("mpの値がマイナスです");
		} else {
			this.mp = mp;
		}
	}
	public void setName(String name) { this.name = name; }
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("Wandがnullです");
		} else {
			this.wand = wand;
		}
	}
}
