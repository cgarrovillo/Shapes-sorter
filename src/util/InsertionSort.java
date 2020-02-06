/**
 * 
 */
package util;

import java.util.Comparator;
import java.util.List;

/** ********************************************* **
 * Assignment2 - util.InsertionSort.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class InsertionSort<T extends Comparable<? super T>>{

	//sort by volume
	public List<Comparable <T>> sort(List<Comparable <T>> l) {
		for (int i=1; i < l.size(); i++) {
			int currentIndex = i;
			while (currentIndex > 0 && l.get(currentIndex - 1).compareTo((T) l.get(currentIndex)) < 0) {
				Comparable<T> temp = l.get(currentIndex);
				l.set(currentIndex, l.get(currentIndex - 1));
				l.set(currentIndex - 1, temp);
				currentIndex--;
			}
		}
		return l;
	}
	
	//sort by base area or height
	public List<Comparable <T>> sort(List<Comparable <T>> l, Comparator c) {
		for (int i=1; i<l.size(); i++) {
			int currentIndex = i;
			while (currentIndex > 0 && c.compare(l.get(currentIndex - 1), l.get(currentIndex)) < 0) {
				Comparable<T> temp = l.get(currentIndex);
				l.set(currentIndex, l.get(currentIndex - 1));
				l.set(currentIndex - 1, temp);
				currentIndex--;
			}
			
		}
		return l;
	}
	
}
