package pizza;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		name = "채소 피자";
		dough = "일반 도우";
		sauce = "토마토 소스";
		
		toppings.add("치즈");
		toppings.add("피망");
		toppings.add("양파");
	}
}
