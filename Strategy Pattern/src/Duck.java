/* Strategy Pattern */

// 일련의 알고리즘군을 정의하고, 각각을 캡슐화해서 교환하여 사용할 수 있도록 만든 패턴
// 위 패턴을 사용하면 알고리즘을 사용하는 클라이언트와 알고리즘을 독립적으로 변경할 수 있다.


// 바뀌는 부분을 분리하기 위해서 나는 행동과 우는 행동을 분리함
// 상위 형식에 맞춰 프로그래밍하기 위해 상위 클래스를 만듦

// 효과: 다른 형식의 객체에서도 나는 행동이나 우는 행동을 재사용할 수 있다.
//		기존의 행동 클래스를 수정하거나 추가할 때, Duck 클래스를 전혀 건드릴 필요가 없다.

public abstract class Duck {
	FlyBehavior flyBehavior;		// 나는 행동 만을 관
	QuackBehavior quackBehavior; 	// 
	
	public Duck() {}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("모든 오리는 물에 떠요, 가짜 오리도 말이죠");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) { // 실행 중에 오리의 행동을 바꾸려면 setter 메서드만 호출하면 된다. 
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
