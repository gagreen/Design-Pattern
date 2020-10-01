package enumAndIterator;

import java.util.Enumeration;
import java.util.Iterator;

/* Enumeration을 Iterator처럼 보이도록 설계해야함 */
public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
	
	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
	
	@Override
	public Object next() {
		return enumeration.nextElement();
	}
	
	@Override
		public void remove() {
			// Enumeration은 Iterator의 remove()를 지원하지 않기 때문에 런타임 예외를 던저준다.
			throw new UnsupportedOperationException(); 
		}
	
}
