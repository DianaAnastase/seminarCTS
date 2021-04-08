package FactoryMethod;

import ro.ase.csie.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.g1093.dp.factory.simple.Bazooka;
import ro.ase.csie.g1093.dp.factory.simple.MachineGun;
import ro.ase.csie.g1093.dp.factory.simple.Pistol;
import ro.ase.csie.g1093.dp.factory.simple.WeaponType;

public abstract class KidsWeaponFactory extends AbstractWeaponFactory{
	public staticAbstractWeapon getWeapon(WeaponType type, String color) {
	AbstractWeapon weapon=null;
	switch(type) {
	case PISTOL:
		weapon= new Pistol(color, 100);
		break;
	case MACHINEGUN:
		weapon= new MachineGun(color);
		break;
	case BAZOOKA:
		weapon= new Bazooka(color, 1000, 500);
		break;
	default:
		throw new UnsupportedOperationException();
	}

	return weapon;

}
	
}
