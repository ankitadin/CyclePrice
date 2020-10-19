package task;

import java.util.Scanner;

public class Seating extends CyclePart {
	private float luxarysit;
	private float seatingprice;
	Scanner sc=new Scanner(System.in);

	
	public Seating()
	{
		
	}
	
	
	public float getSeatingprice() {
		return seatingprice;
	}

	public void setSeatingprice(float seatingprice) {
		this.seatingprice = seatingprice;
	}

	public Seating(String seat) {
		super("seating");
		System.out.println("seating congf");
		System.out.println("enter luxary sit ");
		
		this.luxarysit = sc.nextFloat();
	}
	
	/* GETTERS */
	
	public float getEngineAgeModifier() { return this.luxarysit; }
	
	/* SETTERS */
	
	public void setEngineAgeModifier(float newModifier) {
		this.luxarysit = newModifier;
	}
	
	public void function(float milesDriven) throws CycleException{
		float seatingpricea=milesDriven+luxarysit;
		this.setSeatingprice(seatingpricea);
	       this.totalprice(seatingpricea);

		this.status(" price of seating "+seatingprice);
	}
}
