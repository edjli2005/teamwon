import java.util.Scanner;

import rxtxrobot.*;


public class salinityTest {

public salinityTest(){}//constructor needed for ActionListener
public void salinityTest(RXTXRobot r) {
	//RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object
	Scanner s= new Scanner(System.in);

	r.refreshAnalogPins();
	r.refreshDigitalPins();
	int conductivity=0;

	for ( int x =0; x<=10; x++)
	{

		conductivity = r.getConductivity();
	}



	double testedConductivity = (-0.30102*conductivity*conductivity) + (99.05*conductivity) - 6822.9;
	System.out.println("Conductivity: " + testedConductivity);
	}

}