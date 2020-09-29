package firstAdapter;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	/* 원래 형식의 레퍼런스를 참조하기 위해서 생성자 작성 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	/* Turkey의 gobble에 해당하는 메서드로 구현 */
	@Override
	public void quack() {
		turkey.gobble();
	}

	/* Duck과 마찬가지로 날려면 5번 정도 호출시켜  'Duck과 대응'시킴  */
	@Override
	public void fly() { 
		for(int i=0; i<5; i++) {
			turkey.fly();
		}
	}

}
