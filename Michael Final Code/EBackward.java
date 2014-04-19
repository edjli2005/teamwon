import rxtxrobot.RXTXRobot;


public class EBackward {
	public  EBackward(){}//constructor and final needed for ActionListener
	public void EBackward(RXTXRobot r, final int Ticks) {
		
		System.out.println("Motor run Ticks:" + Ticks);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 125, Ticks, RXTXRobot.MOTOR2, 115, Ticks);
		
	}
	
public void EBackward(RXTXRobot r, final int TicksL,final int TicksR) {
		
		System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 125, TicksL, RXTXRobot.MOTOR2, 115, TicksR);
		
	}

}
