package chain;

import java.util.Scanner;

public class Maquina {

	private double valor;
	
	

	public double entregarProduto(Produto produto) {

		Scanner input = new Scanner(System.in);
		double valorInserido =0;
		while (valor < produto.getValor()) {

			System.out.println("Insira uma moeda de 1, 5 ou 10 centavos");			
			valorInserido =  Double.parseDouble(input.nextLine());
			
			valor = valor + calculaValor(valorInserido);
			System.out.println("Valor inserido R$ " + valor);

		}
		
		double troco = valor - produto.getValor();
		System.out.println("voce comprou o " + produto +"e o seu troco é de R$" + troco);

		input.close();

		return troco;
	}

	public double getValor() {
		return valor;
	}
	
	

	public void somaValor(double valor) {
		this.valor =+ valor;
	}

	public double calculaValor(double m) {

		SlotChain s1 = new SlotDeUm();
		SlotChain s2 = new SlotDeCinco();
		SlotChain s3 = new SlotDeDez();
		SlotChain s4 = new SlotInvalido();

		s1.setProximo(s2);
		s2.setProximo(s3);
		s3.setProximo(s4);

		return s1.insereNoSlot(m);

	}

}
