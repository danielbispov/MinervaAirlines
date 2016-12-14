
public class Piloto extends Funcionario implements Controle {
	private int habilidade;
	private String destino;
	private double velocidade_aviao;
	
	public Piloto(String nome, int idade, int registro, double salario) {
		this.set_dados(nome, idade);
		this.set_registro(registro);
		this.set_salario(salario);
	}
	
	public void direcionar_aviao(String destino) {
		this.set_destino(destino);
	}
	
	public void aumentar_velocidade(double velocidade) {
		this.set_velocidade_aviao(velocidade);
	}

	public void declara_funcao() {
		System.out.println("Eu sou um piloto de habilidade " + this.get_habilidade());
	}
	
	public double set_bonus(int horas_voo) {
		double bonus = this.get_salario() * (horas_voo/2);
		return bonus;
	}
	
	public String get_destino() {
		return destino;
	}

	public void set_destino(String destino) {
		this.destino = destino;
	}

	public double get_velocidade_aviao() {
		return velocidade_aviao;
	}

	public void set_velocidade_aviao(double velocidade_aviao) {
		this.velocidade_aviao = velocidade_aviao;
	}
	
	public int get_habilidade() {
		return habilidade;
	}

	public void set_habilidade(int habilidade) {
		this.habilidade = habilidade;
	}
}
