package decorator;

public class Cobertura extends YogurtDecorador {
	private double custo;
	private String produtos;
	
	public Cobertura(Yogurt yogurtDecorado) {
		super(yogurtDecorado);
		this.custo = 0;
		this.produtos = "";
	}
	
	public double getCusto() {
        return super.getCusto() + custo;
    }
	
    public String getProdutos() {
        return super.getProdutos() + ", "+ produtos;
    }

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
    
}
