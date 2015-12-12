package composite;

public class Individuo implements Participante{
	
	private int assento;
	private String nome;
	public static int tamanho = 1;
	
	
	public Individuo(String nome, int assento) {
		this.assento = assento;
		this.nome = nome;
	}

	
	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public int getAssento() {

		return this.assento;
	}

	@Override
	public void adicionar(Participante participante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Participante participante) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int getTamanho() {
		return tamanho;
	}
	
	

}
