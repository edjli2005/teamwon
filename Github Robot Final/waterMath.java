
public class waterMath {
	public waterMath(){}
	public int[] waterMath(double[] Water){
		
		
		int[] Balls= {0,0,0,0};
		
		while(Water[0]>100){
			Water[0]=Water[0]-100;
			Balls[0]=Balls[0]+1;//turbidity 100
		}
		while(Water[0]>5){
			Water[0]=Water[0]-10;
			Balls[1]=Balls[1]+1;//turbidity 10
		}
		while(Water[1]>100){
			Water[1]=Water[1]-100;
			Balls[2]=Balls[2]+1;//Salinity 100
		}
		while(Water[1]>5){
			Water[1]=Water[1]-10;
			Balls[3]=Balls[3]+1;//Salinity 10
		}
		for(int i=0;i<Balls.length;i++){
			System.out.println("Balls "+i+" is "+Balls[i]);
		}
		return Balls;
		
	}
}
