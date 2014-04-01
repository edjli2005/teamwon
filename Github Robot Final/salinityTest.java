import java.util.Scanner;

import rxtxrobot.*;


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
		int con = -1;
		while(diff!=0){//diff>1||diff<-1
			r.sleep(1000);
			r.refreshAnalogPins();
			r.refreshDigitalPins();
			PIN4=r.getAnalogPin(4).getValue();
			PIN5=r.getAnalogPin(5).getValue();
			con=r.getConductivity();
			PIN11=r.getDigitalPin(11).getValue();
			R=PIN4-PIN5;
			System.out.println(PIN4);
			System.out.println(PIN5);
			System.out.println(R);
			System.out.println(con);
			System.out.println();
			
			SECOND=FIRST;//diff is for while loop, has nothing to do with salinity
			FIRST=R;
			diff=FIRST-SECOND;
		}
		double Salinity= (0.1254*R) - 10.074;
		System.out.println(PIN4);
		System.out.println(PIN5);
		//System.out.println(PIN11);
		System.out.println(R);
		System.out.println(con);
		//Salinity=distance/(R*area);
		System.out.println(Salinity);

		return R;

	}

}
