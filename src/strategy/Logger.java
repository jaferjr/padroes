package strategy;


public class Logger {
	
	private boolean ativo = false;
	private String l;
	LoggerStrategy strategia;
	
	public Logger(){};

	public boolean isAtivo(){
	return this.ativo;
	}
	
	public void setAtivo(boolean b){
	this.ativo =b;
	}
		
	public void log (int tipodepersistencia, String s){	
		this.l=s;
		if(this.ativo)System.out.println();
		
	  switch(tipodepersistencia){
	  case 1: strategia = new EventViewer();
	          strategia.Gravarlog(this.l);
	          System.out.println("LOG::"+s+"Salvo em GravarEmEventViwe");break;
	  
	  case 2: strategia = new ArquivoSystem() ;
	  		  strategia.Gravarlog(this.l);
	  		  System.out.println("LOG::"+s+"Salvo em Arquivo");;break;
      
	  case 3: strategia = new LoggerdataBase() ;
	  		  strategia.Gravarlog(this.l);
	  		  System.out.println("LOG::"+s+"Salvo em Banco de dados");;break;
	  }
		
	}
	
}
