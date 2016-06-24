package nolan.oop.base;

public class Point {
	
	double x ;
	double y ;
	double z ;
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}


	
	public Point(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	public Point(double x,double y,double z){
		this(x,y);
		this.z = z;
	}
	
	public double getDistance(Point p){
		double d = Math.sqrt(
				   (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z)
				);
				return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1,2,3);
		Point p2 = new Point(4,5,6);
		System.out.println(p1.getDistance(p2));

	}

}
