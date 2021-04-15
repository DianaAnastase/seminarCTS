package ro.ase.cts.g1093.dp.adapter;

public class DonaldDuck implements DisneyActions{
	
	String name;
	int powerLevel;

	public DonaldDuck(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getPowerLevel() {
		// TODO Auto-generated method stub
		return this.powerLevel;
	}

	@Override
	public void losePower(int power) {
		System.out.println(String.format("%s takes a hit of %d points", name, power));
		this.powerLevel -= power;
		
	}

	@Override
	public void recoverPower(int power) {
		System.out.println(String.format("%s heals %d points", name, power));
		this.powerLevel += power;
		
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Moving to new coordinates");
		
	}

}
