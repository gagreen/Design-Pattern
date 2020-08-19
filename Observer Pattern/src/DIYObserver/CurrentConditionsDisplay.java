package DIYObserver;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	
	
	public CurrentConditionsDisplay(Subject weatherData) { // 생성 시에 옵저버 등록
		this.weatherData = weatherData;
		weatherData.registerObserver(this);	
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees annd " + humidity + "% humidity");
	}
}
