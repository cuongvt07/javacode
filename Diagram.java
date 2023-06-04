
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
class Person{
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person[" + "name=" + name + ", address=" + address + ']';
	}
}

class Student extends Person{
	private String program;
	private int year;
	private double fee;

	public Student(String program, int year, double fee, String name, String address) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return String.format("Student[Person[name=%s, address=%s], program=%s, year=%d, fee=%.1f]", this.getName(), this.getAddress(), this.getProgram(), this.getYear(), this.fee);
	}
}

class Staff extends Person{
	private String school;
	private double pay;

	public Staff(String school, double pay, String name, String address) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return String.format("Staff[Person[name=%s, address=%s], school=%s, pay=%.1f]", this.getName(), this.getAddress(), this.getSchool(), this.getPay());
	}
}

public class Diagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=Integer.parseInt(sc.nextLine());
		
		while(t-->0){
			String act=sc.nextLine();
			String name=sc.nextLine();
			String addr=sc.nextLine();
			
			if(act.equalsIgnoreCase("P")){
				System.out.println(new Person(name, addr));
			}
			else if(act.equalsIgnoreCase("St")){
				String pro=sc.nextLine();
				int year=Integer.parseInt(sc.nextLine());
				double fee=Double.parseDouble(sc.nextLine());
				System.out.println(new Student(pro, year, fee, name, addr));
			}
			else if(act.equalsIgnoreCase("Sf")){
				String school=sc.nextLine();
				double pay=Double.parseDouble(sc.nextLine());
				System.out.println(new Staff(school, pay, name, addr));
			}
		}
		
		sc.close();
	}
}
