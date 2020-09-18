package SimpleRemote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); // 리모컨 생성
		Light light = new Light(); // 전등 생성
		LightOnCommand lightOn = new LightOnCommand(light); // light를 조정하는 명령 생성
		
		GarageDoor gd = new GarageDoor();
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(gd);
		
		remote.setCommand(lightOn); // 명령어 전달
		remote.buttonWasPressed(); // 실행
		remote.setCommand(doorOpen);
		remote.buttonWasPressed();
	}
}
