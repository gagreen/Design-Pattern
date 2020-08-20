package JavasObserver;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {} // 생성자에서 옵저버를 저장하기 위한 자료구조를 만들 필요 없음
	
	// 옵저버 등록, 제거는 수퍼 클래스에서 관리하므로 작성할 필요 없다.
	
	public void measurementsChaged() {
		setChanged(); // 주제의 상태가 바뀌었음을 알려줌
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChaged();
	}
}
