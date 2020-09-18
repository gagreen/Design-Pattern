package SimpleRemote;

/* 인보커(Invoker) */
public class SimpleRemoteControl {
	Command slot; // 명령을 저장할 슬롯
	
	public SimpleRemoteControl() {}
	
	/* 언제든지 명령 변경 가능 */
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	/* 버튼이 눌리면 커맨드 객체의 execute만 실행하면 된다. */
	public void buttonWasPressed() {
		slot.execute();
	}
}
