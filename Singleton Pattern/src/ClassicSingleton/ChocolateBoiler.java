package ClassicSingleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler cb;
	
	private ChocolateBoiler() {
		empty = true;	// 보일러 내부가 차있는지/비어있는지
		boiled = false; // 재료들이 끓었는지/아닌지
	}
	
	public static ChocolateBoiler getInstance() {
		if(cb == null) {
			cb = new ChocolateBoiler();
		}
		return cb;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			// 끊인 재료를 다음 단계로~
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			// 재료를 끓임
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
