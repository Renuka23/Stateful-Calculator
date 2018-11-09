package CalculatorProblem;

import java.util.ArrayList;
import java.util.Iterator;

public class StatefulCalculator {

	double result = 0;

	static ArrayList<String> operations = new ArrayList<String>();

	public static ArrayList<String> getOperations() {
		return operations;
	}

	Calculator calc = new Calculator();

	public double add(double a) {
		result = calc.add(a, result);
		operations.add(Double.toString(result));
		return result;
	}

	public double sub(double a) {
		result = calc.sub(a, result);
		operations.add(Double.toString(result));
		return result;
	}

	public double mul(double a) {
		result = calc.mul(a, result);
		operations.add(Double.toString(result));
		return result;
	}

	public double div(double a) {
		result = calc.div(result, a);
		operations.add(Double.toString(result));
		return result;
	}

	ArrayList<String> listOperators() {
		System.out.println("Display results of the previous operations: " + operations.size());
		for (int i = 0; i <= operations.size(); i++) {
			System.out.println(operations.get(i));
		}
		return operations;
	}

	public double result() {
		return result;
	}

	public void alertOnCondition(String fileName) {
		System.out.println(operations.indexOf(fileName));
	}

	public void saveStateToFile(String fileName) {
		Iterator<String> i = operations.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
