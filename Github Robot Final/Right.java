import rxtxrobot.RXTXRobot;


public class Right {

	public Right(RXTXRobot r, int Time) {
		r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, 125,Time );//starts moving
		System.out.println("Right Done");
		r.sleep(1500);
		
	}

}
