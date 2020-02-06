/**
 * 
 */
package application;

import java.util.Comparator;

import problemDomain.Shape;

/** ********************************************* **
 * Assignment2 - application.HeightCompare.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class HeightCompare implements Comparator<Shape>{

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.getHeight() > o2.getHeight()) {
			return 1;
		}
		else if (o1.getHeight() < o2.getHeight()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
