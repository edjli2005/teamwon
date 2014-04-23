import rxtxrobot.RXTXRobot;

public class Bump {
	
	public Bump(){}
	public boolean Bump(RXTXRobot r) {
		int bumpNum=1200;
		boolean BUMP=false;
		
			r.refreshAnalogPins();
			bumpNum=r.getAnalogPin(2).getValue();
			System.out.println(r.getAnalogPin(2).getValue());
			
			return true;
	}
}