package task;

import java.util.Scanner;

public class Wheel extends CyclePart {
	private float wheeltube;
	private float spoke;
	private float pricewheel;

	Scanner sc=new Scanner(System.in);
	private static Wheel wheelobj = null;

	private Wheel()
	{
		
	}

	public static Wheel getInstnce() {
		if (wheelobj == null) {
			wheelobj = new Wheel();
			return wheelobj;
		} else
			return wheelobj;
	}

	

	public float getPricewheel() {
		return pricewheel;
	}

	public void setPricewheel(float pricewheel) {
		this.pricewheel = pricewheel;
	}

	public Wheel(String wheel) {
		super("wheel");

System.out.println("enter conf whell");
System.out.println("enter spoke ");
this.spoke=sc.nextFloat();
System.out.println("enter tubetype ");
this.wheeltube=sc.nextFloat();
		//this.spoke = spoke;
	}

	public void function(float tubetype) throws CycleException {
		super.function(tubetype);
		float pricewheela = tubetype + this.wheeltube;
		this.setPricewheel(pricewheela);
		this.totalprice(pricewheela);

		String wheelPrice = "wheel price is " + pricewheela;
		this.status(wheelPrice);

	}
}
