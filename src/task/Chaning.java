package task;

public class Chaning extends CyclePart{
	
	private float chain;
	private float chainprice;
	
	public Chaning()
	{
		super();
	}
	
	public float getChainprice() {
		return chainprice;
	}

	public void setChainprice(float chainprice) {
		this.chainprice = chainprice;
	}

		public Chaning(float chain) {
		super("chaning");
		this.chain=chain;
	}
	
	
	
	public void function(float chaining) throws CycleException {
		float chainpricea=chaining*chain;
	       this.setChainprice(chainpricea);
	       this.totalprice(chainpricea);
		this.status(" price of chaining is "+chainpricea);
		
	}

}
