public class Bicicleta {
	// Encapsulamento
	private int cadencia;
	private int marcha;
	private int velocidade;
	private static int quantidade; // Variável de classe, campo estático

	// Atribuindo valores iniciais dos atributos da classe Bicicleta ao criar um novo objeto
	public Bicicleta(int cadencia, int velocidadeInicial, int marchaInicial, int quantidadeInicial) {
		this.cadencia = cadencia; // Com sobreamento de campo
		marcha = marchaInicial; // Sem sombreamento de campo
		velocidade = velocidadeInicial;
		quantidade = quantidadeInicial;
	}

	// Construtor com valores default
	public Bicicleta() {
		marcha = 1;
		cadencia = 0;
		velocidade = 0;
		quantidade++;
	}

	// Getter para os atributos
	public int getCadencia() {
		return cadencia;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVelocidade() {
		return velocidade;
	}

	// Setter para os atributoss
	public void setCadencia(int novoValor) {
		cadencia = novoValor;
	}

	public void setMarcha(int novoValor) {
		marcha = novoValor;
	}

	// Métodos que modificam a velocidadade (não possui setter)
	public void freiar(int decremento) {
		velocidade -= decremento;
	}

	public void acelerar(int incremento) {
		velocidade += incremento;
	}

	// Método utilizando varargs para se receber um número arbitrário de argumentos
	public static int somarDistancias(int... distancias) {
		int soma = 0;

		for(int distancia : distancias) {
			soma += distancia;
		}

		return soma;
	}

	// Método para testar o que acontece quando utilizamos um método para alterar um atributo dentro de uma classe
	public static void incrementarAlgo(int x) {
		// o x passado aqui, independente de ser um valor ou uma variável, não terá sua referência
		// ele é passado byVal, não byRef
		x++;
		System.out.println("Valor da variável incrementada dentro da função: " + x);
	}

	// Método para se testar o retorno dele mesmo
	public static String returnInputLowerCase(String y) {
		return y.toLowerCase();
	}

	// Retorna o campo estático da classe
	public static int getQuantidade() {
		return quantidade;
	}
}