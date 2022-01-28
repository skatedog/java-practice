
public class Hero {
	String name;
	int hp;
	Sword sword;
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	public Hero() {
		this("ダミー");
	}
	
	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}
