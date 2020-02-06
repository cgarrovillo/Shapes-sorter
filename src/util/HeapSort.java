/**
 * 
 */
package util;

import java.util.Comparator;
import java.util.List;

/** ********************************************* **
 * Assignment2 - util.HeapSort.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class HeapSort<T extends Comparable<? super T>> {

	public List<Comparable <T>> sort(List<Comparable <T>> l) {
		int size = l.size();
		
		for (int i = size / 2 -1; i >= 0; i--) {
			spotifysBestFriendHeapify(l, size, i);
		}
		
		for (int i = size -1; i >= 0; i--) {
			Comparable<T> temp = l.get(0);
			l.set(0, l.get(i));
			l.set(i, temp);
			
			spotifysBestFriendHeapify(l, i, 0);
		}
		return l;
	}
	
	private List<Comparable <T>> spotifysBestFriendHeapify(List<Comparable <T>> l, int size, int i) {
		int max = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if (left < size && l.get(left).compareTo((T) l.get(max)) > 0) {
			max = left;
		}
		
		if (right < size && l.get(right).compareTo((T) l.get(max)) > 0) {
			max = right;
		}
		
		if (max != i) {
			Comparable<T> temp = l.get(i);
			l.set(0, l.get(max));
			l.set(max, temp);
			
			spotifysBestFriendHeapify(l, size, max);
		}
		return l;
	}
	
	public List<Comparable <T>> sort(List<Comparable <T>> l, Comparator c) {
		return l;
	}
}
