package gumball;

/* 동전 없음 상태 */
public class NoQuarterState implements State {
	GumballMachine gumballMachine; // 뽑기 기계에 대한 레퍼런스 변수 저장
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() { // 누군가 동전을 넣으면 확인 메시지 및 상태 전환
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	/*  */
	@Override
	public void ejectQuater() {
		System.out.println("동전을 넣어주세요");
	}

	@Override
	public void turnCrank() {
		System.out.println("동전을 넣어주세요");
	}

	@Override
	public void dispense() {
		System.out.println("동전을 넣어주세요");
	}

}
