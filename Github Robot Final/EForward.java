import rxtxrobot.RXTXRobot;


public class EForward {
	public  EForward(){}//constructor and final needed for ActionListener
	public void EForward(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);
		//motor 1 is right motor 2 is left
		
			r.runEncodedMotor(RXTXRobot.MOTOR1, -80,  time, RXTXRobot.MOTOR2, -80, time);
			
		//}
		System.out.println("Returning now!");
		

		
		}

}
