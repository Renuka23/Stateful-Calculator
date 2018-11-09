package CalculatorProblem;

/*	1.Create a calculator supporting add, multiply, divide and subtract.  
2.Add JUnit for above.
3.Create a statefulCalculator that support #1 and also maintains state of the calculator 
	and state of the various operations that was called on the calculator instance.
4.Add a method that lists the calculator operations, 
	and a method to return the calculation at any point of time
5.Add a method saveStateToFile to save the state and operations performed to file.
6. Write a method that prints the calculation to the screen whenever the calculated value
	reaches certain value (say > 100).
7. Write Unit tests for StatefulCalculator
8. Write DemoCalculatorTester to test the calculator.

Tips:
1. Can use object orientation concepts, instance variables, collections, threads, IO,
	Exception handling and JUnit.
2. Stateful operation: CalculatorInstance that shows the latest calculated result
	in the display when the calculator is operated up on. 
*/

public class Calculator implements OperationsInterface {

	public double add(double a, double b) {
		return (a + b);
	}

	public double sub(double a, double b) {
		return (a - b);
	}

	public double mul(double a, double b) {
		return (a * b);
	}

	public double div(double a, double b) {
		return (a / b);
	}

}
