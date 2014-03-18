import rxtxrobot.RXTXRobot;


public class Left{
	public Left(){}
	public void Left(RXTXRobot r, int Time) {
		r.runMotor(RXTXRobot.MOTOR1,- 125, RXTXRobot.MOTOR2, -125,Time );//starts moving
		System.out.println("Left Done");
		r.sleep(1500);
		
	}

}
