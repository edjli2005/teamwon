import rxtxrobot.RXTXRobot;


public class ERight {
	public  ERight(){}//constructor and final needed for ActionListener
	public void ERight(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -90, time, RXTXRobot.MOTOR2, -90, time);
		

		
	}

}
