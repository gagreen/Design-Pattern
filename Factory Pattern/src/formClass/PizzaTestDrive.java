package formClass;

import pizza.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		
		Pizza pizza = pizzaStore.orderPizza("veggie");
		System.out.println("Ordered a " + pizza.getName());
		
	}
}
