/**
 * 
 */
package problemDomain;

/** ********************************************* **
 * Assignment2 - problemDomain.TriangularPrism.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class TriangularPrism extends Prism{

	public TriangularPrism(double height, double side) {
		super(height, side);
	}

	@Override
	public double calcBaseArea() {
		return ( Math.pow(getSide(), 2) * Math.sqrt(3) ) / 4;
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
		return "\nTriangularPrism [calcBaseArea()=" + calcBaseArea() + ", calcVolume()=" + calcVolume() + ", getSide()="
				+ getSide() + ", getHeight()=" + getHeight() + "]";
	}

	
}
