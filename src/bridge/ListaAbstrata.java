package bridge;

public abstract class ListaAbstrata {
	
	protected ListaImplementada lista;
	
	public ListaAbstrata(ListaImplementada lista) {
		// TODO Auto-generated constructor stub
		this.lista = lista;
	}
	
	public void imprimir(){
		for (Integer valor : ListaImplementada.lista) {
			System.out.println(valor);
		}
	}
	
	public void adicionar(int valor) {
		ListaImplementada.lista.add(valor);
	}
}
