package BusReservation;
import java.util.Scanner;
import java.util.ArrayList;

public class BusMain 
{
	public static void main(String[] args) 
	{
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,53));
		buses.add(new Bus(3,true,43));
		
		int useropt=1;
		Scanner sc=new Scanner(System.in);
		
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		
		
		while(useropt==1)
		{
			System.out.println("Enter 1 to Book and 2 to exit");
			useropt=sc.nextInt();
			if(useropt==1)
			{
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("Your booking is Confirmed");
				}
				else
				{
					System.out.println("Sorry Bus is Full. If you Try Another Bus or Date");
				}
			}
		}
		
	}

}
