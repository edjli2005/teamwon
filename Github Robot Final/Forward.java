import rxtxrobot.*;



public class Forward {
	
	public  Forward(){}//constructor and final needed for ActionListener
	public void Forward(RXTXRobot r, final int Time) {
		// to get up ramp
		//r.runMotor(RXTXRobot.MOTOR1, -150, RXTXRobot.MOTOR2, 195,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR1, -100, RXTXRobot.MOTOR2, 130,Time );//starts moving
		System.out.println("Forward Done");
		
		//r.sleep(1500);
	
	}
	

	

}
