/**
 * 
 */
package util;

import java.util.Comparator;
import java.util.List;

/** ********************************************* **
 * Assignment2 - util.SelectionSort.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class SelectionSort<T extends Comparable<? super T>> {

	public List<Comparable <T>> sort(List<Comparable <T>> l) {
		for (int current=0; current < l.size(); current++) {
			int minIndex = current;
			
			for (int i = current; i < l.size(); i++) {
				if (l.get(i).compareTo((T) l.get(minIndex)) > 0) {
					minIndex = i;
				}
			}
			
			if (minIndex != current) {
				Comparable<T> temp = l.get(current);
				l.set(current, l.get(minIndex));
				l.set(minIndex, temp);
			}
		}
		return l;
	}
	
	public List<Comparable <T>> sort(List<Comparable <T>> l, Comparator c) {
		for (int current=0; current < l.size(); current++) {
			int minIndex = current;
			for (int i = current; i < l.size(); i++) {
				if (c.compare(l.get(i), l.get(minIndex)) > 0) {
					minIndex = i;
				}
			}
			
			if (minIndex != current) {
				Comparable<T> temp = l.get(current);
				l.set(current, l.get(minIndex));
				l.set(minIndex, temp);
			}
		}
		return l;
	}
}
