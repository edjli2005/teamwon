import rxtxrobot.RXTXRobot;



public class bridgeRun {
	Ping Ping=new Ping();
	public  bridgeRun(){}//constructor and final needed for ActionListener
	public void bridgeRun(RXTXRobot r, final int Time) {
		// to get up ramp
		r.runEncodedMotor(RXTXRobot.MOTOR1, -150, Time, RXTXRobot.MOTOR2, 195, Time);
		
		System.out.println("Bridge HO!");
				
	}
public void bridgeRun(RXTXRobot r) {
		
		r.refreshAnalogPins();
		int R=105;
		int L=100;
		int[] Speed={L,R};
		int[] PingValues;
		for(int i=200;i>=0;i--){
			
			r.runMotor(RXTXRobot.MOTOR1, Speed[0], RXTXRobot.MOTOR2, Speed[1],0 );
			PingValues=Ping.testDoublePing(r);
			
			if(PingValues[0]>115){
				PingValues[0]=PingValues[0]-115;
				Speed[1]=(int) (Speed[1]-(PingValues[0]*1.5));
			}
			if(PingValues[0]<105){
				PingValues[0]=105-PingValues[0];
				Speed[1]=(int) (Speed[1]+(PingValues[0]*1.5));
			}
			
		}
	
		System.out.println("Bridge HO!");
		

	}
}
