import rxtxrobot.RXTXRobot;


public class ELeft {
	public  ELeft(){}//constructor and final needed for ActionListener
	public void ELeft(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);//for 90 degree turn go for 80 ticks
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -117, time, RXTXRobot.MOTOR2, -117, time);//time 65 is about 90 degrees
		

		
	}

}
