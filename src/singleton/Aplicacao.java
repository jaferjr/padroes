package singleton;

public class Aplicacao {

	public static void main(String[] args) {

		Logger log = Logger.getInstacia();
		
		log.setAtivo(true);
		log.log("PRIMEIRA MENSAGEM DE LOG");
		log.log("SEGUNDA MENSAGEM DE LOG");
		
	}

}
