import java.text.NumberFormat;
import java.util.Locale;

// Superclasse Pessoa
class Pessoa {
	public String nome;
	public String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	protected void imprimeNome() {
		System.out.println(this.nome);
	}
}

// Subclass Aluno que herda de pessoa os atributos nome e cpf, além do método imprimeNome
// Possui seu próprio membro matricula
class Aluno extends Pessoa {
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
	}

	public String matricula;

	// Substituindo o modificador de acesso do método imprimeNome() da superclasse
	// Pode-se apenas deixar com mais acesso, se tentar mudar para private ou sem modificador
	// gerará um erro um erro de compilação
	public void imprimeNome() {
		System.out.println(this.nome);
	}
}

// Subclass Professor que herda de pessoa os atributos nome e cpf, além do método imprimeNome
// Possui seus próprios membros salario e disciplina
class Professor extends Pessoa {
	Locale localeBR = new Locale("pt", "BR");
	NumberFormat dinheiroBR = NumberFormat.getCurrencyInstance(localeBR);

	public double salario;

	public Professor(String nome, String cpf, double salario) {
		// Deve estar na primeira linha
		super(nome, cpf); // Construtor de Professor utilizando o próprio construtor da superclasse
		this.salario = salario;
	}

	public void imprimeSalario() {
		System.out.println("Salário de : " + dinheiroBR.format(salario));
	}

	// Polimorfismo. Substituindo o método pai por um do filho
	public void imprimeNome() {
		System.out.println("Eu sou o professor " + this.nome); // Substituindo o método herdado
	}

	public void imprimeNomePessoa() {
		super.imprimeNome();
	}

	public String disciplina;
}

public class Heranca {
	public static void main(String[] args) {

		Pessoa pe = new Pessoa("Gui", "11111111111");
		Aluno a = new Aluno("Be", "00000000000");
		Professor pr = new Professor("Elias", "66666666666", 10000.57);

		pe.imprimeNome();
		a.imprimeNome(); // Herdando da superclass pessoa
		pr.imprimeNome(); // Sobrescrevendo a superclass
		pr.imprimeNomePessoa(); // Acessando o método da superclasse que foi sobescrito
		pr.imprimeSalario();

		a.matricula = "318064";
		imprimeMatricula(a);
		imprimeMatricula(pr);
	}

	public static void imprimeMatricula(Pessoa p) {
		if (p instanceof Aluno) {
			Aluno a = (Aluno) p; // Casting do objeto Pessoa para a o objeto Aluno
			// Caso o casting não seja feito, ele não encontraria o atributo matrícula
			// no objeto p
			System.out.println("A matrícula de " + a.nome + " é " + a.matricula);
		} else {
			System.out.println(p.nome + " não é Aluno");
		}
	}
}