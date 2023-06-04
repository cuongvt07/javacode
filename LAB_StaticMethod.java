
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

class FlightBooking {
	private String flightId;
	private int userId;
	private static int seatAvailable;

	public FlightBooking(int userId) {
		this.flightId = "OOP23";
		this.userId = userId;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public static int getSeatAvailable() {
		return seatAvailable;
	}

	public static void setSeatAvailable(int seatAvailable) {
		FlightBooking.seatAvailable = seatAvailable;
	}
}

//public class Main {
public class LAB_StaticMethod {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
			String[] s=br.readLine().trim().split(" ");
			int n=s.length;
			FlightBooking[] o=new FlightBooking[4];
			FlightBooking.setSeatAvailable(180);
			
			for(int i=0;i<n-1;i+=2){
				int uid=Integer.parseInt(s[i]);
				String act=s[i+1];
				o[uid]=new FlightBooking(uid);
				
				if(act.equalsIgnoreCase("Booking")){
					FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable()-1);
					System.out.printf("[Seat Available: %d]",FlightBooking.getSeatAvailable());	
				}
				else if(act.equalsIgnoreCase("Confirmed")){
					System.out.printf("--User %d Confirmed--[Seat Available: %d]",uid,FlightBooking.getSeatAvailable());
				}
				else{
					FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable()+1);
					System.out.printf("[Seat Available: %d]",FlightBooking.getSeatAvailable());
				}
			}
			
			System.out.println();
		}
		
		br.close();
	}
}
