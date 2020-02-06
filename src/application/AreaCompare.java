/**
 * 
 */
package application;

import java.util.Comparator;

import problemDomain.Shape;

/** ********************************************* **
 * Assignment2 - application.AreaCompare.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class AreaCompare implements Comparator<Shape>{

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calcBaseArea()> o2.calcBaseArea()) {
			return 1;
		}
		else if (o1.calcBaseArea() < o2.calcBaseArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
