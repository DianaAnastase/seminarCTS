package ro.ase.cts.g1093.dp.decorator;

import ro.ase.cts.g1093.dp.adapter.ACMECharacter;

public class ArmorDecorator extends ACMEAbstractDecorator {
	int armorLevel;

	public ArmorDecorator(ACMECharacter hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void takeAHit(int points) {
		int losePoints= points - armorLevel;
		if(losePoints > 0) {
			this.character.takeAHit(losePoints);
		}
		super.takeAHit(points);
	}
	
	
	

}
