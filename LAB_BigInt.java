
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
public class LAB_BigInt {
//public class Main {
	public static void main(String[] args) 
    {
		
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
        	String sa=sc.next(), ss=sc.next(), sb=sc.next();
        	BigInteger a = new BigInteger(sa);
            BigInteger b = new BigInteger(sb);
            
            if(ss.compareTo("+")==0)
            	System.out.println(a.add(b));
            else if(ss.compareTo("-")==0)
            	System.out.println(a.subtract(b));
            else if(ss.compareTo("*")==0)
            	System.out.println(a.multiply(b));
            else if(ss.compareTo("/")==0)
            	System.out.println(a.divide(b));
        }
        
        
        sc.close();
    }

}
