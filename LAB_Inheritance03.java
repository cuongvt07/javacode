
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
		return String.format("Person[name=%s, address=%s]",this.name,this.address);
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

	//note lay sau 2 dau phay
	@Override
	public String toString() {
		return String.format("Student[%s, program=%s, year=%d, fee=%.1f]", 
				super.toString(),
				this.getProgram(),
				this.getYear(),
				this.getFee());
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
		return String.format("Staff[%s, school=%s, pay=%.1f]", 
				super.toString(),
				this.getSchool(),
				this.getPay());
	}
}

public class LAB_Inheritance03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			String type=br.readLine();
			String name=br.readLine();
			String add=br.readLine();
			
			if(type.equalsIgnoreCase("P")){
				pw.println(new Person(name,add));
			}
			else if(type.equalsIgnoreCase("St")){
				String prog=br.readLine();
				int year=Integer.parseInt(br.readLine());
				double fee=Double.parseDouble(br.readLine());
				
				pw.println(new Student(prog, year, fee, name, add));
			}
			else if(type.equalsIgnoreCase("Sf")){
				String school=br.readLine();
				double pay=Double.parseDouble(br.readLine());
				
				pw.println(new Staff(school, pay, name, add));
			}
		}
		
		br.close();
		pw.close();
	}
}
