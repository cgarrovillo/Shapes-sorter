/**
 * 
 */
package util;

import java.util.Comparator;
import java.util.List;

/** ********************************************* **
 * Assignment2 - util.QuickSort.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class QuickSort<T extends Comparable<? super T>> {

	public List<Comparable <T>> sort(List<Comparable <T>> l, int start, int end) {
		if (start < end) {
			int pivot = partition(l, start, end);
			
			sort(l, start, pivot);
			sort(l, pivot+1, end);
		}
		
		return l;
	}
	
	private int partition(List<Comparable <T>> l, int start, int end) {
		
		int pivot = (start + end) / 2;
		Comparable<T> pivotValue = l.get(pivot);
		start--;
		end++;
		
		while (true) {
			do start++;
			while (l.get(start).compareTo((T) pivotValue) > 0);
			
			do end--;
			while (l.get(end).compareTo((T) pivotValue) < 0);
			
			if (start >= end )
				return end;
			
			Comparable<T> temp = l.get(start);
			l.set(start, l.get(end));
			l.set(end, temp);
		}
	}
	
	public List<Comparable <T>> sort(List<Comparable <T>> l, int start, int end, Comparator c) {
		if (start < end) {
			int pivot = partitionComparator(l, start, end, c);
			
			sort(l, start, pivot, c);
			sort(l, pivot+1, end, c);
		}
		
		return l;
	}
	
	private int partitionComparator(List<Comparable <T>> l, int start, int end, Comparator c) {
		int pivot = (start + end) / 2;
		Comparable<T> pivotValue = l.get(pivot);
		start--;
		end++;
		
		while (true) {
			do start++;
			while (c.compare(l.get(start), pivotValue) > 0);
			
			do end--;
			while (c.compare(l.get(end), pivotValue) < 0);
			
			if (start >= end )
				return end;
			
			Comparable<T> temp = l.get(start);
			l.set(start, l.get(end));
			l.set(end, temp);
		}
	}
	
}
