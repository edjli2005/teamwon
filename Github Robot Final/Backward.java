import rxtxrobot.RXTXRobot;

public class Backward {

	public Backward(RXTXRobot r, int Time) {
		r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, -125,Time );//starts moving
		System.out.println("Backward Done");
		r.sleep(1500);
		r.close();
	}

}
