import rxtxrobot.RXTXRobot;



public class Forward {
	
	public  Forward(){}//constructor and final needed for ActionListener
	public void Forward(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2, 125,Time );//starts moving
		System.out.println("Forward Done");
		
		//r.sleep(1500);
		r.close();
		
	}
	

	

}
