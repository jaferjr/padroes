package pack;

public class ListaImpressaComNumeros implements ListaImplementada {

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ListaImplementada.lista.size(); i++) {
			System.out.println(i+". "+ListaImplementada.lista.get(i));
		}
	}

}
