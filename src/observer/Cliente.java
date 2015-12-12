package observer;

public class Cliente {

	public static void main(String[] args) {

		SistemaDeAlarme sistemaDeAlarme = new SistemaDeAlarme();

		sistemaDeAlarme.adicionaAcao(new Delegacia());
		sistemaDeAlarme.adicionaAcao(new CompanhiaDeSeguro());

		Alarme alarme = new Alarme();
		alarme.setAlarmeAcionado(false);

		sistemaDeAlarme.detectaAlarme(alarme);

	}

}
