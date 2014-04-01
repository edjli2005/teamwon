import rxtxrobot.RXTXRobot;


public class IR {
	IR(){}
	public void IR(RXTXRobot r){
		int x=0;
		double IRreadings=-1;
		for(int i=0;i<45;i++)
		{ 
			r.refreshAnalogPins(); 
			x=r.getAnalogPin(5).getValue(); 
			IRreadings= (-0.0001*(x^3)) + (0.0117*(x^2)) - (0.3357*x) + 3.7024;
			System.out.println("IR: " + IRreadings); 
			r.sleep(1000);
		} 
	}
}
