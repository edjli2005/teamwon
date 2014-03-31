import rxtxrobot.RXTXRobot;


public class IR {
	IR(){}
	public void IR(RXTXRobot r){
		int IRreadings=0;
		
		for(int i=0;i<45;i++)
		{ 
			r.refreshAnalogPins(); 
			IRreadings=r.getAnalogPin(5).getValue(); 
			System.out.println("IR: " + IRreadings); 
			r.sleep(1000);
		} 
		r.close();
	}
}
