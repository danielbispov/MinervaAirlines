
public class Copiloto extends Funcionario implements Comunicacao{
	private int habilidade;
	
	public Copiloto(String nome, int idade, int registro, double salario) {
		this.set_dados(nome, idade);
		this.set_registro(registro);
		this.set_salario(salario);
	}
	
	public void comunica_torre(int caso) {
		if (caso == 1)
			System.out.println("Comunico pouso do avião na pista deste aeroporto");
		else if (caso == 2)
			System.out.println("Comunico decolagem do avião partindo deste aeroporto");
		else 
			System.out.println("Comando inexistente");
	}
	
	public void auxiliar_piloto() {
		System.out.println("Piloto, não durma! Pega um cafezinho ai!");
	}

	public void declara_funcao() {
		System.out.println("Eu sou um copiloto de habilidade " + this.get_habilidade());
	}
	
	public double set_bonus(int horas_voo) {
		double bonus = this.get_salario() * (horas_voo/4);
		return bonus;
	}
	
	public int get_habilidade() {
		return habilidade;
	}

	public void set_habilidade(int habilidade) {
		this.habilidade = habilidade;
	}
}
