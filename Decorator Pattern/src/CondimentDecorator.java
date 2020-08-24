
/* 데코레이터로, 최상위 클래스 Beverage를 상속받음으로 나중에 Beverage객체 자리에 들어갈 수 있도록 한다. */
public abstract class CondimentDecorator extends Beverage {
	
	public abstract String getDescription(); // Beverage 클래스의 메서드를 추상클래스로 오버라이딩

}
