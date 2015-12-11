package chain;

import java.util.List;


public class Maquina {
	
	private static double valor;	
	private List<Produto> produtos;
	
	public void adicionaProdutos(Produto produto){
		produtos.add(produto);
		
	}
	
	public static double somaValor(Moeda m) {
		return valor =+ m.getValor();
		
	}
	
	public void calcula(Moeda m){
		
		
	}
		
	
	
	

}
