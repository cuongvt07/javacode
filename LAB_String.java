
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
public class LAB_String {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] s=br.readLine().trim().split("\\s+");
		
		StringBuilder res=new StringBuilder("");
		
		for(int i=1;i<s.length;++i){
			if(res.length()>0 && s[i].charAt(0)>='A' && s[i].charAt(0)<='Z'){
				res.deleteCharAt(res.length()-1);
				res.append(". ");
			}
			
			res.append(s[i]).append(" ");
		}
		
		if(res.length()>0)
			res.deleteCharAt(res.length()-1).append(".");
		
		System.out.print(res);
		
		br.close();
	}
}
