import rxtxrobot.*;

public class Backward {
	public Backward(){}//constructor and final needed for ActionListener
	public void Backward(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR1, 90, RXTXRobot.MOTOR2, -125,Time );//starts moving
		System.out.println("Backward Done");
	//	r.sleep(1500);
		
	}

}
