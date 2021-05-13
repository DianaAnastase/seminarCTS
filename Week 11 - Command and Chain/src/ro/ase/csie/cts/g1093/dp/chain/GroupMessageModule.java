package ro.ase.csie.cts.g1093.dp.chain;

public class GroupMessageModule extends GenericMessageHandler{

	@Override
	public void processMeassage(Message message) {
		if(message.destination.toLowerCase().contentEquals("@everyone")) {
			System.out.println("Group message: " + message.text);
		}
		
		if(this.next != null) {
			this.next.processMeassage(message);
		}
	}

}
