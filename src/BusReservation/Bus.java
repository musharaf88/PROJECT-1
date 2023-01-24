package BusReservation;

public class Bus 
{
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap)
	{
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getbusNo()
	{
		return busNo;
	}
	public boolean getac()
	{
		return ac;
	}
	public void setac(boolean val)
	{
		ac=val;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity=cap;
	}
	public void displayBusInfo()
	{
		System.out.println("Bus No: "+ busNo +"Ac: "+ ac +"Capacity: "+capacity);
	}

}
