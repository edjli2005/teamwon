import rxtxrobot.RXTXRobot;


public class ELeft {
	public  ELeft(){}//constructor and final needed for ActionListener
	public void ELeft(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 120, time, RXTXRobot.MOTOR2, 120, time);//time 65 is about 90 degrees
		

		
	}

}