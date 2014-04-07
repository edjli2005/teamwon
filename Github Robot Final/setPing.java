import rxtxrobot.*; 

public class setPing {
	public void setPing(){}
	public int setPing(RXTXRobot r, int whichPing, LolaObjectMichael Lola ) //function gets ping from sensor depending on whichPing telling it which ping sensor to pull from
	{ 
		int Ping = -1;
	
		if(whichPing==0){
			for (int x=0; x < 5; x++) //for the X Coordinate
			{
				r.refreshAnalogPins(); 
				Ping=r.getPing();
				System.out.println("Response: " + Ping + " cm"); 
				
				r.sleep(1000); 
			} 
			Lola.setX(Ping);
		}
		
		if(whichPing==1){
			for (int y=0; y < 5; y++) //for the Y Coordinate
			{ 
				r.refreshAnalogPins(); 
				Ping=r.getAnalogPin(8).getValue(); 
				System.out.println("Response: " + Ping + " cm"); 
				
				r.sleep(1000); 
			} 
			Lola.setY(Ping);
		}
		return Ping;
	}
			public int setPing(RXTXRobot r, int whichPing ) 
			{ 
				int Ping = -1;
			
				if(whichPing==0){
					for (int x=0; x < 5; x++) //for the X Coordinate
					{
						r.refreshAnalogPins(); 
						Ping=r.getPing();
						System.out.println("Response: " + Ping + " cm"); 
						
						r.sleep(1000); 
					} 
				}
				if(whichPing==1){
					for (int y=0; y < 5; y++) //for the Y Coordinate
					{ 
						r.refreshAnalogPins(); 
						Ping=r.getAnalogPin(8).getValue(); 
						System.out.println("Response: " + Ping + " cm"); 
						
						r.sleep(1000); 
					} 
				}
				return Ping;
			}
		} 
	 	


