import rxtxrobot.RXTXRobot;

public class Bump {
	
	public Bump(){}
	public boolean Bump(RXTXRobot r) {
		int bumpNum=1200;
		boolean BUMP=false;
		
			r.refreshAnalogPins();
			bumpNum=r.getAnalogPin(1).getValue();
			System.out.println(r.getAnalogPin(1).getValue());
			
			return true;
	}
}