package menu;

/* 메뉴판에 쓰여질 하나하나의 객체 */
public class MenuItem {
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public double getPrice() {
		return price;
	}
}
