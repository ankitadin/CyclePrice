package task;

public abstract class CyclePart implements Functional, Interactive {

	protected String partName;

	private float range;
	private static float total;

	public static float getTotal() {
		return total;
	}

	public static void setTotal(float total) {
		CyclePart.total = total;
	}

	public void totalprice(float p) {

		total = total + p;
		CyclePart.setTotal(total);

	}

	public float tot() {
		return CyclePart.getTotal();

	}


	public CyclePart(String name) {

		this.partName = name;

	}


	public CyclePart() {
		// TODO Auto-generated constructor stub
	}

	public String getPartName() {
		return this.partName;
	}



	public void status(String extraMessage) {
		System.out.print("Your " + this.partName);
		System.out.println(extraMessage);
	}

	public void function(float range) throws CycleException {
		this.range += range;
	}
}
