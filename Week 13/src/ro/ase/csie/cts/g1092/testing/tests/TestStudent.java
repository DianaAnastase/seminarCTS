package ro.ase.csie.cts.g1092.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1092.testing.models.Student;
import ro.ase.csie.cts.g1092.testing.models.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.models.exceptions.WrongGradeException;
import ro.ase.csie.cts.g1092.testing.models.exceptions.WrongNameException;

public class TestStudent {
	
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName="John Doe";
	static int initialAge= 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		grades.add(9);
		grades.add(10);
		grades.add(8);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades=null;
	}

	@Before
	public void setUp() throws Exception {
		student =  new Student(initialName, initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
	}
	
    @Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException {
		
		
		String newName = "John Doe";
		student.setName(newName);
		assertEquals("Testing with a proper name", newName, student.getName());
	}
	
	@Test
	public void testSetAgeConformanceForRightInput() {
		int newAge=initialAge +1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with right values", newAge, student.getAge());
		} catch (WrongAgeException e) {
			// TODO Auto-generated catch block
			fail("We got an exception for right data");
		}
	}
	
	@Test
	public void testGetGradesAverage() {
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i=6; i<10; i++) {
			grades.add(i);
		}
		float expectedAverage = 7.5f;
		float computedAverage = student.getGradesAverage();
		
		
		
		assertEquals("testing with sorted array of grades", expectedAverage, computedAverage);
	}
	
	@Test
	public void testGetGradesAverageCardinalityZero() {
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i=6; i<10; i++) {
			grades.add(i);
		}
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		
		
		assertEquals("Testing an empty array of grades", expectedAverage, computedAverage, 0);
	}
	
	@Test
	public void testGetGradesAverageCardinalityOne() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(Student.MAX_GRADE);
		student.setGrades(grades);
		float expectedAverage = Student.MAX_GRADE;
		float computedAverage = student.getGradesAverage();
		
		
		
		assertEquals("Testing an empty array of grades", expectedAverage, computedAverage, 0);
	}
	
	@Test
	public void testGetGradesAverageExistanceNullReferenceForGrades() throws WrongGradeException {
		student.setGrades(null);
		
		float expectedAverage =0;
		float computedAverage=student.getGradesAverage();
		
		assertEquals("Testing with null grades", expectedAverage, computedAverage, 0);
	}

}
