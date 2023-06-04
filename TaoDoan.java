
import java.io.BufferedReader;
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
//public class Main{
public class TaoDoan {
	static void exec(BufferedReader br,PrintWriter pw) throws Exception {
		
		String[] s=br.readLine().trim().split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<s.length;++i){
			if(s[i].charAt(0)>='A' && s[i].charAt(0)<='Z' && sb.length()>0){
				sb.delete(sb.length()-1, sb.length());
				sb.append(". ");
			}
			
			sb.append(s[i]).append(" ");
		}
		
		if(sb.length()>0)
			sb.delete(sb.length()-1, sb.length()).append('.');
		
		pw.println(sb.toString());
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
//		int t=Integer.parseInt(br.readLine());
		int t=1;

		while(t-->0)
			exec(br,pw);
	
		pw.close();
		br.close();
	}
}
