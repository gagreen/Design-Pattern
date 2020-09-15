package ClassicSingleton;

/* 게으른 인스턴스 생성 (Lazy instantiation) */
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {} // 내부에서만 생성할 수 있도록 "private"로 지정
	
	/* 외부에서 접근할 수 있도록 메서드 작성 */
	public static Singleton getInstance() { // 클래스 메서드(클래스에 유일한 메서드) "static" 키워드 사용
		if(uniqueInstance == null) { // 초기화되어있지 않다면
			uniqueInstance = new Singleton(); // 생성
		}
		return uniqueInstance;
	}
}
