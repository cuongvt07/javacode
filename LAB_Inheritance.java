
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
class Circle{
	private double radius=1.0;
	private String color="red";

	public Circle() {
	}
	
	Circle(double radius){
		this.radius=radius;
	}
	
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea(){
		return 3.14*this.radius*this.radius;
	}
	
	@Override
	public String toString() {
		return "Circle[" + "radius=" + radius + ",color=" + color + ']';
	}
}

class Cyclinder extends Circle{
	private double height=1.0;

	public Cyclinder() {
	}
	
	public Cyclinder(double height) {
		this.height=height;
	}

	public Cyclinder(double radius,double height) {
		super(radius);
		this.height=height;
	}

	public Cyclinder(double radius,double height,String color) {
		super(radius, color);
		this.height=height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume(){
		return this.height*super.getArea();
	}

	@Override
	public String toString() {
		return String.format("Cylinder: radius=%.1f, height=%.1f, %s, volume=%.1f", this.getRadius(), this.getHeight(), this.getColor().toUpperCase(), this.getVolume());
	}
}

public class LAB_Inheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=Integer.parseInt(sc.next());
		
		while(t-->0){
			int c=Integer.parseInt(sc.next());
			
			if(c==0){
				System.out.println(new Cyclinder());
			}
			else if(c==1){
				double h=Double.parseDouble(sc.next());
				System.out.println(new Cyclinder(h));
			}
			else if(c==2){
				double r=Double.parseDouble(sc.next());
				double h=Double.parseDouble(sc.next());
				System.out.println(new Cyclinder(r, h));
			}
			else{
				double r=Double.parseDouble(sc.next());
				double h=Double.parseDouble(sc.next());
				String co=sc.nextLine().trim();
				System.out.println(new Cyclinder(r, h, co));
			}
		}
		
		sc.close();
	}
}
