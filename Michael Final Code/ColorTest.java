import rxtxrobot.RXTXRobot;


public class ColorTest {
	ColorTest(){}
	public int ColorTest(RXTXRobot r){
		double x;
		double y;
		for(int i=0;i<25;i++)
		{ 
			r.refreshAnalogPins(); 
			x=r.getPing(8);
			y=r.getPing(13);
			System.out.println("X " +x+"Y "+y); 
			
			r.sleep(500);
		} 
		return 1;
	}
}
