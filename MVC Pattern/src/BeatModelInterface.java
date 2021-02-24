

public interface BeatModelInterface {
	/* 컨트롤러에서 모델한테 사용자 입력을 전달할 때 사용할 메서드 */
	void initialize(); // BeatModel의 인스턴스가 만들어질 떄 호출되는 메서드
	
	void on(); // 켜고 끄는 메서드
	
	void off();
	
	/* 뷰와 컨트롤러에서 상태를 알아내거나 옵저버로 등록할 때 사용할 메서드 */
	int getBPM(); // 현재 BPM 리턴
	
	void setBPM(int bpm);
	
	void registerObserver(BeatObserver o); // 박자마다 연락받을 메서드
	
	void removeObserver(BeatObserver o);
	
	void registerObserver(BPMObserver o); // BPM이 바뀔 때마다 연락받을 메서드
	
	void removeObserver(BPMObserver o);
}
