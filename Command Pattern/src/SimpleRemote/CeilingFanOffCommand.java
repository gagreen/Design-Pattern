package SimpleRemote;

import device.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		ceilingFan.off();

	}

}
