/**
 * 
 */
package problemDomain;

/** ********************************************* **
 * Assignment2 - problemDomain.SquarePrism.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class SquarePrism extends Prism{

	public SquarePrism(double height, double side) {
		super(height, side);
	}

	@Override
	public double calcBaseArea() {
		return Math.pow(getSide(), 2);
	}

	@Override
	public double calcVolume() {
		return calcBaseArea() * getHeight();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nSquarePrism \t[calcBaseArea()=" + calcBaseArea() + ", calcVolume()=" + calcVolume() + ", getSide()="
				+ getSide() + ", getHeight()=" + getHeight() + "]";
	}

	
}
