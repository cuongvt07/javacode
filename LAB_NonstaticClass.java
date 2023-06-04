/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin1
 */
//public class Main{
public class LAB_NonstaticClass {
	class SinhVien{
		public String id="DCVT099";
		public String name="Nguyen Nam";
	}
	
	public static void main(String[] args) {
		SinhVien o=new LAB_NonstaticClass().new SinhVien();
		System.out.println(o.id+" "+o.name);
	}
}
