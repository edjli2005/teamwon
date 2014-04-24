import rxtxrobot.RXTXRobot;


public class EBackward {
	public  EBackward(){}//constructor and final needed for ActionListener
	public void EBackward(RXTXRobot r, final int Ticks) {
		
		System.out.println("Motor run Ticks:" + Ticks);
		//Full rotation is Right 87, Left 90
		r.runEncodedMotor(RXTXRobot.MOTOR1, 110, Ticks, RXTXRobot.MOTOR2, 100, Ticks);
		
	}
	
public void EBackward(RXTXRobot r, final int TicksL,final int TicksR) {
		
		System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 110, TicksL, RXTXRobot.MOTOR2, 100, TicksR);
		
	}

}
