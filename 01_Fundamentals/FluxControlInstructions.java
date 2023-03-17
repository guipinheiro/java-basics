public class FluxControlInstructions {
	public static void main(String[] args) {
		// User input
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		// if-elseif-else
		System.out.println("1. If-elseif-else cases:");
		if (a > b) { // needs curly brackets, because it has more than one instruction
			System.out.println("if selected");
			System.out.println("a > b");
		} else if (a < b)
			System.out.println("else-if selected: a > b"); // no need of curly brackets, only one instruction
		else {
			System.out.println("else-if selected: a = b"); // can include curly brackets with only one instruction
		}
		System.out.println("");

		// Switch case (only works with primitive classes)
		System.out.println("2. Switch case");
		int mes = 1;
		String mesString;
		switch (mes) {
			case 1: mesString = "Janeiro";
				break;
			case 2: mesString = "Fevereiro";
				break;
			case 3: mesString = "Março";
				break;
			case 4: mesString = "Abril";
				break;
			default: mesString = "Mês inválido";
				break; //caso não inclua o break, o switch não vai parar de avaliar até encontrar o primeiro break
		}
		System.out.println(mesString);

		System.out.println("");
		System.out.println("3. Loops (specifically for-each");
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int n : numbers) {
			System.out.println(n);
		}

	}
}