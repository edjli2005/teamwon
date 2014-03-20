import java.util.Scanner;

import rxtxrobot.RXTXRobot;


public class salinityTest {

	public salinityTest(){}//constructor needed for ActionListener
	public double salinityTest(RXTXRobot r) {
		//RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		Scanner s= new Scanner(System.in);
		//r.setPort("COM4"); // Set the port to COM4
		//r.connect();
		r.refreshAnalogPins();
		double PIN4=r.getAnalogPin(4).getValue();
		double PIN5=r.getAnalogPin(5).getValue();
		double PIN11=r.getDigitalPin(11).getValue();
		double R=PIN4-PIN5;
		double distance=0.9;
		double area=6.32;
		double diff=100;
		double FIRST=100;
		double SECOND=-1;
		while(diff>1||diff<-1){
			r.sleep(3000);
			r.refreshAnalogPins();
			r.refreshDigitalPins();
			PIN4=r.getAnalogPin(4).getValue();
			PIN5=r.getAnalogPin(5).getValue();
			PIN11=r.getDigitalPin(11).getValue();
			R=PIN4-PIN5;
			System.out.println(PIN4);
			System.out.println(PIN5);
			System.out.println(R);
			System.out.println();
			SECOND=FIRST;
			FIRST=R;
			diff=FIRST-SECOND;
		}
		double Salinity=(R-211.105755695)/104.3674879954;
		//System.out.println(PIN4);
		//System.out.println(PIN5);
		//System.out.println(PIN11);
		//System.out.println(R);
		//Salinity=distance/(R*area);
		System.out.println(Salinity);
		return Salinity;

//		Salinity=(R-310.52)/26866;
	//	System.out.println();
		//System.out.println(Salinity);
		//}
		//r.close();
	}

}
