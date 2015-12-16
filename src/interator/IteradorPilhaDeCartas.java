package interator;

import java.util.Stack;

public class IteradorPilhaDeCartas implements IteradorInterface {

	protected Stack<Carta> cartas;
	protected Carta c;
	protected int contador;

	public IteradorPilhaDeCartas(Stack<Carta> c) {
		this.cartas = c;
		contador = 0;
	}

	public Carta proximo() {
		return cartas.peek();
	}

	public Carta remover() {

		return cartas.pop();

	}

	public void colocarnoFinal(Carta c) {

		cartas.push(c);

	}

	public boolean estaVazia() {

		return cartas.empty();
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return cartas.size();
	}

}
