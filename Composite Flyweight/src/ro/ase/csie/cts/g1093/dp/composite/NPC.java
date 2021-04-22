package ro.ase.csie.cts.g1093.dp.composite;

public class NPC extends AbstractNode{
	
	String name;
	int powerLevel;
	
	public NPC(String name, int power) {
		this.name=name;
		this.powerLevel=power;
	}
	
	

	@Override
	public void addNode(AbstractNode node) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void deleteNode(AbstractNode node) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void attack(String playerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		
	}

}
