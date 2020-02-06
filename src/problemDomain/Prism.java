/**
 * 
 */
package problemDomain;

import java.util.Comparator;


public abstract class Prism extends Shape {
	
	private double side;
	
	public Prism(double height, double side) {
		super(height);
		setSide(side);
	}

	public int compareTo(Prism o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return "\nPrism \t\t[side=" + side + ", getSide()=" + getSide() + ", calcBaseArea()=" + calcBaseArea()
//				+ ", calcVolume()=" + calcVolume() + ", getHeight()=" + getHeight() + "]";
//	}

	
	
}
