import rxtxrobot.RXTXRobot;


public class ERight {
	public  ERight(){}//constructor and final needed for ActionListener
	public void ERight(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);//for 90 degree turn run for 70 ticks
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 93, time, RXTXRobot.MOTOR2, 93, time);//time 65 is about 90 degrees
		

		
	}

}
