package ro.ase.csie.g1093.dp.factory.simple;

public abstract class AbstractWeapon {
	String color;
	int power;
	
	
	
	public AbstractWeapon(String color, int power) {
		super();
		this.color = color;
		this.power = power;
	}



	public AbstractWeapon(String color2) {
		// TODO Auto-generated constructor stub
	}



	public abstract void pewPew();

}
