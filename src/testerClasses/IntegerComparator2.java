package testerClasses;

import java.util.Comparator;

public class IntegerComparator2 implements Comparator<Integer> {

	@Override
	public int compare(Integer First, Integer Second) {
		
		if(First > Second) {
			return -1; 
		}
		else 
			if(First < First) {
			return 1; 
		}
		
			return 0; 
		
	}

}
