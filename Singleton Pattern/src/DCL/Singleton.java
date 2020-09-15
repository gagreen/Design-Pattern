package DCL;

/* Double Checking Locking(DCL) */
public class Singleton {
	/* 멀티쓰레드를 사용하더라도 인스턴스 초기화 과정이 올바르게 진행될 수 있도록 "volatile" 사용 */
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) { // 동일 쓰레드에 있는지 확인
			synchronized (Singleton.class) {
				if(uniqueInstance == null) { // 다른 쓰레드에도 있는지 확인
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
