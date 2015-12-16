package builder;

public class AtendenteBuilder extends ProdutosBuilder {

	public AtendenteBuilder() {
		super();
	}

	@Override
	public void buildBatata() {
		produtos.setBatata("Batata Grande");

	}

	@Override
	public void buildSanduiche() {
		produtos.setSanduba("Cheeseburger");
	}

	@Override
	public void buildBrinquedo() {
		produtos.setBrinquedo("Carrinho");

	}

	@Override
	public void buildRefri() {
		produtos.setRefri("Coca 700ml");
	}

}
