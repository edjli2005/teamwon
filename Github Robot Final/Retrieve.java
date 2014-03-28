import rxtxrobot.*;

public class Retrieve {
	public  Retrieve(){}//constructor and final needed for ActionListener
	public void Retrieve(RXTXRobot r, final int Time) {
		
		r.runMotor(RXTXRobot.MOTOR3, -125,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR3, 125,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR3, -125,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR3, 125,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR3, -125,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR3, 125,Time );//starts moving
		System.out.println("Retireve Done");
		
	}
}
