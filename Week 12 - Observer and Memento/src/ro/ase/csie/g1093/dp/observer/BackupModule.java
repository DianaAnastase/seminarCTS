package ro.ase.csie.g1093.dp.observer;

public class BackupModule implements ConnectionStatusInterface{

	@Override
	public void connectionUp() {
		System.out.println("Up");
		
	}

	@Override
	public void connectionDown() {
		System.out.println("Down");
		
	}

}
