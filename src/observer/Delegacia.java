package observer;

public class Delegacia implements AcaoAposAlarmeDisparado {

	@Override
	public void executa(Alarme alarme) {
		if( alarme.isAlarmeAcionado()){
			System.out.println("polícia a caminho!!");
		}else{
			System.out.println("delegacia diz: tudo tranquilo");
		}
		
	}
	
	

}
