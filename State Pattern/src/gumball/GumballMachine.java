package gumball;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState; // 상태 인스턴스 변수(초기에는 soldOut상태)
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		/* State 인스턴스 생성 */
		soldOutState 	= new SoldOutState(this);
		noQuarterState 	= new NoQuarterState(this);
		hasQuarterState	= new HasQuarterState(this);
		soldOutState 	= new SoldState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuater();
	}
	
	public void ejectQuarter() {
		state.ejectQuater();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense(); // GumballMachine에선 dispense메서드를 구현하지 않아도 됨(내부에서만 필요하기 때문)
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("알맹이가 나갑니다.");
		if(count != 0) {
			count--;
		}
	}
	
	/* 각 상태들의 getter 메서드 */
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public int getCount() {
		return count;
	}
}
