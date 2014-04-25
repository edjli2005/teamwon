import rxtxrobot.*;

public class waterTests {
 
	public waterTests(){}
	public double[] waterTests(RXTXRobot r) {
 

 
 
		//this is the new conductivity the testedcon equation needs to be edited when I get back
 
		r.refreshAnalogPins();
		r.refreshDigitalPins();
		int conductivity=0;
		
		for ( int x =0; x<=10; x++)
		{
			
			conductivity = r.getConductivity();
		}
 
 
 
		double testedConductivity = (-0.30102*conductivity*conductivity) + (99.05*conductivity) - 6822.9;
		System.out.println("arduino con: " + conductivity + "Conductivity: " + testedConductivity);//MICHAEL I think testedConductivity is the salinity, 
																									//I will put it in an array and return it
		
		//Turbidity
		r.sleep(5000);
		int pinThree;
		int total=0;
		for (int x = 0; x<=10; x++)
		{
			r.refreshAnalogPins();
			pinThree=r.getAnalogPin(3).getValue();
			total= total+pinThree;
		}
 
		int avgPinVal = total/10;
		System.out.println("Turbidity pins: " + avgPinVal);//MICHAEL I think avgPinVal is the turbidity value,
															//I will put it in an array and return it
 
		//int actualValue = a(avgPinVal) + b - values are what you find in the equation
 
		//System.out.println("Turbidity of water is " + actualValue);

		//didn't know what to return?
		//MICHAEL's EDITS
		double[] returnValues={testedConductivity,avgPinVal};//assembles {salinity,turbidity} to return*/
		double[] returnValues={550,50};
		return returnValues;
	}
}