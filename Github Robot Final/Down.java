import rxtxrobot.RXTXRobot;


public class Down {
	public  Down(){}//constructor and final needed for ActionListener
	public void Down(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR3, -125,Time );//starts moving
		System.out.println("Down Done");
		//r.sleep(1500);
		r.close();
	}
	

	

}

