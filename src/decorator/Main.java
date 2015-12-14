package decorator;

public class Main {

	public static void main(String[] args) {
		Yogurt yogurt = new Base();
		yogurt.setCusto(10);
		yogurt.setProdutos("Yogurt Sabor Uva");
		System.out.println("Produto: " + yogurt.getProdutos());
		System.out.println("Preço: R$ " + yogurt.getCusto());
		
		yogurt = new Cobertura(yogurt);
		yogurt.setCusto(1.5);
		yogurt.setProdutos("Cobertura de Chocolate");
		
		yogurt = new Topo(yogurt);
		yogurt.setCusto(2);
		yogurt.setProdutos("Kit Kat");

		yogurt = new Cobertura(yogurt);
		yogurt.setCusto(1.5);
		yogurt.setProdutos("Cobertura de Chocolate");
		
		yogurt = new Topo(yogurt);
		yogurt.setCusto(2);
		yogurt.setProdutos("Kit Kat");
		
		System.out.println("Produto: " + yogurt.getProdutos());
		System.out.println("Preço: R$ " + yogurt.getCusto());
	}
}
