public class OOP {
	public static void main(String[] args) {
		// Criando um objeto a partir da classe Bicicleta localizada no arquivo Bicicleta.java
		Bicicleta minhaBicicleta = new Bicicleta(30, 0, 8, 72);

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

		System.out.println("");

		// Retornando uma variável através de um método
		System.out.println("Retornando um valor de um método:");
		String upper = "STRING ORIGINALMENTE EM MAIÚSCULO";
		String lower = minhaBicicleta.returnInputLowerCase(upper);
		System.out.println("Nova string em minúsculo: " + lower);

		System.out.println("");

		// Retornando uma variável de classe (campo estático)
		System.out.println("Campos Estático de uma classe:");		
		int quantidadeAtual = Bicicleta.getQuantidade();
		System.out.println("Quantidade de objetos bicicletas: " + quantidadeAtual);		

		System.out.println("");

		// Campo enum
		System.out.println("Tipo de campo enum:");
		Dia d = Dia.DOMINGO;
		if (d == Dia.DOMINGO) {
			System.out.println("É domingo!");
		}
		System.out.println("A abreviação do dia de hoje é: " + d.getAbreviacao());
		System.out.println("Dias disponíveis dentro do enum Dia:");
		for (Dia e : Dia.values()) {
			System.out.println(e.getAbreviacao());
		}

		System.out.println("");

		// Classes estáticas 2
		System.out.println("Classes estáticas 2:");
		C myC1 = new C();
		C myC2 = new C();
		myC1.a = 10;
		myC2.b = 20;
		myC1.metodo();
		myC2.metodo();
	}

	// Função para alterar a marcha de um objeto bicicleta
	public static void alterar(Bicicleta o) {
		o.setMarcha(5);
		System.out.println("o.getMarcha() dentro da função alterar(): " + o.getMarcha());
	}

	// Class tipo enum
	public enum Dia {
		DOMINGO("Dom"), SEGUNDA("Seg"), TERÇA("Ter"), QUARTA("Qua"), QUINTA("Qui"), SEXTA("Sex"), SÁBADO("Sab");

		private String abreviacao;

		Dia(String abreviacao) {
			this.abreviacao = abreviacao;
		}

		public String getAbreviacao() {
			return abreviacao;
		}
	}

	// Classe estática 2

	static class C {
		static int a; // classe estática de C
		int b;
		void metodo() {
			System.out.println(String.format("%d %d", a, b));
		}
	}
}