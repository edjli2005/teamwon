import rxtxrobot.RXTXRobot;


public class Uturn {
	public Uturn(){}//constructor and final needed for ActionListener
	public void Uturn(RXTXRobot r, final int direction) {
		
		if(direction==0){//if 0 uturn left
			r.runEncodedMotor(RXTXRobot.MOTOR1, 120, 130, RXTXRobot.MOTOR2, 120, 130);
		}
		if(direction==1){//if 1 uturn right
			r.runEncodedMotor(RXTXRobot.MOTOR1, -120, 130, RXTXRobot.MOTOR2, -120, 130);
		}
		
		
		r.close();


		
	}

}
