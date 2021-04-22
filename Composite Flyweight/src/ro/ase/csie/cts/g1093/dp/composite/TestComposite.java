package ro.ase.csie.cts.g1093.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		AbstractNode group1=new Group("Red Team");
		group1.addNode(new NPC("Soldier 1", 100));
		group1.addNode(new NPC("Soldier 2", 100));
		
		AbstractNode group2=new Group("Blue Team");
		group2.addNode(new NPC("Soldier 3", 100));
		group2.addNode(new NPC("Tank", 300));

		AbstractNode levelGroup=new Group("Level 2");
		levelGroup.addNode(new NPC("Level BOSS", 500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
	}

}
