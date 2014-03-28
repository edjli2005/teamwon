import rxtxrobot.*;

public class Retrieve {
	public  Retrieve(){}//constructor and final needed for ActionListener
	public void Retrieve(RXTXRobot r, final int Times) {
		
		for(int i=0;i<Times;i++){
		r.runMotor(RXTXRobot.MOTOR3, -175,500 );
		r.runMotor(RXTXRobot.MOTOR3,175,500 );
	}
		System.out.println("Retireve Done");
		
	}
}
