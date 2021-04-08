package FactoryMethod;

import ro.ase.csie.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.g1093.dp.factory.simple.Pistol;
import ro.ase.csie.g1093.dp.factory.simple.WeaponType;

public class TestFactoryWeapon {

	public static void main(String[] args) {
		boolean isWaterModeSet = true;
		if(isWaterModeSet) {
			AbstractWeapon pistol= new WaterPistol("grey", 200);
		}
		else{
			AbstractWeapon pistol= new Pistol("grey", 200);
		}
		
		AbstractWeaponFactory theFactory =null;
		theFactory = (isWaterModeSet) ? new KidsWeaponFactory() : new RealModeFactory();
		
		AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");

	}
	
	
	


}
