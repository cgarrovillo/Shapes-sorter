/**
 * 
 */
package problemDomain;

/** ********************************************* **
 * Assignment2 - problemDomain.OctagonalPrism.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class OctagonalPrism extends Prism{

	public OctagonalPrism(double height, double side) {
		super(height, side);
	}

	@Override
	public double calcBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(getSide(), 2);
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
		return "\nOctagonalPrism \t[calcBaseArea()=" + calcBaseArea() + ", calcVolume()=" + calcVolume() + ", getSide()="
				+ getSide() + ", getHeight()=" + getHeight() + "]";
	}

	

	
}
