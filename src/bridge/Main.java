package pack;

public class Main {
	public static void main(String[] args) {
		ListaAbstrata listaAbstrata = new ListaNaoOrdenada(new ListaImpressaComNumeros());
		listaAbstrata.adicionar(6);
		listaAbstrata.adicionar(1);
		listaAbstrata.adicionar(9);
		listaAbstrata.adicionar(4);
		listaAbstrata.adicionar(10);
		listaAbstrata.adicionar(5);
		listaAbstrata.adicionar(2);
		listaAbstrata.lista.imprimir();
		
		listaAbstrata = new ListaOrdenada(new ListaImpressaComLetras());
		listaAbstrata.lista.imprimir();
		
	}
}
