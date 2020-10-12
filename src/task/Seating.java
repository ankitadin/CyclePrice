package task;

public class Seating extends CyclePart {
	private float engineAgeModifier;
	private float seatingprice;
	
	
	public Seating()
	{
		
	}
	
	
	public float getSeatingprice() {
		return seatingprice;
	}

	public void setSeatingprice(float seatingprice) {
		this.seatingprice = seatingprice;
	}

	public Seating(float engineAgeModifier) {
		super("seating");
		this.engineAgeModifier = engineAgeModifier;
	}
	
	/* GETTERS */
	
	public float getEngineAgeModifier() { return this.engineAgeModifier; }
	
	/* SETTERS */
	
	public void setEngineAgeModifier(float newModifier) {
		this.engineAgeModifier = newModifier;
	}
	
	public void function(float milesDriven) throws CycleException{
		float seatingpricea=milesDriven*20;
		this.setSeatingprice(seatingpricea);
	       this.totalprice(seatingpricea);

		this.status(" price of seating "+seatingprice);
	}
}
