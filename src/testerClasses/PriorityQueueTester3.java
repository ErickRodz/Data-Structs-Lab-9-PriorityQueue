package testerClasses;

import priorityQueue.HeapPriorityQueue;
import priorityQueue.UnsortedListPriorityQueue;
import priorityQueueInterfaces.DisplayablePriorityQueue;
import priorityQueueInterfaces.PriorityQueue;

public class PriorityQueueTester3 {

	public static void main(String[] args) {
	
	String[] arr = {"barrio", "pepe", "julia", "maria", "oliva", "meme", "parada", "baile", "enjendro", 
            "vagabundo", "nota", "tienda", "zapato", "caballo", "cafe", "diodo", "multiplica"};
	
	PriorityQueue<String, String> pq = new UnsortedListPriorityQueue<String, String>(new StringComparator());
	
	TesterUtils.displayArray("Content of the array before ", arr); 
	TesterUtils.what(arr, pq); 
	TesterUtils.displayArray("Content of the array after ", arr);
	}
	
}