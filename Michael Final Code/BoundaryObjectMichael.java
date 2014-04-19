
public class BoundaryObjectMichael {
	int XLimit=244;
	int YLimit=366;
	int[] Limits=new int[2];
	
	public void BoundaryObjectMichael(){}//Use to instantiate field to stay within. Used like NormalObject, but instead test to stay inside the object.
	
	public int getXLimit(){
		System.out.println("XLimit is "+ XLimit);
		return XLimit;
	}
	public String setXLimit(int newXLimit){
		String Confirm=("Setting new XLimit to "+ newXLimit);
		System.out.println(Confirm);
		XLimit=newXLimit;
		Limits[0]= newXLimit;
		return Confirm;
	}
	public int getYLimit(){
		System.out.println("YLimit is "+ YLimit);
		return YLimit;
	}
	public String setYLimit(int newYLimit){
		String Confirm=("Setting new YLimit to "+ newYLimit);
		System.out.println(Confirm);
		YLimit=newYLimit;
		Limits[1]=newYLimit;
		return Confirm;
	}
	public int[] getLimits(){
		System.out.println("XLimit is "+ Limits[0]+" and YLimit is "+ Limits[1]);
		return Limits;
	}
	public String setLimits(int[] newLimits){
		String Confirm=("Setting new XLimit to "+ newLimits[0]+ "and setting new YLimit to "+newLimits[1]);
		System.out.println(Confirm);
		Limits=newLimits;
		XLimit=newLimits[0];
		YLimit=newLimits[1];
		return Confirm;
	}
	

}
