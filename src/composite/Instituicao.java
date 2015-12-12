package composite;

import java.util.ArrayList;
import java.util.List;

public class Instituicao implements Participante{
	
	
	private String nome;
	private List<Participante> membrosDaInstituicao;
	private int tamanho;
	
	
	
	public Instituicao(String nome) {
		this.nome = nome;
		membrosDaInstituicao = new ArrayList<Participante>();
		tamanho = membrosDaInstituicao.size();
	}

	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public int getAssento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void adicionar(Participante participante) {
		membrosDaInstituicao.add(participante);
		tamanho++;
		
	}

	@Override
	public void remover(Participante participante) {
		
		for (Participante p : membrosDaInstituicao) {
			if(p.equals(participante)){
				membrosDaInstituicao.remove(participante);
			}
			
		}
		
	}


	@Override
	public int getTamanho() {
		return tamanho;
	}

	
	
	
	

}
