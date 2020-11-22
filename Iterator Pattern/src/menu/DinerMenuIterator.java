package menu;

import java.util.Iterator;

public class DinerMenuIterator implements java.util.Iterator {
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) { // 반본작업을 수행할 객체 컬렉션/배열을 받아들임
		this.items = items;
	}
	
	@Override
	public Object next() { // 배열의 다음 원소를 리턴하며, 요소에 1을 더한다
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() { // 객체의 최대크기 혹은 다음 객체가 NULL이 아닌지
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public void remove() { // java.util.Iterator의 remove() Override
		if(position <= 0) {
			throw new IllegalStateException("next()를 한 번도 호출하지 않은 상태에서는 삭제할 수 없습니다.");
		}
		if(items[position-1] != null) {
			for(int i=position-1; i<(items.length-1); i++) {
				items[i] = items[i+1];
			}
			items[items.length-1] = null;
		}
	}

}
