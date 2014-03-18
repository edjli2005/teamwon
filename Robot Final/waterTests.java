import rxtxrobot.RXTXRobot;

public class waterTests {
	
	public double[] waterTests(RXTXRobot r) {
	
		//Variables
		double[] testValues= new double[2];
		double Tdiff=100;
		double TFIRST=100;
		double TSECOND=-1;
		double Turbidity=-1;
		double Salinity=-1;
		double a=0.03356972;
		double PIN3=r.getAnalogPin(3).getValue();
		double PIN4=r.getAnalogPin(4).getValue();
		double PIN5=r.getAnalogPin(5).getValue();
		double PIN11=r.getDigitalPin(11).getValue();
		double R=PIN4-PIN5;
		double distance=0.9;
		double area=6.32;
		double Sdiff=100;
		double SFIRST=100;
		double SSECOND=-1;
		while((Tdiff>1||Tdiff<-1)||(Sdiff>1||Sdiff<-1)){
			//Turbidity
			r.sleep(3000);
			r.refreshAnalogPins();
			r.refreshDigitalPins();
			PIN3=r.getAnalogPin(3).getValue();
			System.out.println("Total Light: "+PIN3);	
			Turbidity=(Math.log(PIN3))/a;
			System.out.println("Possible Turbidity: " + Turbidity);
			TSECOND=TFIRST;
			TFIRST=PIN3;
			Tdiff=TFIRST-TSECOND;				
				//Salinity
			PIN4=r.getAnalogPin(4).getValue();
			PIN5=r.getAnalogPin(5).getValue();
			PIN11=r.getDigitalPin(11).getValue();
			R=PIN4-PIN5;
			System.out.println("PIN4: "+PIN4);
			System.out.println("PIN5: "+PIN5);
			System.out.println("Current: "+R);
			System.out.println();
			SSECOND=SFIRST;
			SFIRST=R;
			Sdiff=SFIRST-SSECOND;			
			Salinity=(R-211.105755695)/104.3674879954;
			System.out.println("Possible Salinity: "+Salinity);

		}
		//System.out.println(PIN4);
		//System.out.println(PIN5);
		//System.out.println(PIN11);
		//System.out.println(R);
		//Salinity=distance/(R*area);
		System.out.println("Final Turbidity: "+ Turbidity);
		System.out.println("Final Salinity: "+Salinity);
		testValues[0]=Turbidity;
		testValues[1]=Salinity;
		
		r.close();
		return testValues;
	}
}

