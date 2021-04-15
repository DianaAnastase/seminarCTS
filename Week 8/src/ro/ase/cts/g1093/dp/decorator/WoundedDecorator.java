package ro.ase.cts.g1093.dp.decorator;

import ro.ase.cts.g1093.dp.adapter.ACMECharacter;

public class WoundedDecorator extends ACMEAbstractDecorator{
	
	public final static int MIN_POINTS = 200;
	
	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		if(this.character.getLifepoints() <MIN_POINTS) {
			System.out.println("You can't move. Critically wounded");
		}
		else
			this.character.move();
	}

	
	

}
