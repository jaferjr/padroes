package builder;

public class ExecutaPedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		ProdutosBuilder a = new AtendenteBuilder();
		Funcionario f = new Funcionario(a);
		f.construirPedido();

		pedido.adicionarDentroDaCaixa(f.getProduto().getBatata());
		pedido.adicionarDentroDaCaixa(f.getProduto().getBrinquedo());
		pedido.adicionarDentroDaCaixa(f.getProduto().getSanduba());
		pedido.adicionarForaDaCaixa(f.getProduto().getRefri());
		System.out.println(pedido.toString());

	}

}
