
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

class Person{
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Modify{
	static void formatString(String name){
		name=name.toUpperCase();
	} 
	
	static void formatPerson(Person p) {
		p.name=p.name.toUpperCase();
	}
}

//public class Main {
public class LAB_Immutable {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int age=Integer.valueOf(br.readLine());
		String method=br.readLine();
		
		Person p=new Person(name,age);
		
		if(method.equalsIgnoreCase("fs"))
			Modify.formatString(p.name);
		
		else if(method.equalsIgnoreCase("fp"))
			Modify.formatPerson(p);
		
		System.out.printf("Full name: %s; %d years old.",p.name,p.age);
		
		br.close();
	}
}
