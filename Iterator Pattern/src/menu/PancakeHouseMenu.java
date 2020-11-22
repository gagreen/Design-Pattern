package menu;

import java.util.ArrayList;

/* 루의 팬케이크 하우스 메뉴판(ArrayList로 구현됨) */
public class PancakeHouseMenu implements Menu{
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들어진 팬케이크", true, 2.99);
		addItem("레큘러 팬케이크 세트", "달걀 후라이와 소시지가 곁들어진 팬케이크", false, 2.99);
		addItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
		addItem("와플", "와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
//	public ArrayList getMenuItems() {
//		return menuItems;
//	}
	
	public java.util.Iterator<MenuItem> createIterator() { // menuItems를 담고 있는 Iterator를 만들어 리턴
//		return new PancakeHouseMenuIterator(menuItems); // Custom Iterator 사용
		return menuItems.iterator();
	}
	
	/* 그 외의 ArrayList를 이용해서 구현될 메서드들 */
}
