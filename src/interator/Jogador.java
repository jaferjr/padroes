package interator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Jogador implements AgregadoCartas{
	 
    protected IteradorInterface iterador;
 
    public Jogador() {
    	
    	
    }

	public IteradorInterface criarIterator(int tipointerador) {
		
		Random gerador = new Random();
		
		
		switch(tipointerador){
		
			case 1: { 
				ArrayList cartas = new ArrayList<Carta>();
				for (int i = 0; i < 20; i++) { 
					cartas.add(new Carta(1 + (int)(Math.random()* 5) ));
				}
				iterador = new IteradorListaDeCartas(cartas);
				break;
			}
			
			case 2: {
				Stack<Carta> cartas = new Stack<Carta>();
		    	for (int i = 0; i < 20; i++) { 
		    		 cartas.add(new Carta(1 + (int)(Math.random()* 5)));
		    	}
				iterador = new IteradorPilhaDeCartas(cartas);
				break;
			}
		
		}
		
		 return iterador;
	}
}