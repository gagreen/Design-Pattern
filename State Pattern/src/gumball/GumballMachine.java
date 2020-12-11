package gumball;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState; // 상태 인스턴스 변수(초기에는 soldOut상태)
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		/* State 인스턴스 생성 */
		soldOutState 	= new SoldOutState(this);
		noQuarterState 	= new NoQuarterState(this);
		hasQuarterState	= new HasQuarterState(this);
		soldState	 	= new SoldState(this);
		winnerState 	= new WinnerState(this);
		
		
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
		if(state.turnCrank()) {
			state.dispense(); // GumballMachine에선 dispense메서드를 구현하지 않아도 됨(내부에서만 필요하기 때문)
		}
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
	
	void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
		state.refill();
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
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public int getCount() {
		return count;
	}
	
	/* 문자열 표현 */
	@Override
	public String toString() {
		String output = "------toString------\n" +
						"주식회사 왕뽑기\n" + 
						"자바로 돌아가는 2004년형 뽑기 기계\n"; 
		output += "남은 개수: " + getCount() + "\n";

		output += "now State : " + this.state + "\n";
		output += "\n--------------------";
		
		return output;
	}
	
}
