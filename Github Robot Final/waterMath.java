
public class waterMath {
	public waterMath(){}
	public int[] waterMath(double[] Water,int First,int Second, int Third,int Fourth){
		
		
		int[] Balls= {0,0,0,0};
		
		while(Water[0]>First){
			Water[0]=Water[0]-First;
			Balls[0]=Balls[0]+1;//turbidity 
		}
		while(Water[0]>Second){
			Water[0]=Water[0]-Second;
			Balls[1]=Balls[1]+1;//turbidity 
		}
		while(Water[1]>Third){
			Water[1]=Water[1]-Third;
			Balls[2]=Balls[2]+1;//Salinity 
		}
		while(Water[1]>Fourth){
			Water[1]=Water[1]-Fourth;
			Balls[3]=Balls[3]+1;//Salinity 
		}
		for(int i=0;i<Balls.length;i++){
			System.out.println("Balls "+i+" is "+Balls[i]);
		}
		
		return Balls;
		
	}
public int[] waterMath(double[] Water){
		
		
		int[] Balls= {0,0,0,0};
		
		while(Water[0]>100){
			Water[0]=Water[0]-100;
			Balls[0]=Balls[0]+1;//turbidity 
		}
		while(Water[0]>10){
			Water[0]=Water[0]-10;
			Balls[1]=Balls[1]+1;//turbidity 
		}
		while(Water[1]>10){
			Water[1]=Water[1]-10;
			Balls[2]=Balls[2]+1;//Salinity 
		}
		while(Water[1]>100){
			Water[1]=Water[1]-100;
			Balls[3]=Balls[3]+1;//Salinity 
		}
		for(int i=0;i<Balls.length;i++){
			System.out.println("Balls "+i+" is "+Balls[i]);
		}
		return Balls;
		
	}
}
