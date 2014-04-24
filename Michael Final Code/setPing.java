import java.util.Arrays;

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
				r.refreshDigitalPins();
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
				r.refreshDigitalPins();
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
						r.refreshDigitalPins();
						Ping=r.getPing(8);
						System.out.println("Response: " + Ping + " cm"); 
						
						r.sleep(1000); 
					} 
				}
				if(whichPing==1){
					for (int y=0; y < 5; y++) //for the Y Coordinate
					{ 
						r.refreshAnalogPins(); 
						r.refreshDigitalPins();
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
				int[] medianX=new int[5];
				int[] medianY=new int[5];
				for(int z=0;z<5;z++)
				{
					r.refreshAnalogPins();//detects ping
					r.refreshDigitalPins();
					Pingx=r.getPing(8);
					Pingy=r.getPing(13);
					if(Pingx>0||Pingx<250){
					medianX[z]=Pingx;
					}
					if(Pingy>0||Pingy<250){
					medianY[z]=Pingy;
					}
					Arrays.sort(medianX);
					Arrays.sort(medianY);
					if(medianX.length<=3){
						Pingx=medianX[1];
					}
					else{
						Pingx=medianX[2];
					}
					if(medianY.length<=3){
						Pingy=medianY[1];
					}
					else{
						Pingy=medianY[2];
					}
					System.out.println("Response: " + Pingx + ", " + Pingy + "cm");
				}
				Lola.setX(Pingx);
				Lola.setY(Pingy);//sets ping in lola object
				  int[] returnPing={-1,-1,Pingx,Pingy};//{coordinate x,y,ping x,y}
				  return returnPing;
			}
			public int[] setPingATBRIDGE(RXTXRobot r,LolaObjectMichael Lola){
				int Pingx=-1;
				int Pingy=-1;
				for(int z=0;z<5;z++)
				{
					r.refreshAnalogPins();//detects ping
					r.refreshDigitalPins();
					Pingx=r.getPing(8);
					Pingy=0;
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
		
	 	


