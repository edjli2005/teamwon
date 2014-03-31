import rxtxrobot.*; 

public class getPing {
	
			public void getPing(RXTXRobot r) 
			{ 
				
				for (int x=0; x < 30; ++x) 
				{ 
					System.out.println("Response: " + r.getPing() + " cm"); 
					
					r.sleep(1000); 
				} 
			} 
		} 
	 	


