package pack;

public class ListaImpressaComLetras implements ListaImplementada {

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		char letra = 65;
		for (int i = 0; i < ListaImplementada.lista.size(); i++, letra++) {
			System.out.println(letra+". "+ListaImplementada.lista.get(i));
		}
	}
}
