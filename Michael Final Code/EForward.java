import rxtxrobot.RXTXRobot;


public class EForward {

	public  EForward(){}//constructor and final needed for ActionListener
	public void EForward(RXTXRobot r, final int Ticks) {
		//@90 ticks goes [-134,-113]
		//to go 90 ticks [-90,-90]==33 cm
		System.out.println("Motor run Ticks:" + Ticks);
		//motor 1 is right motor 2 is left
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -100,  Ticks, RXTXRobot.MOTOR2, -100, Ticks);
		
		System.out.println("Returning now!");
			
		}
	
	public void EForward(RXTXRobot r,  int TicksR, int TicksL) {
		//@90 ticks goes [-134,-113]
		//to go 90 ticks [-90,-90]==33 cm @ 100 speed
		System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
		//motor 1 is right motor 2 is left
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -105,  TicksR, RXTXRobot.MOTOR2, -100, TicksL);
		
		System.out.println("Returning now!");
		return;
			
		}
	public void ETurnF(RXTXRobot r,  int TicksR, int TicksL) {
		//@90 ticks goes [-134,-113]
		//to go 90 ticks [-90,-90]==33 cm @ 100 speed
		System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
		//motor 1 is right motor 2 is left
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -180,  TicksR, RXTXRobot.MOTOR2, -170, TicksL);
		
		System.out.println("Returning now!");
		return;
			
		}
	
}