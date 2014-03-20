import rxtxrobot.RXTXRobot;


public class Up {
	public  Up(){}//constructor and final needed for ActionListener
	public void Up(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR3, 125,Time );//starts moving
		System.out.println("Up Done");
		//r.sleep(1500);
		
	}
	

	

}
