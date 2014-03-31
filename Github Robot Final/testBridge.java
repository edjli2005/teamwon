

import rxtxrobot.RXTXRobot;



	public class testBridge {
		
		public testBridge(){}//constructor 
		public void testBridge(RXTXRobot r) {
			r.runEncodedMotor(RXTXRobot.MOTOR1, -34, 0, RXTXRobot.MOTOR2, 50, 0);//move along line looking for bridge
			int IRreadings=100;
			ELeft LEncoded=new ELeft();
			bridgeRun bridgeAttack= new bridgeRun();
			
			while(IRreadings>30)
			{ 
				r.refreshAnalogPins(); 
				IRreadings=r.getAnalogPin(5).getValue(); 
				System.out.println("IR: " + IRreadings); 
			} 
			
			r.runEncodedMotor(RXTXRobot.MOTOR1, 0, 1, RXTXRobot.MOTOR2, 0, 1);//stops
			System.out.println("Found Bridge!");
			LEncoded.ELeft(r, 100);
			
			bridgeAttack.bridgeRun(r, 500);//about 4 feet
			r.close();

		}
		

		

	}

