package gumball;

/* 뽑기 기계와 관련된 모든 행동에 대한 메서드를 정의, 
 * State interface를 참고해서 기계의 어떤 상태에 해당하는 상태 클래스를 구현
 * 지저분한 if문을 전부 없애고 상태 클래스에게 모든 작업을 위임할 수 있다. */
public interface State {
	
	// 동전 투입
	public void insertQuater();
	
	// 동전 반환
	public void ejectQuater();
	
	// 손잡이 돌리기
	public void turnCrank();
	
	// 알맹이 배출
	public void dispense();
}
