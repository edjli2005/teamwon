
import rxtxrobot.*; 
//This is a version of my earlier main code, changed to include encoded motors.
public class main {

	public static void main(String[] args) {
		
		
				RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
				r.setPort("COM4"); // Set the port to COM4 
				r.setHasEncodedMotors(true); 
				r.setVerbose(true); // Turn on debugging messages 
				r.connect(); 
				r.runEncodedMotor(RXTXRobot.MOTOR1,- 125,0, RXTXRobot.MOTOR2, 125,0 );//starts moving
				Bump(r);
				r.runMotor(RXTXRobot.MOTOR3, 50,1000 );
				r.runEncodedMotor(RXTXRobot.MOTOR1, 0,0, RXTXRobot.MOTOR2,0,0);//stop at water
				
				r.moveServo(RXTXRobot.SERVO1, 170); // get water from cup 
				r.moveServo(RXTXRobot.SERVO1, 30);
				
				r.runMotor(RXTXRobot.MOTOR2,  -125, 3000);//turn toward first dispenser
				
			
				r.runEncodedMotor(RXTXRobot.MOTOR1, -125,0, RXTXRobot.MOTOR2, 125,0 );//moves toward dispenser
				
				r.runMotor(RXTXRobot.MOTOR3, -50,500 );

				Bump(r);
				

				r.runEncodedMotor(RXTXRobot.MOTOR1, 0,0, RXTXRobot.MOTOR2,0,0);//stops at salinity dispenser
				
				r.refreshAnalogPins();
				double salinity=200;//r.getAnalogPin(2).getValue();//measures salinity and turbidity
				double turbidity=300;//r.getAnalogPin(3).getValue();
				
				RAMMINGSPEED(salinity,r);

				

				r.runEncodedMotor(RXTXRobot.MOTOR1, 125,0, RXTXRobot.MOTOR2, 125,0 );//turn toward second dispenser
				
				
				r.runEncodedMotor(RXTXRobot.MOTOR1, -125,0, RXTXRobot.MOTOR2, 125,0 );//moves toward dispenser
				
				Bump(r);
				r.runEncodedMotor(RXTXRobot.MOTOR1, 0,0, RXTXRobot.MOTOR2,0,0);//stops at turbidity dispenser
				
				RAMMINGSPEED(turbidity,r);
				
				r.runEncodedMotor(RXTXRobot.MOTOR1, 125,1500, RXTXRobot.MOTOR2,-125,1500);//back away from second dispenser
				r.runEncodedMotor(RXTXRobot.MOTOR1, -125, 1500, RXTXRobot.MOTOR2,-125,1500);//turns towards bridge area
				r.runEncodedMotor(RXTXRobot.MOTOR1, -125, 1000, RXTXRobot.MOTOR2,125,1000);//drives toward bridge
				r.runEncodedMotor(RXTXRobot.MOTOR1, 0,0, RXTXRobot.MOTOR2,0,0);//stops at bridge
				r.runEncodedMotor(RXTXRobot.MOTOR1, -125,1500, RXTXRobot.MOTOR2,-125,1500);//turns at bridge
			//	r.refreshAnalogPins();

				//while(r.getAnalogPin(4).getValue()<75){//while it doesn't sense the color change of the bridge
					r.runEncodedMotor(RXTXRobot.MOTOR1,- 50,250, RXTXRobot.MOTOR2,50,250);//drives along searching for the bridge
				//	r.refreshAnalogPins();//refreshes the analog pins
			//	}
				r.runEncodedMotor(RXTXRobot.MOTOR1, -125,1500, RXTXRobot.MOTOR2,-125,1500);//turns toward crossing bridge
				r.runEncodedMotor(RXTXRobot.MOTOR1,- 125,4000, RXTXRobot.MOTOR2,125,4000);//cross the bridge
				r.runEncodedMotor(RXTXRobot.MOTOR1, 125,1500, RXTXRobot.MOTOR2,125,1500);//turn towards dispensary goal
				
				r.moveServo(RXTXRobot.SERVO1, 170); // dispense balls into goal 
				
				
				r.close(); 
			} 
		
	
	public static void RAMMINGSPEED(double RAMMINGSPEED,RXTXRobot r ) {

		while(RAMMINGSPEED>0){//reverses and runs into
			r.runEncodedMotor(RXTXRobot.MOTOR1, 125, 1500, RXTXRobot.MOTOR2,-125,1500);//dispenser to get the
			r.runEncodedMotor(RXTXRobot.MOTOR1, 125, 1500, RXTXRobot.MOTOR2,-125,1500);//balls
			RAMMINGSPEED=RAMMINGSPEED-100;
		}
		
		
	}
	
	public static boolean Bump(RXTXRobot r){
		//code for when we wait for a bump sensor input
		boolean BumpSensor=false;

		//while(BumpSensor==false){
			r.sleep(250);
			//r.refreshAnalogPins();//runs until detects dispenser
			
			//if(r.getAnalogPin(1).getValue()>=100){//if bump sensor detects
				BumpSensor= true;
			//}
		//}
		return true;
	}

	public static void encodedMotors(RXTXRobot r){

	 
		r.setPort("COM2"); // Set port to COM2
		r.setHasEncodedMotors(true); 
		r.connect(); 		
		r.runEncodedMotor(RXTXRobot.MOTOR1, -150,100000,RXTXRobot.MOTOR2, 250, 100000); // Runs motors at 3/5 ratio for 100,000 ticks
		r.close(); 
		  
			}

		
	}



	
