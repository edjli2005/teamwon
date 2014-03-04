
import rxtxrobot.*; 
//This is a version of my earlier main code, changed to include the motors needing to have reversed values to move forward and backwards.
public class main {

	public static void main(String[] args) {
		
		
				RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
				r.setPort("COM4"); // Set the port to COM4 
				r.setVerbose(true); // Turn on debugging messages 
				r.connect(); 
				r.runMotor(RXTXRobot.MOTOR1,- 125, RXTXRobot.MOTOR2, 125,0 );//starts moving
				Bump(r);
			
				r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2,0,0);//stop at water
				
				r.moveServo(RXTXRobot.SERVO1, 170); // get water from cup 
				r.moveServo(RXTXRobot.SERVO1, 30);
				
				r.runMotor(RXTXRobot.MOTOR2,  -125, 3000);//turn toward first dispenser
				
			
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2, 125,0 );//moves toward dispenser
				
				

				Bump(r);
				

				r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2,0,0);//stops at salinity dispenser
				
				
				double turbidity=Turbidity(r);
				double salinity=Salinity(r);
				
				RAMMINGSPEED(salinity,r);

				

				r.runMotor(RXTXRobot.MOTOR2,  -125, 3000);//turn toward second dispenser
				
				
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2, 125,0 );//moves toward dispenser
				
				Bump(r);
				r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2,0,0);//stops at turbidity dispenser
				
				RAMMINGSPEED(turbidity,r);
				
				r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);//back away from second dispenser
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,-125,1500);//turns towards bridge area
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,125,1000);//drives toward bridge
				r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2,0,0);//stops at bridge
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,-125,1500);//turns at canyon
			//	r.refreshAnalogPins();

				//while(r.getAnalogPin(4).getValue()<75){//while it doesn't sense the color change of the bridge
					r.runMotor(RXTXRobot.MOTOR1,- 50, RXTXRobot.MOTOR2,50,250);//drives along searching for the bridge
				//	r.refreshAnalogPins();//refreshes the analog pins
			//	}
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,-125,1500);//turns toward crossing bridge
				r.runMotor(RXTXRobot.MOTOR1,- 125, RXTXRobot.MOTOR2,125,4000);//cross the bridge
				r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,125,1500);//turn towards dispensary goal
				
				up(r);// dispense balls into goal 
				up(r);
				up(r);
				down(r);
				down(r);
				down(r);
				
				r.close(); 
			} 
	public static void RAMMINGSPEEDB(double RAMMINGSPEED, RXTXRobot r){
		
		
	}
	
	public static void RAMMINGSPEED(double RAMMINGSPEED,RXTXRobot r ) {
		String Whereisthe50="LEFT";
		if(Whereisthe50=="LEFT"){
			while(RAMMINGSPEED>50){//reverses and runs into
		
				r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);//rams the dispenser to get the
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,125,1500);//balls
				RAMMINGSPEED=RAMMINGSPEED-50;
			}
			r.runMotor(RXTXRobot.MOTOR1,125, RXTXRobot.MOTOR2,125,1500);//turns and goes to the other dispenser
			r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);
			r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,-125,1500);	
			while(RAMMINGSPEED>0){
				r.refreshAnalogPins();
				r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);//rams the dispenser to get the
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,125,1500);//balls
				RAMMINGSPEED=RAMMINGSPEED-5;
		
			}
		
		if(Whereisthe50=="RIGHT"){
			r.runMotor(RXTXRobot.MOTOR1,125, RXTXRobot.MOTOR2,125,1500);//turns and goes to the other dispenser
			r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);
			r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,-125,1500);	
			while(RAMMINGSPEED>50){//reverses and runs into
				
				r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);//rams the dispenser to get the
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,125,1500);//balls
				RAMMINGSPEED=RAMMINGSPEED-50;
			}
			r.runMotor(RXTXRobot.MOTOR1,-125, RXTXRobot.MOTOR2,-125,1500);//turns and goes to the other dispenser
			r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,125,1500);
			r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,125,1500);	
			
			while(RAMMINGSPEED>0){
				r.refreshAnalogPins();
				r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,-125,1500);//rams the dispenser to get the
				r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,125,1500);//balls
				RAMMINGSPEED=RAMMINGSPEED-5;
			}
		}
	
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
	public static double Salinity(RXTXRobot r){
		
		
		r.refreshAnalogPins();
		double PIN4=r.getAnalogPin(4).getValue();
		double PIN5=r.getAnalogPin(5).getValue();
		double PIN11=r.getDigitalPin(11).getValue();
		double R=PIN4-PIN5;
		double distance=0.9;
		double area=6.32;
		double diff=100;
		double FIRST=100;
		double SECOND=-1;
		while(diff>1||diff<-1){
			r.sleep(3000);
			r.refreshAnalogPins();
			r.refreshDigitalPins();
			PIN4=r.getAnalogPin(4).getValue();
			
			PIN5=r.getAnalogPin(5).getValue();
			PIN11=r.getDigitalPin(11).getValue();
			R=PIN4-PIN5;
			System.out.println(PIN4);
			System.out.println(PIN5);
			System.out.println(R);
			System.out.println();
			SECOND=FIRST;
			FIRST=R;
			diff=FIRST-SECOND;
		}
		double Salinity=distance/(R*area);
		//System.out.println(PIN4);
		//System.out.println(PIN5);
		//System.out.println(PIN11);
		//System.out.println(R);
		//Salinity=distance/(R*area);
		//System.out.println(Salinity);

//		Salinity=(R-310.52)/26866;
	//	System.out.println();
		//System.out.println(Salinity);
		//}
		return Salinity;
	}
	public static double Turbidity(RXTXRobot r){
		double diff=100;
		double FIRST=100;
		double SECOND=-1;
		double Turbidity=-1;
		double a=0.03356972;
		while(diff>1||diff<-1){
			r.sleep(3000);
			r.refreshAnalogPins();
			double PIN3=r.getAnalogPin(3).getValue();
			System.out.println(PIN3);	
			Turbidity=(Math.log(PIN3))/a;
			System.out.println("THE TURBIDITY IS PROBABLY " + Turbidity);
			SECOND=FIRST;
			FIRST=PIN3;
			
			diff=FIRST-SECOND;
			
		}
		return Turbidity;
	}
	public static void up(RXTXRobot r){
		
		r.runMotor(RXTXRobot.MOTOR3, 75,1500);//runs up about an inch

	}
	public static void down(RXTXRobot r){
		
		r.runMotor(RXTXRobot.MOTOR3, -75,1000);//runs down about an inch

	}
	public static void TurnLeft(RXTXRobot r){
		r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2,125,5000);
		//OR
		//r.runEncodedMotor(RXTXRobot.MOTOR1, 125, 100000, RXTXRobot.MOTOR2, 125, 100000);
	}
	
	public static void TurnRight(RXTXRobot r){
		r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2,-125,5000);
		//OR
		//r.runEncodedMotor(RXTXRobot.MOTOR1, -125, 100000, RXTXRobot.MOTOR2, -125, 100000);
	}

}



	
