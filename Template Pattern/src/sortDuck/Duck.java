package sortDuck;

/* mergeSort의 서브클래스를 만들지 않고 Comparable을 구현하여 템플릿 패턴 구현*/
public class Duck implements Comparable{ // java.lang.Comparable
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + ", \t체중: " + weight;
	}
	
	
	/* sort 메서드에서 필요한 compareTo 메서드 구현 */
	@Override
	public int compareTo(Object object) {
		Duck otherDuck = (Duck)object;
		
		/* 다른 오리보다 가벼우면 -1, 같으면 0, 무거우면 1 */
		if(this.weight < otherDuck.weight) {
			return -1;
		} else  if(this.weight == otherDuck.weight) {
			return 0;
		} else {
			return 1;
		}
	}
}
