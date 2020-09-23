package addUndo;

import device.*;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("living room");
		CeilingFan bathRoomCeilingFan = new CeilingFan("Bath Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		CeilingFanMediumCommand fanMedium = new CeilingFanMediumCommand(bathRoomCeilingFan);
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(bathRoomCeilingFan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(bathRoomCeilingFan);
		
		remoteControl.SetCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		System.out.println(remoteControl.toString());
		
		remoteControl.undoButtonPushed();
		remoteControl.offButtonPushed(0);
		remoteControl.onButtonPushed(0);
		System.out.println(remoteControl.toString());
		remoteControl.undoButtonPushed();
		
		System.out.println("++++++++++++ Ceiling Fan ++++++++++++");
		
		remoteControl.SetCommand(0, fanMedium, fanOff);
		remoteControl.SetCommand(1, fanHigh, fanOff);
		
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		System.out.println(remoteControl.toString());
		remoteControl.undoButtonPushed();
		
		remoteControl.onButtonPushed(1);
		System.out.println(remoteControl.toString());
		remoteControl.undoButtonPushed();
		
		
	}
}
