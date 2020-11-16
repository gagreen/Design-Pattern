package caffeine;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage{

	@Override
	void brew() {
		System.out.println("차를 우려내는 중...");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중...");
	}
	
	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		
		return false;
	}
	
	String getUserInput() {
		String answer = null;
		
		System.out.println("커피에 설탕과 우유를 넣어 드릴까요?(y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("입력 오류");
		}
		
		if(answer == null) {
			return "n";
		}
		
		return answer;
	}
}
