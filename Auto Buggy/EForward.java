import rxtxrobot.RXTXRobot;


public class EForward {
	public  EForward(){}//constructor and final needed for ActionListener
	public void EForward(RXTXRobot r, final int Ticks) {
		//@90 ticks goes [-134,-113]
		//to go 90 ticks [-65,-72]==33 cm
		System.out.println("Motor run Ticks:" + Ticks);
		//motor 1 is right motor 2 is left
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -122,  Ticks, RXTXRobot.MOTOR2, -100, Ticks);
		
		System.out.println("Returning now!");
			
		}
	
	public void EForward(RXTXRobot r, final int TicksL,final int TicksR) {
		//@90 ticks goes [-134,-113]
		//to go 90 ticks [-65,-72]==33 cm
		System.out.println("Motor run Ticks:" + TicksL+","+TicksR);
		//motor 1 is right motor 2 is left
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -122,  TicksL, RXTXRobot.MOTOR2, -100, TicksR);
		
		System.out.println("Returning now!");
			
		}

}
