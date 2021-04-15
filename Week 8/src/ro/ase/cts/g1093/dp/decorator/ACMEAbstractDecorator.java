package ro.ase.cts.g1093.dp.decorator;

import ro.ase.cts.g1093.dp.adapter.ACMECharacter;

public abstract class ACMEAbstractDecorator extends ACMECharacter {
	
	public ACMEAbstractDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifepoints());
		this.character=hero;
	}

	ACMECharacter character = null;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLifepoints() {
		// TODO Auto-generated method stub
		return this.character.getLifepoints();
	}


	
	

}
