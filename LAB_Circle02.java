
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
	private double r;
	private String color;
	
	public Circle(double r,String color){
		this.r=r;
		this.color=color;
	}
	
	public Circle() {
		this.r=1.0;
		this.color="red";
	}
	
	public Circle(double r){
		this.r=r;
		this.color="red";
	}

	public double getR() {
		return r;
	}

	public String getColor() {
		return color;
	}
}

//public class Main{
public class LAB_Circle02 {
	public static void main(String[] args) {
		Circle c;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0){
			double r=sc.nextDouble();
			String color=sc.nextLine();	//luu y mau co the chua dau cach
			
			if(r==-1)
				c=new Circle();
			else if(color.isEmpty())
				c=new Circle(r);
			else
				c=new Circle(r,color.trim());
			
			System.out.println(c.getR()+" "+c.getColor());
		}

		sc.close();
	}
}
