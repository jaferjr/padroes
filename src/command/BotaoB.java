package command;

public class BotaoB implements BotaoCommand{
	public void processarComando(String acao, String tipoDoJogo){
		System.out.println("Ação: " + acao + "\nNome do Jogo: " + tipoDoJogo);
	}
}
