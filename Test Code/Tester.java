import rxtxrobot.*;

public class Tester {

	public static void main (String [] args)
	{
		RXTXRobot r = new RXTXRobot(); //Create RXTXRobot object 
		 
		r.setPort("/dev/tty.usbmodemfa131"); // Sets the port to COM5 
		 
		r.connect(); 
	 
		r.refreshAnalogPins(); // Cache the Analog pin information 
	 
		for (int counter = 0; counter < 20; counter++)
		{
		//for (int x=0; x < RXTXRobot.NUM_ANALOG_PINS; ++x) 
		//{ 
			AnalogPin temp = r.getAnalogPin(0); 
			System.out.println("value: " + temp.getValue()); 
		//} 
		}
		r.close(); 
		
	}
}
