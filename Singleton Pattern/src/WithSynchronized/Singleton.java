package WithSynchronized;

/* 게으른 인스턴스 생성 with 동기화 블럭 (Lazy instantiation with synchronized) */
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {} // 일반적인 게으른 인스턴스 생성과 동일
	
	/* 외부에서 접근할 수 있도록 메서드 작성 */
	public static synchronized Singleton getInstance() { // 다중 쓰레드에서도 하나의 인스턴스를 유지하기 위해서 "synchronized" 사용
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}

/* synchronized를 사용함으로 인해, 속도가 매우 느려질 수 있다. */