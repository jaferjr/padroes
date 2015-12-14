package memento;

public class TextoMemento {
	protected String estadoTexto;
	protected String valor;

	public TextoMemento(String texto, String valor) {
		estadoTexto = texto;
		this.valor = valor;
	}

	public String getTextoSalvo() {
		return estadoTexto;
	}
}
