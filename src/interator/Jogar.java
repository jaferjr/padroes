package interator;


public class Jogar {

	public static void main(String[] args) {

		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();

		j1.criarIterator(1);
		j2.criarIterator(2);

		while (true) {

			Carta c1 = j1.iterador.remover();
			Carta c2 = j2.iterador.remover();
			
			System.out.println("Carta do Jogador 1: " + c1.valorCarta);
			System.out.println("Carta do Jogador 2: " + c2.valorCarta);
			System.out.println();

			if (c1.valorCarta == c2.valorCarta) {

				j1.iterador.colocarnoFinal(c1);
				j2.iterador.colocarnoFinal(c2);

			} else if (c1.valorCarta > c2.valorCarta) {

				j2.iterador.colocarnoFinal(c2);
				j2.iterador.colocarnoFinal(c1);
				j1.iterador.remover();
			} else {

				j1.iterador.colocarnoFinal(c2);
				j1.iterador.colocarnoFinal(c1);
				j2.iterador.remover();
			}
			
			if(j1.iterador.estaVazia()){
				System.out.println("Jogador 01 ganhou!");break;
			}else if(j2.iterador.estaVazia()) {
				System.out.println("Jogador 02 ganhou!");break;
			}else{
				System.out.println("J 1 tem" + j1.iterador.tamanho());
				System.out.println("J 2 tem" + j2.iterador.tamanho());
			}

		}

	}
}