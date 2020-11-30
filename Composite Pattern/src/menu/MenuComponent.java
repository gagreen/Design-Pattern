package menu;
// 컴포지트 패턴: 객체들을 트리 구조로 구성하여 계층 구조로 디자인 
public abstract class MenuComponent {
	
	/* MenuComponent를 추가/삭제/열람 등을 위한 메서드, 즉 메뉴(서브트리)의 역할 */
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	/* MenuItem에서 작업을 처리하기 위한 메서드, 즉 잎의 역할 */
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	/* 공통으로 구현해야할 작업용 메서드 */
	public void print() {
		throw new UnsupportedOperationException();
	}
	
}
