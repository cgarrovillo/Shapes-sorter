/**
 * 
 */
package util;

import java.util.Comparator;
import java.util.List;

/** ********************************************* **
 * Assignment2 - util.BubbleSort.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class BubbleSort<T extends Comparable<? super T>> {

	public List<Comparable <T>> sort(List<Comparable <T>> l) {
		int n = l.size();
		while (n > 0) {
			int lastMoved = 0;
			for (int current = 1; current < n; current++) {
				if (l.get(current -1).compareTo((T) l.get(current)) < 0) {
					
					Comparable<T> temp = l.get(current - 1);
					l.set(current - 1, l.get(current));
					l.set(current, temp);
					lastMoved = current;
				}
			}
			n = lastMoved;
		}
		return l;
	}
	
	public List<Comparable <T>> sort(List<Comparable <T>> l, Comparator c) {
		int n = l.size();
		while (n > 0) {
			int lastMoved = 0;
			for (int current = 1; current < n; current++) {
				if (c.compare(l.get(current-1), l.get(current)) < 0) {
					
					Comparable<T> temp = l.get(current - 1);
					l.set(current - 1, l.get(current));
					l.set(current, temp);
					lastMoved = current;
				}
			}
			n = lastMoved;
		}
		return l;
	}
}
