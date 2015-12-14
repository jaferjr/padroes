package command;

public class BotaoA implements BotaoCommand{
	public void processarComando(String acao, String tipoDoJogo){
		System.out.println("Ação: " + acao + "\nNome do Jogo: " + tipoDoJogo);
	}
}
