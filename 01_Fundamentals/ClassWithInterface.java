interface BicicletaInter {
	public void honk();
	public String getMarca();
	public double getPreco();
}

class Bicicleta implements BicicletaInter {
	private String marca;
	private double preco;

	public Bicicleta(String marcaPassada) {
		marca = marcaPassada;
		preco = 0;
	}

	public void honk() {
		System.out.println("HOOOOONK");
	}

	public String getMarca() {
		return marca;
	}

	public void setPreco(double x) {
		preco = x;
	}

	// public double getPreco() {
	// 	return preco;
	// }
}

class ClassWithInterface {
	public static void main(String[] args) {
		Bicicleta caloi = new Bicicleta("Caloi");
		
		caloi.honk();
		String minhaMarca = caloi.getMarca();
		System.out.println("Minha marca é: " + minhaMarca);

		caloi.setPreco(1000.5);
		// double valor = caloi.getPreco();
		// System.out.println("O preço é: " + valor);		
	}
}