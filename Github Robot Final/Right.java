import rxtxrobot.RXTXRobot;


public class Right {
	public Right(){}//constructor and final needed for ActionListener
	public void Right(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, 125,Time );//starts moving
		System.out.println("Right Done");
		//r.sleep(1500);
		//r.close();
	}

}
