public abstract class Funcionario extends Pessoa{
	private int registro;
	private double salario;
	
	public void set_registro(int registro) {
		this.registro = registro;
	}
	
	public int get_registro() {
		return this.registro;
	}
	
	public double get_salario() {
		return salario;
	}

	public void set_salario(double salario) {
		this.salario = salario;
	}

	public double set_bonus() {
		double bonus = this.salario * 0.2;
		return bonus;
	}

	public void declara_funcao() {
		System.out.println("Eu sou um funcionário");
	}
	
	
}
