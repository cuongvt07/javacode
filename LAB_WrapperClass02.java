
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

class ListNum {
	private Object[] o;

	public ListNum(Object[] o) {
		this.o = o;
	}
	
	public Object[] getMidItem() {
		int size=o.length;
		
		int pos=size/2;
		String spos=String.valueOf(o[pos]);
		
		if(spos.contains("f"))
			o[pos]=spos.substring(0,spos.length()-1);
		
		if(size%2==0){
			int pos1=pos-1;
			String spos1=String.valueOf(o[pos1]);
			
			if(spos1.contains("f"))
				o[pos1]=spos1.substring(0,spos1.length()-1);
			
			return new Object[]{o[pos1], o[pos]};
		}
		
		return new Object[]{o[pos]};
	}
	
	@Override
	public String toString(){
		Object[] res=this.getMidItem();
		
		if(res.length==2)
			return String.valueOf(res[0])+" "+String.valueOf(res[1]);
		
		return String.valueOf(res[0]);
	}
}

//public class Main {
public class LAB_WrapperClass02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			Object[] res=br.readLine().trim().split(" ");
			
			ListNum l=new ListNum(res);
			
			System.out.println(l);
		}
	}
}
