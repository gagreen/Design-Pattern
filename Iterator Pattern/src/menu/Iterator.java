package menu;

/* Iterator: 객체 컬렉션들의 의존성을 없애서, 확장이 용이하도록 함 */
public interface Iterator {
	boolean hasNext();
	Object next();
}
