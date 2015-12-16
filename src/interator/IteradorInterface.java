package interator;

public interface IteradorInterface {

	    Carta proximo();
	    Carta remover();
	    void colocarnoFinal(Carta c);
	    boolean estaVazia();
	    int tamanho();
	    
	}
