
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */

class MakeString {
    String integerToString(int i) {
        return String.valueOf(i);
    }

    String objIntegerToString(Integer iObj) {
        return String.valueOf(iObj.intValue());
    }
}

//public class Main {
public class LAB_WrapperClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int i=sc.nextInt();
			System.out.printf("int i: %s, object iObj: %s\n",new MakeString().integerToString(i),new MakeString().objIntegerToString(i));
		}
		sc.close();
	}
}
