import rxtxrobot.RXTXRobot;


public class EForward {
	public  EForward(){}//constructor and final needed for ActionListener
	public void EForward(RXTXRobot r, final int time) {
		
		System.out.println("Motor run time:" + time);
		//motor 1 is right motor 2 is left
		r.setMotorRampUpTime(500);
		r.runEncodedMotor(RXTXRobot.MOTOR1, -120,  time, RXTXRobot.MOTOR2, 160, time);
		
		

		//100 ticks is
		//14.5 in
		//14.8 in
		//14.4
		//14.7
		//14.5
		//14.3
		//14.4
		//13.8
		//AVG 14.4 in/100 Ticks
		//1.4 in/10 Ticks
		//.14 in/Tick
		}

}
