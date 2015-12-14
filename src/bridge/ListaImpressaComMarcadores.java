package bridge;

public class ListaImpressaComMarcadores implements ListaImplementada {

	@Override
	public void imprimir() {
		for (Integer valor : ListaImplementada.lista) {
			System.out.println("- "+valor);
		}
	}
}
