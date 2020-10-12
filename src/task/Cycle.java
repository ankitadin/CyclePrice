package task;

import java.util.ArrayList;
import java.util.Iterator;

public class Cycle implements Interactive {
	private ArrayList<CyclePart> parts = new ArrayList<>();
  

	public Cycle() {
		this.parts.add(new Wheel(17.2f, 35));
		this.parts.add(new Seating(11));
		this.parts.add(new Chaning(12));
		
	}









	public void run() {
		try {
			do {
				
				float range = getFloat("range of cycle price ?");
				for (int p = 0; p < parts.size(); p++) {
					parts.get(p).function(range);
					if(p==parts.size()-1)
					{
						float fi=parts.get(p).tot();
						System.out.println("total price of cycle is"+fi);
					}
					
				}
				
				
                 
                       
				
				
			} while (getBoolean("want another cycle price to know ?"));
		} catch (CycleException e) {
			System.out.println(e.getMessage());
		} finally {
		}
	}
}
