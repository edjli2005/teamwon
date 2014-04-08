
public class NormalObjectMichael {

	int XLength;
	int YLength;
	int[] Lengths=new int[2];
	public void NormalObjectMichael(){}//Use to instantiate objects on course to avoid hitting, i.e. dispensers. Check to make sure not hitting anything.
	public int getXLength(){
		System.out.println("XLength is "+ XLength);
		return XLength;
	}
	public String setXLength(int newXLength){
		String Confirm=("Setting new XLength to "+ newXLength);
		System.out.println(Confirm);
		XLength=newXLength;
		Lengths[0]= newXLength;
		return Confirm;
	}
	public int getYLength(){
		System.out.println("YLength is "+ YLength);
		return YLength;
	}
	public String setYLength(int newYLength){
		String Confirm=("Setting new YLength to "+ newYLength);
		System.out.println(Confirm);
		YLength=newYLength;
		Lengths[1]=newYLength;
		return Confirm;
	}
	public int[] getLengths(){
		System.out.println("XLength is "+ Lengths[0]+" and YLength is "+ Lengths[1]);
		return Lengths;
	}
	public String setLengths(int[] newLengths){
		String Confirm=("Setting new XLength to "+ newLengths[0]+ "and setting new YLength to "+newLengths[1]);
		System.out.println(Confirm);
		Lengths=newLengths;
		XLength=newLengths[0];
		YLength=newLengths[1];
		return Confirm;
	}
}
