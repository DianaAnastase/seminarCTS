package ro.ase.csie.g1093.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		ServerConnectionModule connection = new ServerConnectionModule();
		
		BackupModule backup = new BackupModule();
		UserNotificationModule notifications = new UserNotificationModule();
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);
		
		connection.register(notifications);
		connection.register(backup);
		
		connection.unregister(backup);
		
		connection.detectConnectionStatusChange(ConnectionStatus.UP);

	}

}
