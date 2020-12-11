package gumball;

/* 당첨 상태(손잡이를 돌린 상태 + 알맹이 하나 더) */
public class WinnerState implements State {
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
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
	public boolean turnCrank() {
		System.out.println("손잡이는 한 번만 돌려주세요");
		return false;
	}

	@Override
	public void dispense() {
		System.out.println("축하드립니다! 알맹이를 하나 더!!!");
		gumballMachine.releaseBall(); // 일단 한 번 뽑고
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall(); // 한 번 더!
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	public void refill() {}
}
