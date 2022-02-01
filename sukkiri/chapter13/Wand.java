
public class Wand {
	private String name;
	private double power;
	
	public String getName() { return this.name; }
	public double getPower() { return this.power; }
	
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が異常です");
		} else {
			this.name = name;
		}
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("増幅率が異常です");
		} else {
			this.power = power;			
		}
	}
}
