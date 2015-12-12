package observer;

public class CompanhiaDeSeguro implements AcaoAposAlarmeDisparado {

	@Override
	public void executa(Alarme alarme) {

		if(alarme.isAlarmeAcionado()){
			System.out.println("companhia de seguro acionada!!");
		}else{
			System.out.println("companhia de seguro diz: tudo tranquilo");
		}
			
	}
	
	
	

}
