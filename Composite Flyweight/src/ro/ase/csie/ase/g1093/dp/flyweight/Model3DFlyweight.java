package ro.ase.csie.ase.g1093.dp.flyweight;

import java.util.ArrayList;

public class Model3DFlyweight implements Model3DInterface{
	
	String name;
	ArrayList<Integer> points = new ArrayList<>();

	public Model3DFlyweight(String string) {
		// TODO Auto-generated constructor stub
	}
	
	public static Model3DInterface getModel(ModelType type) {
		return this.type.toString();
	}

	@Override
	public void display(ScreenData screenDetails) {
		System.out.println(String.format("Displaying %s at %d, %d, %d with color %s", name, screenDetails.x, screenDetails.y,
				screenDetails.z, screenDetails.textureColor));
		
	}

}
