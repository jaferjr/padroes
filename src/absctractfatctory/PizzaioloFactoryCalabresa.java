package absctractfatctory;

public class PizzaioloFactoryCalabresa implements PizzaFactory {

	public Pizza criaPizza() {
		return new Calabresa();
	}
}
