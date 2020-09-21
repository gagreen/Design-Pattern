package SimpleRemote;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	/* 아무런 명령이 들어있지 않은 NoCommand로 초기화 */
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand(); // 널 객체
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	/* slot을 기준으로 연결 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n----- Remote Control-----\n");
		for(int i=0; i<onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " 
					+ onCommands[i].getClass().getName() + "\t" 
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
