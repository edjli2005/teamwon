import rxtxrobot.RXTXRobot;


public class ERight {
	public  ERight(){}//constructor and final needed for ActionListener
	public void ERight(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time: " + time);//for 90 degree turn run for 80 ticks
		
		r.runEncodedMotor(RXTXRobot.MOTOR1, 93, time, RXTXRobot.MOTOR2, 93, time);//time 65 is about 90 degrees		
	}
	public String ERight(RXTXRobot r){// Automatically turns 90 degrees when passed no time, aka the input box is empty
		String Confirm=("Motor turn 90 degrees right!");
		System.out.println(Confirm);
		r.runEncodedMotor(RXTXRobot.MOTOR1, 93, 65, RXTXRobot.MOTOR2, 93, 65);
		return Confirm;//returns confirmation
	}

}
