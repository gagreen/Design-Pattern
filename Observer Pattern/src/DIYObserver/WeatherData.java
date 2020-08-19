package DIYObserver;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;	// Observer 객체들을 저장하기 위한 공간 
	private float temperature;		//
	private float humidity;			// 기상 정보: 온도, 습도, 기압
	private float pressure;			//
	
	public WeatherData() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) { // 옵저버 등록
		observers.add(o);

	}
	@Override
	public void removeObserver(Observer o) { // 옵저버 삭제
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	@Override
	public void notifyObservers() { // 옵저버들에게 정보 전달 
		for(int i=0; i<observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() { // 기상 스테이션으로부터 갱신된 측정치 받음
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
