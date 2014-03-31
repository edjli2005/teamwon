import rxtxrobot.RXTXRobot;


public class EForward {
	public  EForward(){}//constructor and final needed for ActionListener
	public void EForward(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -90, time, RXTXRobot.MOTOR2, 130, time);

		
	}

}
