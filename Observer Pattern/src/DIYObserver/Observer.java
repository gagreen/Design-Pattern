package DIYObserver;

/* 의존성을 가지는(정보를 받는) 것에 대한 구현 */
public interface Observer {
	public void update(float temp, float humidity, float pressure); // 기상 정보가 변경되었을 때 옵저버한테 전달되는 값들
}
