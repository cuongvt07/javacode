
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
//public class Main{
public class LAB_TwoSum {
	static class E{
		public int x;
		public int pos;

		public E(int x, int pos) {
			this.x = x;
			this.pos = pos;
		}
	}
	
	public static int bs(ArrayList<E> a,int x,int l,int r){
		while(l<=r){
			int m=l+(r-l)/2;
			int x1=a.get(m).x;
			
			if(x1>x)
				r=m-1;
			else if(x1<x)
				l=m+1;
			else
				return m;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		out:while(t-->0){
			int n=sc.nextInt();
			ArrayList<E> a=new ArrayList<>();
			
			for(int i=0;i<n;i++)
				a.add(new E(sc.nextInt(),i));
			
			int x=sc.nextInt();
			
			a.sort(new Comparator<E>(){
				@Override
				public int compare(E o1, E o2) {
					return o1.x-o2.x;
				}
			});
			
			for(int i=0;i<n-1;i++)
				if(a.get(i).x<=x){
					int pos=bs(a,x-a.get(i).x,i+1,n-1);
					
					if(pos!=-1){
						int pos1 = a.get(i).pos;
						int pos2 = a.get(pos).pos;
						
						if(pos1<pos2)
							System.out.println(pos1+" "+pos2);
						else
							System.out.println(pos2+" "+pos1);
						
						continue out;
					}
				}
			
			System.out.println("Not found");
		}
		
		sc.close();
	}
}
