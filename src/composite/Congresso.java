package composite;

import java.util.ArrayList;
import java.util.List;

public class Congresso {

	public String nome;
	public int totalAssentos;
	public List<Participante> participantes;
	private int totalParticipantes;

	public Congresso(String nome, int totalAssentos) {
		this.nome = nome;
		this.totalAssentos = totalAssentos;
		this.participantes = new ArrayList<Participante>();
		
	}
	
	public void setTotalDeParticipantes(Participante participante){
		this.totalParticipantes = totalParticipantes + participante.getTamanho();
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void adicionarParticipante(Participante participante) {
		if (totalParticipantes <= totalAssentos) {
			participantes.add(participante);
			setTotalDeParticipantes(participante);
		} else {
			System.out.println("Não há mais lugares");
		}
	}

	public void imprimeParticipantes() {
		
	}

}
