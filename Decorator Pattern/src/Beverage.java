
/* Decorator 패턴의 Component 추상 클래스 역할 */
// Espresso, HoouseBlend, DarkRoast, Decaf
public abstract class Beverage {
	protected String description = "제목 없음";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
