package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	public void callBefore() {
		System.out.println("called before");
	}
	
	@AfterEach
	public void callAfter() {
		System.out.println("called after");
	}
	
	@Test
	void testAdd() {
		assertEquals(20, new Calculator().add(10, 10));
	}

	@Test
	void testMultiply() {
		assertEquals(100, new Calculator().multiply(10, 10));
	}

}
