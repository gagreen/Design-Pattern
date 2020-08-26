package formClass;

import pizza.Pizza;

public class PizzaStore {
	SimplePizzaFactory fact; // Class 형태의 팩토리
	
	public PizzaStore(SimplePizzaFactory fact) {
		this.fact = fact;
	}
	
	public Pizza orderPizza(String type) { 
		Pizza pizza = fact.createPizza(type); // 피자마다 orderPizza를 생성할 필요도 없고, orderPizza를 Pizza객체와 관계를 없앨 수 있다.
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
