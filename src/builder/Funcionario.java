package builder;

public class Funcionario {

	protected ProdutosBuilder montarpedido;
	 
    public  Funcionario(ProdutosBuilder m) {
        this. montarpedido = m;
    }
 
    public void construirPedido() {
    	montarpedido.buildBatata();
    	montarpedido.buildBrinquedo();
    	montarpedido.buildRefri();
    	montarpedido.buildSanduiche();
     
    }
 
    public Produtos getProduto() {
        return montarpedido.getProduto();
    }
}
