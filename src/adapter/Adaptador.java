package adapter;

import java.util.List;

public class Adaptador {	
	
	
	public int[] adaptando(List<Integer> list){
		
		int[] vetor = new int[list.size()];
		
		for(int i=0; i<list.size(); i++){
			vetor[i] = list.get(i);
		}
		return vetor;
	}

}
