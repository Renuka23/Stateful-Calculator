package CalculatorProblem;

import java.util.Scanner;

public class DemoStatefulCalculator {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		StatefulCalculator state = new StatefulCalculator();
		printInstructions();

		boolean quit = false;
		int option = 0;
		while (!quit) {
			System.out.println("Enter your option: ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case 0:
				printInstructions();
				break;
			case 1:
				System.out.println("Enter a number");
				double number = input.nextDouble();
				state.add(number);
				state.result();
				break;
			case 2:
				System.out.println("Enter a number");
				number = input.nextDouble();
				state.sub(number);
				state.result();
				break;
			case 3:
				System.out.println("Enter a number");
				number = input.nextDouble();
				state.mul(number);
				state.result();
				break;
			case 4:
				System.out.println("Enter a number");
				number = input.nextDouble();
				state.div(number);
				state.result();
				break;
			case 5:
				System.out.println("Enter fileName: ");
				String fileName = input.next();
				state.saveStateToFile(fileName);
				break;
			case 6:
				state.listOperators();
				state.result();
				break;
			case 7:
				quit = true;
				break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice opions");
		System.out.println("\t 1 - To perform addition");
		System.out.println("\t 2 - To perform subtraction");
		System.out.println("\t 3 - To perform multiplication");
		System.out.println("\t 4 - To perform division");
		System.out.println("\t 5 - To print the results of operations from the operations ArrayList");
		System.out.println("\t 6 - To save state on file");
		System.out.println("\t 7 - To quit the application");
	}

}
