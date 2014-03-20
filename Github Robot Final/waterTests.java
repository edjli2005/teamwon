import rxtxrobot.RXTXRobot;

public class waterTests {
	
	public waterTests(){}
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
		while((Tdiff>1||Tdiff<-1)||(Sdiff>1||Sdiff<-1)){//While values are still rapidly changing
			//Turbidity									//because the sensors haven't calibrated
			r.sleep(3000);								//to the water, keep testing the water
			r.refreshAnalogPins();
			r.refreshDigitalPins();
			PIN3=r.getAnalogPin(3).getValue();//gets pin values
			PIN4=r.getAnalogPin(4).getValue();
			PIN5=r.getAnalogPin(5).getValue();
			PIN11=r.getDigitalPin(11).getValue();
			
			System.out.println("Total Light: "+PIN3);//main turbidity measurement
			R=PIN4-PIN5;
			
			System.out.println("Current 1: "+PIN4);//main salinity measurements
			System.out.println("Current 1: "+PIN5);
			System.out.println("Current Diff: "+R);
			
			Turbidity=(Math.log(PIN3))/a;//turbidity math
			System.out.println("Possible Turbidity: " + Turbidity);
			
			Salinity=(R-211.105755695)/104.3674879954;//salinity math
			System.out.println("Possible Salinity: "+Salinity);
			
			TSECOND=TFIRST;
			TFIRST=PIN3;
			Tdiff=TFIRST-TSECOND;	//differences between measurements for turbidity				

			SSECOND=SFIRST;
			SFIRST=R;
			Sdiff=SFIRST-SSECOND;	//differences between measurements for salinity		
		

		}
		//System.out.println(PIN4);
		//System.out.println(PIN5);
		//System.out.println(PIN11);
		//System.out.println(R);
		//Salinity=distance/(R*area);
		System.out.println("Final Turbidity: "+ Turbidity);//final outputs, will be put into array
		System.out.println("Final Salinity: "+Salinity);
		testValues[0]=Turbidity;
		testValues[1]=Salinity;
		
		return testValues;
	}
}

