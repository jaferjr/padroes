package chain;


public class Cliente {
	
	public static void main(String[] args) {
		
		
		Produto refrigerante = new Produto("big-big", 0.5);		
		Maquina maquina = new Maquina();		
		maquina.entregarProduto(refrigerante);	
		
	}
			

}
