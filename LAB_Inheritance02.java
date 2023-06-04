
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
		//dien tich hinh tron: pi*r^2
		return 3.14*this.radius*this.radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle[radius=%.1f, area=%.1f]", this.radius, this.getArea());
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
	
	@Override
	public double getArea(){
		//note: dien tich hinh tru: 2*pi*r^2 + 2*pi*r*h
		return super.getArea()+2.0*3.14*this.getRadius()*this.getHeight();
	}
	
	public double getVolume(){
		return this.height*super.getArea();
	}

	@Override
	public String toString() {
		return String.format("Cylinder[radius=%.1f, height=%.1f, area=%.1f]", this.getRadius(), this.getHeight(), this.getArea());
	}
}

public class LAB_Inheritance02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=Integer.parseInt(sc.nextLine());
		
		while(t-->0){
			String c=sc.next();
			
			if(c.equalsIgnoreCase("Ci")){
				double r=Double.parseDouble(sc.nextLine());
				System.out.println(new Circle(r));
			}
			else if(c.equalsIgnoreCase("Cy")){
				double r=Double.parseDouble(sc.next());
				double h=Double.parseDouble(sc.nextLine());
				System.out.println(new Cyclinder(r, h));
			}
		}
		
		sc.close();
	}
}
