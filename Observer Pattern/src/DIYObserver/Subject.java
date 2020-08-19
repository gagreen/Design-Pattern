package DIYObserver;


/* 정보를 지원하는 것에 대한 구현 */
public interface Subject {
	public void registerObserver(Observer o); 	// 옵저버 등록
	public void removeObserver(Observer o);		// 옵저버 삭제
	public void notifyObservers();				// 옵저버들에게 정보 전달
}