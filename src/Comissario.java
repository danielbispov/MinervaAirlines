
public class Comissario extends Funcionario implements Dispensa {
	private int items_dispensa = 15;
	
	public Comissario(String nome, int idade, int registro, double salario) {
		this.set_dados(nome, idade);
		this.set_registro(registro);
		this.set_salario(salario);
	}
	
	public double set_bonus() {
		double bonus = this.get_salario() * 0.1;
		return bonus;
	}
	
	public void declara_funcao() {
		System.out.println("Eu sou o comissário(a) e minha função é instruir e servir os passageiros");
	}
	
	public void ver_items() {
		if (items_dispensa < 8) {
			System.out.println("A dispensa precisa ser reabastecida");
		} else {
			System.out.println("A dispensa está em ordem");
		}
	}
	
	public void reabastecer_dispensa() {
		System.out.println("Dispensa reabastecida");
		this.set_items_dispensa(15);
	}
	
	public void servir_lanche() {
		if (this.get_items_dispensa() > 8) {
			System.out.println("Lanche servido");
			this.set_items_dispensa(this.get_items_dispensa() - 8);
		} else {
			System.out.println("Sem items suficientes para servir lanche");
		}
	}

	public int get_items_dispensa() {
		return items_dispensa;
	}
	
	public void set_items_dispensa(int items_dispensa) {
		this.items_dispensa = items_dispensa;
	}
}
