import rxtxrobot.RXTXRobot;



public class bridgeRun {
	
	public  bridgeRun(){}//constructor and final needed for ActionListener
	public void bridgeRun(RXTXRobot r, final int Time) {
		// to get up ramp
		r.runMotor(RXTXRobot.MOTOR1, -150, RXTXRobot.MOTOR2, 195,Time );//starts moving
		
		System.out.println("Bridge HO!");
				
	}
	

	

}
