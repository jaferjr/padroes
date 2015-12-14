package command;

public class Joystick {
	public void executarComandoBotaoA(BotaoCommand botaoCommand, Jogo jogo) {
		botaoCommand.processarComando(jogo.getAcaoA(), jogo.getClass().getSimpleName());
	}
	public void executarComandoBotaoB(BotaoCommand botaoCommand, Jogo jogo) {
		botaoCommand.processarComando(jogo.getAcaoB(), jogo.getClass().getSimpleName());
	}
}
