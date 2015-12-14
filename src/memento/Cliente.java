package memento;

import java.util.Scanner;

public class Cliente {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Texto texto = new Texto();
		/*texto.escreverTexto("Primeira linha do texto\n");
		texto.escreverTexto("Segunda linha do texto\n");
		texto.escreverTexto("Terceira linha do texto\n");
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();*/
		System.out.println("Para apagar ultimo valor aperte x");
		System.out.println("Digite os valores:");
		sc = new Scanner(System.in);
		while (true) {
			String textoDigitado = sc.nextLine();
			texto.escreverTexto(textoDigitado);
			
			texto.mostrarTexto();
			if (textoDigitado.toCharArray()[0] == '=' && textoDigitado.toCharArray().length == 1) {
				return;
			}
		}
	}
	
}
