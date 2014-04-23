import rxtxrobot.*;



public class Forward {
	
	public  Forward(){}//constructor and final needed for ActionListener
	public void Forward(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR1, -122, RXTXRobot.MOTOR2, -115,Time );//starts moving		
		System.out.println("Forward Done");
		
		//r.sleep(1500);
	
	}


}
