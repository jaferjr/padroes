package pack;

public class YogurtDecorador implements Yogurt {
	protected Yogurt yogurtDecorado;
		
	public YogurtDecorador(Yogurt yogurtDecorado){
		this.yogurtDecorado = yogurtDecorado;
	}
	
	public double getCusto() {
		return yogurtDecorado.getCusto();
    }
	
	public String getProdutos() {
		return yogurtDecorado.getProdutos();
    }

	public void setCusto(double custo) {
	}

	public void setProdutos(String produtos) {
	}

}
