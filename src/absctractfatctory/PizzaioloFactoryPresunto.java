package absctractfatctory;

public class PizzaioloFactoryPresunto implements PizzaFactory {

	public Pizza criaPizza() {
	
	return new Presunto();
	}
}
