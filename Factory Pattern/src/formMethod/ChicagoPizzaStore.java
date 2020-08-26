package formMethod;

import pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new ChicagoCheesePizza();
		default:
			return null;
		}
	}

}
