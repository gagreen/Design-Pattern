
public class MallardDuck extends Duck{
	public MallardDuck() {
		flyBehavior = new FlyWithWIngs();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm MallardDuck(청둥오리)");
	}
}
