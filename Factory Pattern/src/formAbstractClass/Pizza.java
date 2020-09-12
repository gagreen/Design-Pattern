package formAbstractClass;

import ingredient.*;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract public void prepare();
	
	void bake() {
		System.out.println("피자 굽기~~");
	}
	
	void cut() {
		System.out.println("부채꼴 모양으로 자르기");
	}
	
	void box() {
		System.out.println("PizzaStore 박스로 포장하기");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
