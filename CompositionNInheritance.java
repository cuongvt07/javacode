
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */

class Point {
    // Private variables
    private int x; // x co-ordinate
    private int y; // y co-ordinate
    // Constructor

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
    public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Public methods
	@Override
    public String toString() {
        return String.format("Point[%d, %d]", x, y);
    }
}

class Line{
	private Point p1,p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Line(int x1,int y1,int x2,int y2){
		this.p1=new Point(x1, y1);
		this.p2=new Point(x2, y2);
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public double distance(){
		return Math.sqrt((this.p1.getX()-this.p2.getX())*(this.p1.getX()-this.p2.getX())+(this.p1.getY()-this.p2.getY())*(this.p1.getY()-this.p2.getY()));
	}
	//note atan2 phai lay p2-p1
	public double gradient(){
		return Math.atan2(this.p2.getY()-this.p1.getY(), this.p2.getX()-this.p1.getX());
	}
}

class LineSub extends Point{
	private Point p1;

	public LineSub(Point p1, Point p2) {
		super(p2.getX(), p2.getY());
		this.p1 = p1;
	}
	
	public LineSub(int x1,int y1,int x2,int y2){
		super(x2, y2);
		this.p1=new Point(x1, y1);
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	public double distance(){
		return Math.sqrt((this.p1.getX()-super.getX())*(this.p1.getX()-super.getX())+(this.p1.getY()-super.getY())*(this.p1.getY()-super.getY()));
	}
	//note atan2 phai lay p2-p1
	public double gradient(){
		return Math.atan2(super.getY()-this.p1.getY(), super.getX()-this.p1.getX());
	}
}

public class CompositionNInheritance {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			String[] ses=br.readLine().trim().split(" ");
			String opt=ses[0];
			int x1=Integer.parseInt(ses[1]),y1=Integer.parseInt(ses[2]),
					x2=Integer.parseInt(ses[3]),y2=Integer.parseInt(ses[4]);
			
			if(opt.equalsIgnoreCase("CPoint")){
				Line l=new Line(new Point(x1, y1), new Point(x2, y2));
				System.out.printf("Line[Point[%d, %d], Point[%d, %d]]\n", 
						l.getP1().getX(), 
						l.getP1().getY(), 
						l.getP2().getX(), 
						l.getP2().getY()
				);
			}
			else if (opt.equalsIgnoreCase("Cint")){
				Line l=new Line(x1,y1,x2,y2);
				System.out.printf("Line[[%d, %d], [%d, %d]]\n", 
						l.getP1().getX(),
						l.getP1().getY(),
						l.getP2().getX(),
						l.getP2().getY()
				);
			}
			else if (opt.equalsIgnoreCase("IPoint")){
				LineSub lineSub=new LineSub(new Point(x1,y1),new Point(x2, y2));
				System.out.printf("Line[Point[%d, %d], Point[%d, %d]]\n", 
						lineSub.getP1().getX(),
						lineSub.getP1().getY(),
						lineSub.getX(),
						lineSub.getY()
				);
			}
			else if (opt.equalsIgnoreCase("Iint")){
				LineSub lineSub=new LineSub(x1,y1,x2,y2);
				System.out.printf("Line[[%d, %d], [%d, %d]]\n", 
						lineSub.getP1().getX(),
						lineSub.getP1().getY(),
						lineSub.getX(),
						lineSub.getY()
				);
			}
			else if (opt.equalsIgnoreCase("LEN")){
				Line l=new Line(x1, y1, x2, y2);
				System.out.printf("%.2f\n",l.distance());
			}
			else if (opt.equalsIgnoreCase("GRA")){
				Line l=new Line(x1, y1, x2, y2);
				System.out.printf("%.2f\n",l.gradient());
			}
		}
		
		
		br.close();
	}
}
