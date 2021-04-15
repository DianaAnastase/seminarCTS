package ro.ase.cts.g1093.dp.adapter;

public abstract class ACMECharacter {
	
	protected String name;
	protected int lifepoints;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifepoints() {
		return lifepoints;
	}
	public void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}
	public ACMECharacter(String name, int lifepoints) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
	}
	
	public abstract void move();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
	

}
