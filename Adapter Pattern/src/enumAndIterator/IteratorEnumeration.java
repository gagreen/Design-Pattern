package enumAndIterator;

import java.util.Enumeration;
import java.util.Iterator;

/* 기존 클라이언트 코드에서 Iterator를 사용하려면 Enumeration에 맞춰서 써야한다. */
public class IteratorEnumeration implements Enumeration {
	Iterator iterator;
	
	public IteratorEnumeration(Iterator iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
	
	@Override
	public Object nextElement() {
		return iterator.next();
	}
}
