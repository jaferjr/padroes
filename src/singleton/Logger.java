package singleton;

public class Logger {
	
	private static Logger instancia;
	
	//Construtor privado para garantir que nenhuma outra classe possa instanciar o Logger
	private Logger(){}
	
	public static Logger getInstacia(){
		if (instancia == null){
			instancia = new Logger();
		}
		return instancia;
	}
	
	private boolean ativo = false;
	
	public void setAtivo(boolean b){
		this.ativo = b;
		
	}
	
	public void log(String s){
		if(this.ativo){
			System.out.println("LOG ::" + s);
		}
			
	}
	
	

}
