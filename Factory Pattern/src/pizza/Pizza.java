package pizza;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println(name + " 준비 중..");
		System.out.println("도우 만드는 중..");
		System.out.println("소스 뿌리는 중..");
		System.out.print("토핑 추가 중(");
		for(int i=0; i<toppings.size(); i++) {
			System.out.print(toppings.get(i));
			System.out.print((i != toppings.size()-1)? ", ":"");
		}
		System.out.println(")..");
	}
	
	public void bake() {
		System.out.println("피자 굽기~~");
	}
	
	public void cut() {
		System.out.println("부채꼴 모양으로 자르기");
	}
	
	public void box() {
		System.out.println("PizzaStore 박스로 포장하기");
	}
	
	public String getName() {
		return name;
	}
}
