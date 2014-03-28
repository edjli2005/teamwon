import rxtxrobot.*; 

public class getPing {
	
			public void getPing(RXTXRobot r) 
			{ 
				
				for (int x=0; x < 10; ++x) 
				{ 
					System.out.println("Response: " + r.getPing() + " cm"); 
					//System.out.println("Analog: "+r.getAnalogPin(13).getValue());
					r.sleep(1000); 
				} 
				r.close(); 
			} 
		} 
	 	


