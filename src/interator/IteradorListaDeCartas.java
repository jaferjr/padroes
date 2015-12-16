package interator;

import java.util.ArrayList;

public class IteradorListaDeCartas implements IteradorInterface {

	protected ArrayList<Carta> cartas;
	protected Carta c;
	protected int contador;

	public IteradorListaDeCartas(ArrayList<Carta> c) {
		this.cartas = c;
		contador = 0;
	}

	public Carta proximo() {
		return cartas.get(contador++);
	}

	public Carta remover() {

		return cartas.remove(0);

	}

	public void colocarnoFinal(Carta c) {

		cartas.add(c);

	}

	public boolean estaVazia() {

		return cartas.isEmpty();
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return cartas.size();
	}

}
