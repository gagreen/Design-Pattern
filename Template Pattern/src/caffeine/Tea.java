package caffeine;
/* 서브 클래스에서 추상 메서드를 구현한다 */
public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("차를 우려내는 중...");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중...");
	}

}
