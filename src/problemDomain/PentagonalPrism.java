/**
 * 
 */
package problemDomain;

/** ********************************************* **
 * Assignment2 - problemDomain.PentagonalPrism.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class PentagonalPrism extends Prism{

	public PentagonalPrism(double height, double side) {
		super(height, side);
	}

	@Override
	public double calcBaseArea() {
		return ( 5 * Math.pow(getSide(), 2) * Math.tan(54)) / 4;
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
		return "\nPentagonalPrism [calcBaseArea()=" + calcBaseArea() + ", calcVolume()=" + calcVolume() + ", getSide()="
				+ getSide() + ", getHeight()=" + getHeight() + "]";
	}

	
	
}
