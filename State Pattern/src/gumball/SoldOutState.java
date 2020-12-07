package gumball;

/* 알맹이 매진 상태 */
public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("알맹이가 매진되었습니다.");
	}

	@Override
	public void ejectQuater() {
		System.out.println("알맹이가 매진되었습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("알맹이가 매진되었습니다.");
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 매진되었습니다.");
	}

}
