
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
//public class Main
public class LAB_ClassMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0){
			String s1=sc.nextLine();
			String[] s=s1.trim().split(" ");
			System.out.println(s1.length()+" "+s.length);
		}
		
		sc.close();
	}
}
