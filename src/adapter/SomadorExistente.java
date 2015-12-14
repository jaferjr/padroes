package adapter;

import java.util.List;

public class SomadorExistente implements SomadorEsperado {

	private List<Integer> lista;

	public int somaLista(List<Integer> lista) {
		this.lista = lista;
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}

	@Override
	public int somaVetor(int[] vetor) {
		
		int total =0;
		for(int i=0; i<= vetor.length; i++){
			total = total + vetor[i];
		}
		
		return total;
	}
}
