import rxtxrobot.RXTXRobot;


public class Left{
	public Left(){}//constructor and final needed for ActionListener
	public void Left(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR1,- 125, RXTXRobot.MOTOR2, -125,Time );//starts moving
		System.out.println("Left Done");
		//r.sleep(1500);
		r.close();
	}

}
