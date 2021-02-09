import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	@Test
	/*
	 * TestCases for Addition
	 */
	public void testAdd() {
		
		Operations o = new Operations();
		assertEquals(o,o.add(15,35));
		assertEquals(o,o.add(39, -9));
		assertEquals(o,o.add(-85, -59));
	}
	
	@Test
	/*
	 * Test Cases for Division
	 */
	public void testDiv() {
		Operations o = new Operations();
		assertEquals(o,o.div(20, 5));
		assertEquals(o,o.div(0, 0));
		assertEquals(o,o.div(15, 0));
		assertEquals(o,o.div(99,11));
	}

	@Test
	/*
	 * Test Cases for Multiplication
	 */
	public void testMul() {
		Operations o = new Operations();
		assertEquals(o,o.mul(15,3));
		assertEquals(o,o.mul(-3,4));
		assertEquals(o,o.mul(-2,-7));
	}
}