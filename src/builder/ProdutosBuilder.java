package builder;

public abstract class ProdutosBuilder {

	protected Produtos produtos;

	public abstract void buildBatata();

	public abstract void buildSanduiche();

	public abstract void buildBrinquedo();

	public abstract void buildRefri();

	public ProdutosBuilder() {

		produtos = new Produtos();

	}

	public Produtos getProduto() {
		return produtos;
	}
}
