package pack;

import java.util.Collections;

public class ListaOrdenada extends ListaAbstrata {

	public ListaOrdenada(ListaImplementada lista) {
		super(lista);
		ordenarLista();
	}

	public void ordenarLista(){
		Collections.sort(ListaImplementada.lista);
	}
}
