package priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;

import priorityQueue.AbstractPriorityQueue.PQEntry;
import priorityQueueInterfaces.Entry;

/**
 * Implementation of a PriorityQueue based in an ArrayList<Entry<K, V>>.
 * @author pedroirivera-vega
 *
 * @param <K>
 * @param <V>
 */
public class SortedListPriorityQueue<K, V> extends AbstractListPriorityQueue<K, V> {
	public SortedListPriorityQueue(Comparator<K> cmp) { 
		super(cmp);
	}
	
	public SortedListPriorityQueue() { 
		super(); 
	}
	

	@Override
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		super.validate(key);
		
		Entry<K, V> New = new PQEntry<K, V>(key, value);

		if (this.isEmpty()) {
			list.add(New);
			return New;
		}

		int curr = 0;
		while (curr < list.size() && compare(New, list.get(curr)) > 0) {
			curr++;
			list.add(curr, New);
		}
		return New;
	}

	@Override
	protected int minEntryIndex() {
		return 0;
	}

}
