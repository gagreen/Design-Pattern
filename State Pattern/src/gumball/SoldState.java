package gumball;

/* 판매 상태(손잡이를 돌린 상태) */
public class SoldState implements State {
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		System.out.println("잠시만 기다려 주세요. 알맹이가 나가고 있습니다.");
	}

	@Override
	public void ejectQuater() {
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려주세요");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("알맹이가 모두 떨어졌습니다.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
