package formClass;

public class PizzaStore {
	SimplePizzaFactory fact;
	
	public PizzaStore(SimplePizzaFactory fact) {
		this.fact = fact;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = fact.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
