
public class DuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("I hurted my wings(날개가 다쳤어요)");
		System.out.println("Resetting Behavior(행동을 수정합니다)");
		mallard.setFlyBehavior(new FlyNoWay());
		
		mallard.performFly();
	}
}
