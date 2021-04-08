package Facade;

public class TestFacade {

	public static void main(String[] args) {
		GameServer server= new GameServer();
		
		Login login= new Login("player1", "1234");
		login.login();
		
		UserProfile userProfile= login.getUserProfile();
		
		String profile = userProfile.getProfile();
	}

}
