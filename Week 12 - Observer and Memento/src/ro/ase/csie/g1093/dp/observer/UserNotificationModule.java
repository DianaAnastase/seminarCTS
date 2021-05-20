package ro.ase.csie.g1093.dp.observer;

public class UserNotificationModule implements ConnectionStatusInterface{

	@Override
	public void connectionUp() {
		System.out.println("Connection is up");
		
	}

	@Override
	public void connectionDown() {
		System.out.println("Connection is down");
		
	}

}
