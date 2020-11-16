package caffeine;
/* 알고리즘을 정의하는 추상 메서드 */
public abstract class CaffeineBeverage {
	/* 템플릿 메서드(TemplateMethod)로, 단 단계들을 메서드로 표현한다. */
	final void prepareRecipe() { // 서브 클래스에서 알고리즘을 수정하는 것을 막기 위해 final(상수)로 선언한다.
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) { // 후크를 이용하면 다양한 알고리즘을 구상할 수 있다.
			addCondiments();
		}
	}
	
	abstract void brew();			// 
									// 추상 메서드로 선언하여, 알고리즘에서 다른 부분을 서브 클래스에게 위임한다.
	abstract void addCondiments();	//
	
	void boilWater() {
		System.out.println("물 끓이는 중..");
	}
	
	void pourInCup() {
		System.out.println("컵에 따르는 중..");
	}
	
	// 후크(Hook)
	boolean customerWantsCondiments() { // 서브클래스에서 필요에 따라 오버라이드하도록
		return true;
	}
}
