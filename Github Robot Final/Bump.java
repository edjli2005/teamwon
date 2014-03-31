import rxtxrobot.RXTXRobot;

public class Bump {
	
	public Bump(){}
	public void Bump(RXTXRobot r) {
		
		for(int i=0;i<10;i++){
	
		r.getAnalogPin(0);
		r.sleep(250);
		r.close();
		}
	}
}