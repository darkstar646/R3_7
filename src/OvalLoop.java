//R3_7
/*計算結果は2
public class OvalLoop {
	public static void main(String[] args) {
		int x=37025447;
		int y=(x%5);
		System.out.println(y);
	}
}
*/

/*
public class OvalLoop{
        public static void main(String[] args){
                                int[] degrees = {30,90,150,210,270,330};
                                        for(int i=0; i<5; i++){
                                                                 System.out.printf("sin%d = %frn",degrees[i],Math.sin(Math.toRadians(degrees[i])));
                                        }
                 for(int i=0; i<5; i++){
                         System.out.printf("cos%d = %frn",degrees[i],Math.cos(Math.toRadians(degrees[i])));
                 }
                 for(int i=0; i<5; i++){
                         System.out.printf("tan%d = %frn",degrees[i],Math.tan(Math.toRadians(degrees[i])));
                 }
         }
}
*/


public class OvalLoop extends MyFrame2{
	public void run() {
		setColor(0,136,51);
		fillOval(100,100,130,130);
	}

	public static void main(String[] args) {
		MyFrame2 frame1=new OvalLoop();
		frame1.setLocation(200,200);
		frame1.setSize(300,300);
	}
	
}
