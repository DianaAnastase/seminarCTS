package ro.ase.csie.cts.g1092.testing.models;
import java.util.ArrayList;

import ro.ase.csie.cts.g1092.testing.models.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.models.exceptions.WrongGradeException;
import ro.ase.csie.cts.g1092.testing.models.exceptions.WrongNameException;


public class Student {
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	public static final int MIN_GRADE = 1;
	public static final int MAX_GRADE = 10;
	public static final int MIN_NAME_SIZE = 3;
	public static final int MAX_NAME_SIZE = 255;
	
	protected String name;
	protected int age;
	protected ArrayList<Integer> grades;
	
	
	public Student(String name, int age, ArrayList<Integer> grades) {
		super();
		this.name = name;
		this.age = age;
		this.grades = grades;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) throws WrongNameException {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws WrongAgeException{
		this.age = age;
	}


	public void setGrades(ArrayList<Integer> grades) throws WrongGradeException {
		this.grades = grades;
	}
	
	
	public int getGrade(int index) {
		return this.grades.get(index);
	}
	
	public int getNoGrades() {
		return this.grades.size();
	}
	

	public float getGradesAverage() {
		int sum = 0;
		for(int grade : this.grades) {
			sum += grade;
		}
		return sum/this.grades.size();
		
	}
	}
	

