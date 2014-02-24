//Here's turning code that should work if we're still using the idea of running one motor faster than the other to turn. Note that the various numbers I plugged in (0s, 25s, 125s, etc.) are mostly arbitrary placeholder speeds, times, etc. that we can play around with in class. At this point, we should care about how consistent the robot will be in following these values. If it is relatively consistent, then we can take measurements and plug in the actual data of the course in place of them. 
import rxtxrobot.*; 
 
public class TurningTest 
{ 
   public static void main(String[] args) 
   { 
   	RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
   	r.setPort("COM2");//replace with /dev/tty… 
   	r.connect(); 
   	r.runMotor(RXTXRobot.MOTOR1, 25, RXTXRobot.MOTOR2, 125, 0); // Runs 
        //motor 1 at 25 speed and motor 2 at 125 speed
   	r.sleep(5000); // Pause execution for 5 seconds, but the motors keep 
        //running. 
	r.runMotor(RXTXRobot.MOTOR1,125,RXTXRobot.MOTOR2,25,0); // Turns the 
        //same amount in the opposite direction 
        r.sleep(5000);
        r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0, 0);//Stops both 
        //motors
	r.close(); 
   } 
} 