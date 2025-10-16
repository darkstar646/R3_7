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

/*
public class OvalLoop extends MyFrame2{
	public void run() {
		int x=120;
		int y=130;
		int r_1=150;
		int r_1_extra=(r_1-r_1/5);
		int r_2=30;
		int n=37025447%5+6;
		int s=360/n;
		//int first_loc_x=130+r_1;
		//int first_loc_y=130+r_1/2-r_2/2;
		System.out.println(""+n);
		System.out.println(""+s);
		
		setColor(0,136,51);
		//fillOval(130,130,r_1,r_1);
		fillOval(r_1_extra,r_1_extra,r_1,r_1);
		
		for(int i=1; i<n+1; i++){
			double cos=Math.cos(Math.toRadians(i*s));
			double sin=Math.sin(Math.toRadians(i*s));
			double loc_x=cos*(r_1/2+r_2/2)+x+(r_1/2-r_2/2);
			double loc_y=sin*(r_1/2+r_2/2)+x+(r_1/2-r_2/2);
			
			fillOval(loc_x,loc_y,r_2,r_2);
			System.out.println(""+cos);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new OvalLoop();
	}
	
}
*/

public class OvalLoop extends MyFrame2{
	public void run() {
		int x=160; 		//円の位置の左右
		int y=160; 		//円の位置の上下		
		int r_1=60; 		//大きい円の半径
		int r_2=15;			//小さい円の半径		
		int n=37025447%5+6;
		int s=360/n;
		//int x_1=(right+r_1/2); 		//大きい円の中心のx座標
		//int y_1=(down+r_1/2); 		//大きい円の中心のy座標
		
		System.out.println(""+n);
		System.out.println(""+s);
		
		setColor(0,136,51);
		fillOval(x,y,r_1*2,r_1*2);
		
		for(int i=1; i<n+1; i++){
			double cos=Math.cos(Math.toRadians(i*s));
			double sin=Math.sin(Math.toRadians(i*s));
			double loc_x=cos*(r_1+r_2)+x+(r_1-r_2);
			double loc_y=sin*(r_1+r_2)+y+(r_1-r_2);
			
			fillOval(loc_x,loc_y,r_2*2,r_2*2);
			System.out.println(""+cos);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new OvalLoop();
		frame1.setSize(500,500);
	}
	
}

