package task;

import java.util.Scanner;

public class Chaning extends CyclePart{
	
	private float chain;
	private float chainprice;
	Scanner sc=new Scanner(System.in);

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

		public Chaning(String chain) {
		super("chaning");
		System.out.println("enter chain type");
		
		this.chain=sc.nextFloat();
	}
	
	
	
	public void function(float chaining) throws CycleException {
		float chainpricea=chaining*chain;
	       this.setChainprice(chainpricea);
	       this.totalprice(chainpricea);
		this.status(" price of chaining is "+chainpricea);
		
	}

}
