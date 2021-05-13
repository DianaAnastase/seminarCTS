package ro.ase.csie.cts.g1093.dp.chain;

public class PrivateMessageModule extends GenericMessageHandler{

	@Override
	public void processMeassage(Message message) {
		if(!message.destination.toLowerCase().contentEquals("@everyone")) {
			System.out.println("Private message for " + message.destination + ": " + message.text);
		}
		
		else {
			if(this.next != null) {
				this.next.processMeassage(message);
			}
		}
	}

}
