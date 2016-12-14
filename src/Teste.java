
public class Teste {
	
	public static void main(String[] args) {
		Piloto piloto = new Piloto("João", 40, 123, 4000);
		Copiloto copiloto = new Copiloto("Bernardo", 55, 124, 2800);
		Comissario comis_1 = new Comissario("Teresa", 36, 125, 2200);
		Comissario comis_2 = new Comissario("Jonas", 32, 126, 2200);
		Passageiro pas_1 = new Passageiro("Elsa", 28, "Rio de Janeiro", "5a"); 
		Passageiro pas_2 = new Passageiro("Matias", 30, "Rio de Janeiro", "5b");
		
		Comissario[] comissarios = {comis_1, comis_2};
		Passageiro[] passageiros = {pas_1, pas_2};
		
		Aviao aviao = new Aviao(piloto, copiloto, comissarios, passageiros);
		
		aviao.decolar();
		
		piloto.set_habilidade(9);
		piloto.declara_funcao();
		piloto.direcionar_aviao("Rio de Janeiro");
		System.out.println("O destino atual é: " + piloto.get_destino());
		piloto.aumentar_velocidade(800);
		System.out.println("A velocidade atual é, em km/h: " + piloto.get_velocidade_aviao());
		
		System.out.println("\n");
		copiloto.set_habilidade(8);
		copiloto.declara_funcao();
		copiloto.auxiliar_piloto();
		copiloto.comunica_torre(1);
		copiloto.comunica_torre(2);
		
		System.out.println("\n");
		comis_1.declara_funcao();
		comis_1.servir_lanche();
		comis_1.ver_items();
		comis_1.reabastecer_dispensa();
		comis_1.servir_lanche();
		
		System.out.println("\n");
		pas_1.declarar_funcao();
		
	}
	
}
