/**
 * 
 */
package problemDomain;

import java.util.Comparator;

/**
 * @author 785444
 *
 */
public abstract class Shape implements Comparable<Shape>{

	private double height;
	
	public Shape(double height) {
		setHeight(height);
	}
	
	@Override
	public int compareTo(Shape o) {
//		System.out.println(this.calcVolume() + "||" + o.calcVolume());
		if (this.calcVolume() > o.calcVolume()) 
			return 1;
		else if (this.calcVolume() < o.calcVolume())
			return -1;
		else
			return 0;
	}

	public abstract double calcBaseArea();
	
	public abstract double calcVolume();

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
		
}
