interface BicicletaInter {
	// Todos os métodos da interface são implicitamente do tipo public

	// Abstract
	String getMarca();
	double getPreco();

	// Static methods
	static void honk() {
		System.out.println("HOOOOONK");
	}

	// Default methods
	default void getRodas() {
		System.out.println("A bicicleta possui 2 rodas.");
	}

	default void getPedais() {
		System.out.println("A bicicleta possui 2 pedais.");
	}

	// Variáveis adicionadas aqui são automaticamente consideradas public static final (constantes)
	double PI = 3.141592;



}

class Bicicleta implements BicicletaInter {
	private String marca;
	private double preco;
	private int rodas;

	public Bicicleta(String marcaPassada) {
		marca = marcaPassada;
		preco = 0;
		rodas = 2;
	}

	// Sobrescrevendo o método abstrato get marcha. Necessário que seja sobrescrito
	@Override
	public String getMarca() {
		return marca;
	}

	public void setPreco(double x) {
		preco = x;
	}

	// Se removido, resultará em erro, pois a interface exige que seus métodos abstratos
	//  estejam sobrescritos na classe em que ela é implementada
	@Override
	public double getPreco() {
		return preco;
	}

	public void setRodas (int n) {
		rodas = n;
	}

	// Sobrescrevendo o método padrão da interface
	@Override
	public void getRodas() {
		if (rodas != 2) {
			System.out.println("Na verdade, minha bicicleta possui " + rodas + " rodas.");	
		} else {
			System.out.println("A bicicleta possui 2 rodas.");
		}
	}	
}

public class ClassWithInterface {
	public static void main(String[] args) {
		// Utilizando o método estático da interface
		System.out.println("Método estático da interface:");
		BicicletaInter.honk(); // Não pode ser utilizado pelo objeto instanciado
		System.out.println("");

		// Estanciando a classe com interface
		Bicicleta caloi = new Bicicleta("Caloi");

		// Utilizando métodos abstratos que foram sobescritos
		System.out.println("Métodos abstratos da interface que foram sobrescritos");
		String minhaMarca = caloi.getMarca();
		System.out.println("Minha marca é: " + minhaMarca);

		caloi.setPreco(1000.5);
		double valor = caloi.getPreco();
		System.out.println("O preço é: " + valor);
		System.out.println("");

		// Utilizando método padrão do objeto
		System.out.println("Método padrão da interface:");
		caloi.getPedais();
		System.out.println("");
		System.out.println("Sobrescrevendo o método padrão da interface:");
		caloi.setRodas(3);
		caloi.getRodas();
		System.out.println("");

		// Utilizando a constante da interface
		System.out.println("Utilizando constantes da interface:");
		// Pode-se utilizar tanto caloi.PI quanto BicicletaInter.PI;
		System.out.println("Se dividirmos o perímetro da roda da bicicleta pelo seu diâmetro teremos: " + caloi.PI);
	}
}