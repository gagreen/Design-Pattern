package menu;

import java.util.Iterator;

/* 멜의 객체마을 식당 메뉴판(배열을 사용) */
public class DinerMenu implements Menu{
	static final int MAX_SIZE = 6; // 배열의 쵀대 크기
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_SIZE];
		
		addItem("채식주의자용BLT", "통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
		addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
		addItem("하도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들어진 핫도그", false, 3.05);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_SIZE) { // 메뉴 항목 개수 제한
			System.err.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}
	
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	
	public Iterator<MenuItem> createIterator() { // menuItems를 담고 있는 Iterator를 만들어 리턴
		return new DinerMenuIterator(menuItems);
	}
	
	/* 그 외의 배열을 이용해서 구현될 메서드들 */
}
