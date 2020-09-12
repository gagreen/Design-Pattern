package formAbstractClass;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	/*concrete creator(구상 생산자)*/
	abstract Pizza createPizza(String type); // 메서드 형태의 팩토리, 서브 클래스로 팩토리를 구현한다.
}
