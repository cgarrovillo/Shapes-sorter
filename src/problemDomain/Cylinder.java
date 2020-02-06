package problemDomain;


public class Cylinder extends Shape{

	private double radius;
	
	public Cylinder(double height, double radius) {
		super(height);
		setRadius(radius);
	}

	@Override
	public double calcBaseArea() {
		return Math.PI * (Math.pow(getRadius(), 2));
	}

	@Override
	public double calcVolume() {
		return calcBaseArea() * getHeight();
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCylinder \t[calcBaseArea()=" + calcBaseArea() + ", calcVolume()=" + calcVolume()
				+ ", getRadius()=" + getRadius() + ", getHeight()=" + getHeight() + ", radius=" + radius + "]";
	}

}
