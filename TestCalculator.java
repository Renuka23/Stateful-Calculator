package CalculatorProblem;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

class TestCalculator extends TestCase{

	void test() {
		Calculator test = new Calculator();
		double resultadd=test.add(3,4);
		assertEquals(7,7);
		
		double resultSub= test.sub(3,4);
		assertEquals(-1, -1);
		
		double resultMul=test.mul(3,4);
		assertEquals(12,12);
		
		double resultDiv=test.div(4,3);
		assertEquals(1,1);
		
	}

}  
