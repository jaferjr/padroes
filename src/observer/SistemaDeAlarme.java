package observer;

import java.util.ArrayList;
import java.util.List;


public class SistemaDeAlarme {
	
	private List<AcaoAposAlarmeDisparado> todasAsAcoes;
	
	public SistemaDeAlarme(){
		todasAsAcoes = new ArrayList<>();
	}
	
	public void adicionaAcao(AcaoAposAlarmeDisparado acao){
		todasAsAcoes.add(acao);
	}
	
	public void detectaAlarme(Alarme alarme){

		
		
		
		for (AcaoAposAlarmeDisparado acao : todasAsAcoes) {			
			acao.executa(alarme);
		}
	}
	
	
	

}
