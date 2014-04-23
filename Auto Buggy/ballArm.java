import rxtxrobot.RXTXRobot;


public class ballArm {
	public  ballArm(){}//constructor and final needed for ActionListener
	public void ballArm(RXTXRobot r, final int Angle) {
		
		r.moveServo(RXTXRobot.SERVO2, Angle);//moves arm
		
		
	}
}
		