import rxtxrobot.RXTXRobot;


public class ColorTest {
	ColorTest(){}
	public void ColorTest(RXTXRobot r){
		int colorReadings=-1;
		for(int i=0;i<25;i++)
		{ 
			r.refreshAnalogPins(); 
			colorReadings=r.getAnalogPin(1).getValue(); 
			System.out.println("COLOR: " +colorReadings); 
			r.sleep(1000);
		} 
	}
}
