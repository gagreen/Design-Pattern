package formMethod;

import pizza.*;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new NYCheesePizza();
		default:
			return null;
		}
	}

}
