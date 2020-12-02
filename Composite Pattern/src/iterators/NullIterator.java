package iterators;

import java.util.Iterator;

/* MenuItem은 반복작업할 대상이 없기 때문에 '널 객체 디자인 패턴'을 적용해서 false/null만을 리턴하는 객체를 생성한다. */
public class NullIterator implements Iterator{
	
	@Override
	public Object next() {
		return null;
	}

	@Override
	public boolean hasNext() {
		return false;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
