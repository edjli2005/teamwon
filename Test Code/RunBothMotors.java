// I'm not sure as to our exact motor configuration, so I based this proto-code off of this example, I can easily change it if you guys want to switch the motors around 
import rxtxrobot.*; 
 
public class RunBothMotors 
{ 
   public static void main(String[] args) 
   { 
	RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
	r.setPort("COM2"); // change COM2 to the /dev/tty… line 
	r.connect(); 
	r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, 125, 0); // 125   
        //is the motor speed, motors run indefinitely
	r.sleep(5000); // Pause execution for 5 seconds, but the motors keep 
        //running. 
	r.runMotor(RXTXRobot.MOTOR1,0,RXTXRobot.MOTOR2,0,0); // Stop both   
        //motors 
	r.close(); 
   } 
}
//All this is supposed to do is make the robot go in a straight line, I don't have turning code yet