package EagerSingleton;

/* 이른 초기화 (Eager Initialization) */
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
