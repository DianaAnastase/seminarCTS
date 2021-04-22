package ro.ase.csie.ase.g1093.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		ScreenData soldier1= new ScreenData(100, 100, 0, "Soldier 1");
		ScreenData soldier2= new ScreenData(100, 50, 0, "Soldier 2");
		
		ScreenData building1= new ScreenData(10, 10, 5, "Building 1");
		ScreenData building2= new ScreenData(20, 50, 5, "Building 2");
		
		
		Model3DInterface soldierModel= ModelsFactory.getModel(ModelType.SOLDIER);
		soldierModel.display(soldier1);
		soldierModel.display(soldier2);
		
		ModelsFactory.getModel(ModelType.BUILDING).display(building1);
		ModelsFactory.getModel(ModelType.BUILDING).display(building2);

	}

}
