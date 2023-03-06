public class MyClass {
	public static void exampleMethod() {
		System.out.println("Using a method outside main method");
	}

	public static void main(String[] args) {
		System.out.println("Using args from main method:");
		System.out.println("Hello world, my name is " + args[0] + "!");

		System.out.println("");
		System.out.println("For-each loop");
		// For-each loop
		for (String s : args) {
			System.out.println(s);
		}

		System.out.println("");
		System.out.println("Continue statement:");
		// Continue statemetn
		int[] numbers = {1, 2, 3, 4, 5};

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				continue; // If condition is met, will not execute the rest of the condition and it will
			}

			System.out.println(numbers[i]);
		}

		System.out.println("");
		System.out.println("Break statement:");
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				break; // If condition is met, will stop the loop at all
			}

			System.out.println(numbers[i]);
		}

		System.out.println("");
		System.out.println("Method outside main(String[] args):");
		// Using the exampleMethod

		exampleMethod();
	}
}