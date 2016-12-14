public class Passageiro extends Pessoa {
	private String passagem_destino;
	private String assento;
	
	public Passageiro(String nome, int idade, String destino, String assento) {
		this.set_dados(nome, idade);
		this.set_passagem_destino(destino);
		this.set_assento(assento);
	}
	
	public void declarar_funcao() {
		System.out.println("Sou passageiro com destino a(o) " + this.passagem_destino + ", meu assento é o " + this.assento);
	}
	
	public String get_passagem_destino() {
		return passagem_destino;
	}
	public void set_passagem_destino(String passagem_destino) {
		this.passagem_destino = passagem_destino;
	}
	public String get_assento() {
		return assento;
	}
	public void set_assento(String assento) {
		this.assento = assento;
	}
}
