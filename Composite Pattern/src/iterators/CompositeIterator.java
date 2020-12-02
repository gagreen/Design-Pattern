package iterators;

import java.util.*;
import menu.*;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public Object next() {
		if(hasNext()) { // 다믕 요소가 있다면
			Iterator iterator = (Iterator) stack.peek(); // stack에서 Iterator 꺼내기(peek: 삭제 없이 꺼내기)
			MenuComponent component = (MenuComponent) iterator.next();
			
			if(component instanceof Menu) { // Menu 타입이라면
				stack.push(component.createIterator()); // Iterator를 생성해서 stack에 집어넣기
			}
			return component; // 무슨 요소라도 component 반환
		}
		
		return null;
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()) { // Iterator들을 담고 있는 Stack이 비어있다면
			return false;
		}
		else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()) { // 서브 Iterator 안에 요소가 없다면
				stack.pop(); // 현재 top 삭제하기
				return hasNext(); // hasNext 다시 실행(다음 스택이 있을수도 있기 때문에)
			}
			else {
				return true;
			}
		}
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
