package task;

public class Wheel extends CyclePart {
	private float wheeltube;
	private float spoke;
	private float pricewheel;
	
	

	
	
	public Wheel()
	{
		
	}
	public float getPricewheel() {
		return pricewheel;
	}

	public void setPricewheel(float pricewheel) {
		this.pricewheel = pricewheel;
	}

	public Wheel(float spoke, float wheeltube) {
		
		super("wheel");
		this.wheeltube = wheeltube;
		this.spoke=spoke;
	}
	
	
	public void function(float tubetype) throws CycleException{
		super.function(tubetype);
		float pricewheela = tubetype / this.wheeltube;
           this.setPricewheel(pricewheela);
	       this.totalprice(pricewheela);

		String wheelPrice="wheel price is "+pricewheela;
		this.status(wheelPrice);
		
		
	}
}
