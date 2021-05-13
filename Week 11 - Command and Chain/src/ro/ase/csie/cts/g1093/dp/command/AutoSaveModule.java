package ro.ase.csie.cts.g1093.dp.command;

public class AutoSaveModule implements GameModuleInterface{
	
	int frequency;

	public AutoSaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}

	@Override
	public void dotheTask(String task) {
		System.out.println("Autosaving for " + task);
		
	}
	
	

}
