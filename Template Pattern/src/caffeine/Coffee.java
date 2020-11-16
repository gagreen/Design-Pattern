package caffeine;
/* 같은 알고리즘을 수행하는 객체도, 세부 내용은 다르게 구현할 수 있다. */
public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("필터로 커피를 우려내는 중...");
	}

	@Override
	void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중...");
	}

}
