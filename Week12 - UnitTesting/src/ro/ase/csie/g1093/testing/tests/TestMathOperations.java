package ro.ase.csie.g1093.testing.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.csie.g1093.testing.models.MathOperations;

class TestMathOperations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hello");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Bye");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Preparing the test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Cleaning after the test");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testAddNormalValues() {
		int a=5;
		int b=6;
		int expectedResult=11;
		int actualResult= MathOperations.add(a,b);
		
		assertEquals("Adding 5 and 6", expectedResult, actualResult);
	}

}
