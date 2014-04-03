import rxtxrobot.RXTXRobot;


public class EBackward {
	public  EBackward(){}//constructor and final needed for ActionListener
	public void EBackward(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 85, time, RXTXRobot.MOTOR2, -160, time);
		
		

		
	}

}
