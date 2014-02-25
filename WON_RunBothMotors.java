//robot will move forward for 5 seconds, turn for 1 second, and then move backwards for 3 seconds

import rxtxrobot.*;

public class WON_RunBothMotors {

	public static void main(String[] args){
	
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setVerbose(true);
		r.setPort("/dev/tty.usbmodem1411"); // change COM2 to the /dev/tty… line 
		r.connect(); 
		
		
		r.runMotor(RXTXRobot.MOTOR1, 255, RXTXRobot.MOTOR2, -255, 0); // 125   
		        //is the motor speed, motors run indefinitely
		r.sleep(5000); // Pause execution for 5 seconds, but the motors keep running
		r.runMotor(RXTXRobot.MOTOR1, 255, RXTXRobot.MOTOR2, 255, 0); //turns the robot
		r.sleep(2000); // Pause execution for 2 seconds, motors keep running
		r.runMotor(RXTXRobot.MOTOR1, -255, RXTXRobot.MOTOR2, 255, 0); //backwards movement
		r.sleep(3000); //
		r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0, 0); // 
		r.close(); 
	}
	
}
