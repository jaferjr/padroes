package command;

public class JogadorClient {
	public static void main(String[] args) {
		
		Joystick joystick = new Joystick();
		joystick.executarComandoBotaoA(new BotaoA(), new JogoDeCorrida());
		joystick.executarComandoBotaoB(new BotaoB(), new JogoDeCorrida());

		joystick.executarComandoBotaoA(new BotaoA(), new JogoDeFutebol());
		joystick.executarComandoBotaoB(new BotaoB(), new JogoDeFutebol());

		joystick.executarComandoBotaoA(new BotaoA(), new JogoDeLuta());
		joystick.executarComandoBotaoB(new BotaoB(), new JogoDeLuta());
	}
}
