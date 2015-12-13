package strategy;


public class Aplicacao {

	LoggerStrategy x;
	
	public static void main(String[] args) {
		
		Logger log1 = new Logger();
		log1.setAtivo(true);
		log1.log(1,"PRIMEIRA MENSAGEM DE LOG");
		log1.log(2,"PRIMEIRA MENSAGEM DE LOG");
		log1.log(3,"PRIMEIRA MENSAGEM DE LOG");
		
	
	
	
	}

}
