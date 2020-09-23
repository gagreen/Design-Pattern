package addUndo;

public class RemoteControlWithUndo {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand; // 마지막으로 누른 버튼을 기억하는 역할
	
	public RemoteControlWithUndo() {
		onCommands 	= new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		
		for(int i=0; i<7; i++) {
			onCommands[i]  = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void SetCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot]  = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n----- Remote Control-----\n");
		for(int i=0; i<onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " 
					+ onCommands[i].getClass().getName() + "\t" 
					+ offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undoCommand]" + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
