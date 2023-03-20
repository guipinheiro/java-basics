public class OOP {
	public static void main(String[] args) {
		// Criando um objeto a partir da classe Bicicleta localizada no arquivo Bicicleta.java
		Bicicleta minhaBicicleta = new Bicicleta(30, 0, 8);

		System.out.println("Velocidade é " + minhaBicicleta.getVelocidade());
		System.out.println("Cadência é " + minhaBicicleta.getCadencia());
		System.out.println("Marcha é " + minhaBicicleta.getMarcha());

		System.out.println("");

		// Criando um objeto utilizando os valores default do construtor que não é passado parâmetros
		Bicicleta minhaBicicletaDefault = new Bicicleta();

		System.out.println("Velocidade default é " + minhaBicicletaDefault.getVelocidade());
		System.out.println("Cadência default é " + minhaBicicletaDefault.getCadencia());
		System.out.println("Marcha default é " + minhaBicicletaDefault.getMarcha());

		System.out.println("");

		// Utilizando varargs
		System.out.println("varargs:");
		System.out.println("Distância total foi de " + minhaBicicletaDefault.somarDistancias(10, 20, 30, 40) + " metros.");

		System.out.println("");

		// Comportamento de variáveis do tipo Tipo Primitivo
		int y = 10;
		System.out.println("Comportamento de variáveis do tipo Tipo Primitivo:");
		System.out.println("Valor da variável antes de passar pelo método: " + y);
		minhaBicicletaDefault.incrementarAlgo(y);
		System.out.println("Valor da variável depois de passar pelo método: " + y); // Valor inalterado

		System.out.println("");

		// Comportamento de variáveis do tipo Tipo Referência
		System.out.println("Comportamento de variáveis do tipo Tipo Referenciado:");
		Bicicleta bicicletaRef = new Bicicleta();
		System.out.println("bicicletaRef.getMarcha() antes da função alterar(): " + bicicletaRef.getMarcha());
		alterar(bicicletaRef);
		System.out.println("bicicletaRef.getMarcha() depois da função alterar(): " + bicicletaRef.getMarcha());
	}

	// Função para alterar a marcha de um objeto bicicleta
	public static void alterar(Bicicleta o) {
		o.setMarcha(5);
		System.out.println("o.getMarcha() dentro da função alterar(): " + o.getMarcha());
	}
}