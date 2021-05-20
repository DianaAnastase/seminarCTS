package ro.ase.csie.cts.g1093.testing.main;

import ro.ase.csie.g1093.testing.models.MathOperations;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("The app is running");
		
		int a=5;
		int b=6;
		int expecteResult=11;
		int actualResult= MathOperations.add(a,b);
		
		if(expecteResult==actualResult) {
			System.out.println("It works");
			
		}
		else {
			System.out.println("I need more math classes");
		}

	}

}
