package menu;

import java.util.Iterator;

/* 메뉴를 알려주고, 주문을 받는 역할을 하는 종업원 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("메뉴\n-----\n아침 메뉴");
		printMenu(pancakeIterator);
		
		System.out.println("\n점심 메뉴");
		printMenu(dinerIterator);
		
		System.out.println("\n저녁 메뉴");
		printMenu(cafeIterator);
	}
	
	/* Iterator를 써서 모든 메뉴 항목에 접근하여 내용 출력 */
	private void printMenu(Iterator iterator) { // printMenu를 오버라이드 
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.print(menuItem.getDescription()+"\n");
		}
	}
}
