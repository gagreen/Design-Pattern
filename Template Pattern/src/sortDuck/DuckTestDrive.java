package sortDuck;

import java.util.Arrays;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("리더", 3),
				new Duck("보컬", 6),
				new Duck("랩", 6),
				new Duck("댄스", 5),
				new Duck("비주얼", 4),
				new Duck("서브보컬", 7),
		};
		
		System.out.println("정렬 전..");
		display(ducks);
		
		Arrays.sort(ducks); // 정적 메서드인 sort 메서드 호출
		
		System.out.println("정렬 후");
		display(ducks);
	}
	
	static void display(Object[] objects) {
		for(int i=0; i<objects.length; i++) {
			System.out.println(objects[i]);
		}
	}
}
