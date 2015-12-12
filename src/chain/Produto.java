package chain;

public class Produto {
	
	private double valor;
	private String nome;

	public Produto(String nome, double valor){
		this.nome = nome;
		this.valor = valor;
		
	}

	public double getValor() {
		return valor;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome();
	}

	public String getNome() {
		return nome;
	}
	

}
