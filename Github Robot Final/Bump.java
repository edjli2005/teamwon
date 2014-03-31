import rxtxrobot.RXTXRobot;

public class Bump {
	
	public Bump(){}
	public void Bump(RXTXRobot r) {
		int bumpNum;
		boolean BUMP=false;
		for(int i=0;i<45;i++){
			r.refreshAnalogPins();
			bumpNum=r.getAnalogPin(0).getValue();
			if(bumpNum>900){
				BUMP=true;				
			}
		System.out.println(BUMP);
		r.sleep(250);
		
		}
	}
}