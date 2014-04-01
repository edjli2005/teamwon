import rxtxrobot.RXTXRobot;

public class Bump {
	
	public Bump(){}
	public boolean Bump(RXTXRobot r) {
		int bumpNum;
		boolean BUMP=false;
		
			r.refreshAnalogPins();
			bumpNum=r.getAnalogPin(0).getValue();
			if(bumpNum>900){
				BUMP=true;
				return true;
			}
				
		
		
		return false;
	}
}