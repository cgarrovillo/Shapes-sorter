/**
 * 
 */
package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** ********************************************* **
 * Assignment2 - util.MergeSort.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class MergeSort<T extends Comparable<? super T>> {

	public List<Comparable <T>> sort(List<Comparable <T>> l) {
		
		if (l.size() <=1) {
			return l;
		}
		else {
			List<Comparable <T>> left = new ArrayList<>();
			List<Comparable <T>> right = new ArrayList<>();
			
			int middle = l.size() / 2;
			for (int i=0; i < middle; i++) {
				left.add(l.get(i));
			}
			
			for (int i=middle; i < l.size(); i++) {
				right.add(l.get(i));
			}
			return merge(sort(left), sort(right));
		}
		
	}
	
	private List<Comparable <T>> merge(List<Comparable <T>> l, List<Comparable <T>> r) {
		List<Comparable <T>> sorted = new ArrayList<>();
		int lIndex = 0, rIndex = 0;
		
		while (lIndex+1 <= l.size() || rIndex+1 <= r.size()) {
			if (lIndex+1 <= l.size() && rIndex+1 <= r.size()) {
				if (l.get(lIndex).compareTo((T) r.get(rIndex)) >= 0) {
					sorted.add(l.get(lIndex));
					lIndex++;
				}
				else {
					sorted.add(r.get(rIndex));
					rIndex++;
				}
			}
			else if (lIndex+1 <= l.size()) {
				sorted.add(l.get(lIndex));
				lIndex++;
			}
			else if (rIndex+1 <= r.size()) {
				sorted.add(r.get(rIndex));
				rIndex++;
			}
		}
		return sorted;
	}
	
	public List<Comparable <T>> sort(List<Comparable <T>> l, Comparator c) {

		if (l.size() <=1) {
			return l;
		}
		else {
			List<Comparable <T>> left = new ArrayList<>();
			List<Comparable <T>> right = new ArrayList<>();
			
			int middle = l.size() / 2;
			for (int i=0; i < middle; i++) {
				left.add(l.get(i));
			}
			
			for (int i=middle; i < l.size(); i++) {
				right.add(l.get(i));
			}
			return mergeComparator(sort(left, c), sort(right, c), c);
		}
		
	}
	
	private List<Comparable <T>> mergeComparator(List<Comparable <T>> l, List<Comparable <T>> r, Comparator c) {
		List<Comparable <T>> sorted = new ArrayList<>();
		int lIndex = 0, rIndex = 0;
		
		while (lIndex+1 <= l.size() || rIndex+1 <= r.size()) {
			if (lIndex+1 <= l.size() && rIndex+1 <= r.size()) {
//				if (l.get(lIndex).compareTo((T) r.get(rIndex)) <= 0) {
				if (c.compare(l.get(lIndex), r.get(rIndex)) >= 0) {
					sorted.add(l.get(lIndex));
					lIndex++;
				}
				else {
					sorted.add(r.get(rIndex));
					rIndex++;
				}
			}
			else if (lIndex+1 <= l.size()) {
				sorted.add(l.get(lIndex));
				lIndex++;
			}
			else if (rIndex+1 <= r.size()) {
				sorted.add(r.get(rIndex));
				rIndex++;
			}
		}
		return sorted;
	}
	
}
