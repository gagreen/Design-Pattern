package gumball;

import java.util.Random;

/* 동전 있음 상태 */
public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); // 당첨 상태를 위한 난수 발생기
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("동전은 한 개만 넣어주세요");
	}

	@Override
	public void ejectQuater() {
		System.out.println("동전을 반환합니다.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public boolean turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);
		
		if((winner == 1) && (gumballMachine.getCount() > 1)) { // 2개 이상 있어야지 2개 줄 수 있으니까
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
				
		return true;
	}

	@Override
	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}

	public void refill() {}
}
