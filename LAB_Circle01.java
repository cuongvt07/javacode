/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */

class Circle{
	private double r;
	private String color;
	Circle(){
		this.r=1.0;
		this.color="red";
	}

	public double getR() {
		return r;
	}

	public String getColor() {
		return color;
	}
	
	public double  getArea(){
		return Math.PI*this.r*this.r;
	}
}

//public class Main{
public class LAB_Circle01 {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.getR() + " " + c.getColor());
		System.out.println(c.getArea());
	}
}
