import rxtxrobot.*; 
//Contained within Ping object
public class setPing {
	public void setPing(){}
	public void setPing(RXTXRobot r, int whichPing, LolaObjectMichael Lola ) //function gets ping from sensor depending on whichPing telling it which ping sensor to pull from
	{ 
		int Pingx = -1;
		int Pingy = -1;
	
		if(whichPing==0){
			for (int x=0; x < 5; x++) //for the X Coordinate
			{
				r.refreshAnalogPins(); 
				Pingx=r.getPing(8);
				System.out.println("Response: " + Pingx + " cm"); 
				
				r.sleep(1000); 
			} 
			Lola.setX(Pingx);
		}
		
		if(whichPing==1){
			for (int y=0; y < 5; y++) //for the Y Coordinate
			{ 
				r.refreshAnalogPins(); 
				Pingy=r.getPing(13); 
				System.out.println("Response: " + Pingy + " cm"); 
				
				r.sleep(1000); 
			} 
			Lola.setY(Pingy);
		}
		if(whichPing==2){
			for(int z=0;z<5;z++)
			{
				r.refreshAnalogPins();
				Pingx=r.getPing(8);
				Pingy=r.getPing(13);
				System.out.println("Response: " + Pingx + ", " + Pingy + "cm");
			}
			Lola.setX(Pingx);
			Lola.setY(Pingy);
		}
		
	}
			public int setPing(RXTXRobot r, int whichPing ) 
			{ 
				int Ping = -1;
			
				if(whichPing==0){
					for (int x=0; x < 5; x++) //for the X Coordinate
					{
						r.refreshAnalogPins(); 
						Ping=r.getPing(8);
						System.out.println("Response: " + Ping + " cm"); 
						
						r.sleep(1000); 
					} 
				}
				if(whichPing==1){
					for (int y=0; y < 5; y++) //for the Y Coordinate
					{ 
						r.refreshAnalogPins(); 
						Ping=r.getPing(13); 
						System.out.println("Response: " + Ping + " cm"); 
						
						r.sleep(1000); 
					} 
				}
				return Ping;
			}
			public int[] setPing(RXTXRobot r,LolaObjectMichael Lola){
				int Pingx=-1;
				int Pingy=-1;
				for(int z=0;z<5;z++)
				{
					r.refreshAnalogPins();//detects ping
					Pingx=r.getPing(8);
					Pingy=r.getPing(13);
					System.out.println("Response: " + Pingx + ", " + Pingy + "cm");
				}
				Lola.setX(Pingx);
				Lola.setY(Pingy);//sets ping in lola object
				  int[] returnPing={-1,-1,Pingx,Pingy};//{coordinate x,y,ping x,y}
				  return returnPing;
			}
			public int[] setPing(RXTXRobot r){
				int Pingx=-1;
				int Pingy=-1;
				for(int z=0;z<5;z++)
				{
					r.refreshAnalogPins();
					Pingx=r.getPing(8);
					Pingy=r.getPing(13);
					System.out.println("Response: " + Pingx + ", " + Pingy + "cm");
				}
				
				  int[] returnPing={-1,-1,Pingx,Pingy};
				  return returnPing;
			}
		}
		
	 	


