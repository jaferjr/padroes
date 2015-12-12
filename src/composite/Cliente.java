package composite;

public class Cliente {

	public static void main(String[] args) {

		Participante uece = new Instituicao("uece");
		uece.adicionar(new Individuo("João", 5));
		uece.adicionar(new Individuo("Raimundo", 6));
		uece.adicionar(new Individuo("Ari", 9));
		uece.adicionar(new Individuo("José", 30));
		uece.adicionar(new Individuo("Davi", 8));
		
		Congresso congresso = new Congresso("Congresso pela vida", 30);
		congresso.adicionarParticipante(new Individuo("Maria", 2));
		congresso.adicionarParticipante(uece);
		
		congresso.imprimeParticipantes();
		
		
		System.out.println(congresso.getTotalParticipantes());

	}
}
