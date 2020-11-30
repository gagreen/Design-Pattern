package menu;

import java.util.ArrayList;
import java.util.Iterator;

//MenuComponent의 Menu 관련 메서드만 구현
public class Menu extends MenuComponent {
	ArrayList menuComponents = new ArrayList();
	String name;
	String descrption;
	
	public Menu(ArrayList menuComponents, String name, String descrption) {
		this.menuComponents = menuComponents;
		this.name = name;
		this.descrption = descrption;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return descrption;
	}
	
	@Override
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("------------------------------");
		
		Iterator iterator = menuComponents.iterator(); // 하위 구성요소들 print()
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print(); // 재귀적인 사용법
		}
	}
}
