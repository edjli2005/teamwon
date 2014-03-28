import java.util.Scanner;
import java.lang.*;

import rxtxrobot.*;


public class turbidityTest {

	
	public turbidityTest(){}////constructor needed for ActionListener
	public double turbidityTest(RXTXRobot r) {
		
		
		//RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		Scanner s= new Scanner(System.in);
		//r.setPort("COM4"); // Set the port to COM3 
		//r.setVerbose(true); // Turn on debugging messages 
		//r.connect(); 
		double diff=100;
		double FIRST=100;
		double SECOND=-1;
		double Turbidity=-1;
		double a=0.03356972;
		while(diff>1||diff<-1){
			r.sleep(3000);
			r.refreshAnalogPins();
			double PIN3=r.getAnalogPin(3).getValue();
			System.out.println(PIN3);	
			Turbidity=(Math.log(PIN3))/a;
			System.out.println("THE TURBIDITY IS PROBABLY " + Turbidity);
			SECOND=FIRST;
			FIRST=PIN3;
			
			diff=FIRST-SECOND;
			
		}
		
		return Turbidity;
		//r.close();
	}

}