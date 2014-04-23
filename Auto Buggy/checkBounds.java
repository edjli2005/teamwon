import rxtxrobot.RXTXRobot;


public class checkBounds {
	
	public void checkBounds(){}
	public String checkBounds(RXTXRobot r, LolaObjectMichael Lola,BoundaryObjectMichael Bounds, Ping Ping) //function gets ping from sensor depending on whichPing telling it which ping sensor to pull from
	{ 
		String ERROR="Position correct";
		Ping.setPing(r,Lola);
		//checks VS boundary
		if(Lola.getX()>=(Bounds.getXLimit()-5)){
			ERROR="Lola too close to X Boundary.";
			System.out.println(ERROR);
			return ERROR;
		}
		if(Lola.getX()<= 5){
			ERROR="Lola too close to something.";
			System.out.println(ERROR);
			return ERROR;
		}
		if(Lola.getY()>=(Bounds.getYLimit()-5)){
			ERROR="Lola too close to Y Boundary.";
			System.out.println(ERROR);
			return ERROR;
		}
		if(Lola.getY()<= 5){
			ERROR="Lola too close to something.";
			System.out.println(ERROR);
			return ERROR;
		}
		return ERROR;
	}
	
	/*public Boolean tooCloseX(RXTXRobot r, LolaObjectMichael Lola,NormalObjectMichael Objects, Ping Ping){
		Ping.setPing(r,Lola);
		if(Lola.getX()<=5){
			return true;
		}
		
	}*/
}
