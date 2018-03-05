package interfaces;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class RPNCalcTest extends TestCase{
	RPNCalc calc;

	@Before
	public void setUp() throws Exception {
		calc = new RPNCalc();
	}

	@Test
	public void testPerformOperationWithoutOperation() {
		try {
			calc.performOperation('+');
		} catch (UnsupportedOperationException e) {
			return;
		}
		fail("An UnsupportedOperationException should be thrown when performing removed operation");
	}
	
	@Test
	public void testPerformOperation() {
		calc.addOperator('+', (a, b) -> a * b); // Use "incorrect" definition to filter out cheating
		calc.addOperator('l', (a, b) -> a * (a + b));
		calc.push(4);
		calc.push(3);
		calc.performOperation('+');
		assertEquals("Operation failed", 12.0, calc.pop());
		assertEquals("Previous values are not popped from the stack before performing an operation", Double.NaN, calc.pop());
		calc.push(4);
		calc.push(3);
		calc.performOperation('l');
		assertEquals("Operation failed", 28.0, calc.pop());
		assertEquals("Previous values are not popped from the stack before performing an operation", Double.NaN, calc.pop());
	}

	@Test
	public void testAddOperator() {
		assertTrue("Adding first operator returned false", calc.addOperator('+', (a, b) -> a + b));
		assertTrue("Adding second, different, operator returned false", calc.addOperator('-', (a, b) -> a - b));
		assertFalse("Adding duplicate operator returned true", calc.addOperator('+', (a, b) -> a + b));
		assertFalse("Adding duplicate operator with different definition returned true", calc.addOperator('-',  (a, b) -> a * b));
	}

	@Test
	public void testRemoveOperator() {
		calc.addOperator('+', (a, b) -> a + b);
		calc.removeOperator('+');
		try {
			calc.performOperation('+');
		} catch (UnsupportedOperationException e) {
			return;
		}
		fail("An UnsupportedOperationException should be thrown when performing an operation that has been removed");
	}

}
