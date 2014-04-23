import rxtxrobot.RXTXRobot;



public class bridgeRun {
	Ping Ping=new Ping();
	public  bridgeRun(){}//constructor and final needed for ActionListener
	public void bridgeRun(RXTXRobot r, final int Time) {
		// to get up ramp
		r.runEncodedMotor(RXTXRobot.MOTOR1, -150, Time, RXTXRobot.MOTOR2, 195, Time);
		
		System.out.println("Bridge HO!");
				
	}
	
}
