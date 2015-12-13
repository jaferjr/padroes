package adapter;

import java.util.List;

public class SomadorExistente {

	
	private int[] adapta(List<Integer> list){
		int[] listaInt = new int[list.size()];
		for(int i=0; i<=list.size(); i++){
			listaInt[i]= list.get(i);
		}
		return listaInt;
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
