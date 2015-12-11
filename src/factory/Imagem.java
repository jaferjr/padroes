package factory;

public abstract class Imagem {
	
	protected String tipo;
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void carregar(){
		System.out.println("Imagem "+ tipo +":");
		System.out.println("Carregando imagem "+ tipo +"...");
	}
	public void exibir(){
		System.out.println("Exibindo imagem por 20 segundos");
	}
	public void fechar(){
		System.out.println("Fechando imagem");
		
	}

}
