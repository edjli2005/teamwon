import rxtxrobot.RXTXRobot;


public class Uturn {
	public Uturn(){}//constructor and final needed for ActionListener
	public void Uturn(RXTXRobot r, final int direction) {
		
		if(direction==0){//if 0 uturn left
			r.runEncodedMotor(RXTXRobot.MOTOR1, 90, 300, RXTXRobot.MOTOR2, 90, 300);
		}
		if(direction==1){//if 1 uturn right
			r.runEncodedMotor(RXTXRobot.MOTOR1, -90, 300, RXTXRobot.MOTOR2, -90, 300);
		}
		
		
		

		
	}

}
