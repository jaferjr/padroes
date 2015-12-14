package pack;

public class Base implements Yogurt {
	private double custo = 0;

	private String produtos = "";

	public double getCusto() {
		return custo;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

}
