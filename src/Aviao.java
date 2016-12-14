
public class Aviao {
	private Piloto piloto;
	private Copiloto copiloto;
	private Comissario[] comissario;
	private Passageiro[] passageiros;
	
	public Aviao(Piloto piloto, Copiloto copiloto, Comissario[] comissario, Passageiro[] passageiros) {
		this.set_piloto(piloto);
		this.set_copiloto(copiloto);
		this.set_comissario(comissario);
		this.set_passageiros(passageiros);
	}
	
	public void decolar() {
		if (this.verifica_requisitos())
			System.out.println("Sucesso na decolagem, o avião estava apto a decolar");
		else
			System.out.println("Falha na decolagem, o avião não estava apto a decolar");
	}
	
	public boolean verifica_requisitos() {
		if (this.piloto != null && this.comissario != null && this.passageiros != null)
			return true;
		else
			return false;
	}

	public Piloto get_piloto() {
		return piloto;
	}

	public void set_piloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Copiloto get_copiloto() {
		return copiloto;
	}

	public void set_copiloto(Copiloto copiloto) {
		this.copiloto = copiloto;
	}

	public Comissario[] get_comissario() {
		return this.comissario;
	}

	public void set_comissario(Comissario[] comissario) {
		this.comissario = comissario;
	}

	public Passageiro[] get_passageiros() {
		return passageiros;
	}

	public void set_passageiros(Passageiro[] passageiros) {
		this.passageiros = passageiros;
	}
	
	
}
