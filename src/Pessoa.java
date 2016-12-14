
public abstract class Pessoa {
	private String nome;
	private int idade; 
	
	public String get_dados() {
		return "Meu nome é " + this.nome + ", e minha idade é " + this.idade + "\n";
	}
	
	public void set_dados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
