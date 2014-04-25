import rxtxrobot.RXTXRobot;


public class EBackward {
	public  EBackward(){}//constructor and final needed for ActionListener
	public void EBackward(RXTXRobot r, final int Ticks) {
		
		System.out.println("Motor run Ticks:" + Ticks);
		//Full rotation is Right 87, Left 90
		r.runEncodedMotor(RXTXRobot.MOTOR1, 105, Ticks, RXTXRobot.MOTOR2, 100, Ticks);
		
	}
	
public void EBackward(RXTXRobot r, int TicksL, int TicksR) {
		
		System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 105, TicksL, RXTXRobot.MOTOR2, 100, TicksR);
		System.out.println("Returning Now!");
		return;
	}
public void ETurnB(RXTXRobot r,  int TicksR, int TicksL) {
	//@90 ticks goes [-134,-113]
	//to go 90 ticks [-90,-90]==33 cm @ 100 speed
	System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
	//motor 1 is right motor 2 is left
	
	r.runEncodedMotor(RXTXRobot.MOTOR1, 180,  TicksR, RXTXRobot.MOTOR2, 170, TicksL);
	
	System.out.println("Returning now!");
	return;
		
	}
}
