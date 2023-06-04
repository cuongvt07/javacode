
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
class User{
	private int id;
	private String email;

	public User(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("%06d",id)+" "+email;
	}
}

public class LAB_GetSet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		User[] u=new User[t+1];
		int idx=1;
		
		while(t-->0){
			String[] s=sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
			
			if(s[0].equalsIgnoreCase("C")){
				u[idx]=new User(idx);
				System.out.println(u[idx]);
				idx++;
			}
			else if(s[0].equalsIgnoreCase("Set")){
				int id1=Integer.valueOf(s[1]);
				u[id1].setEmail(s[2]);
				System.out.println(u[id1]);
			}
			else{
				int id1=Integer.valueOf(s[0]);
				System.out.println(u[id1]);
			}
		}
		
		sc.close();
	}
}
