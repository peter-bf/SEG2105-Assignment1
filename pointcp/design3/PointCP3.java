package design3;

import design5.PointCP5;

public class PointCP3 extends PointCP5
{
	//Instance variables ************************************************

	/**
	 * Contains the current value of X or RHO depending on the type
	 * of coordinates.
	 */
	private double x;

	/**
	 * Contains the current value of Y or THETA value depending on the
	 * type of coordinates.
	 */
	private double y;


	//Constructors ******************************************************

	/**
	 * Constructs a coordinate object, with a type identifier.
	 */
	public PointCP3(double x, double y){
		super(x, y);
		this.x = x;
		this.y = y;
	}


	//Instance methods **************************************************


	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
	public double getRho()
	{
		return Math.sqrt(x*x + y*y);
	}
	public double getTheta()
	{
		return Math.toDegrees(Math.atan2(y, x));
	}


	/**
	 * Converts Cartesian coordinates to Polar coordinates.
	 */
	public void convertStorageToPolar()
{
		double rho = getRho() * Math.cos(Math.toRadians(getTheta()));
		double theta = getRho() * Math.sin(Math.toRadians(getTheta()));
		System.out.println("Polar [" + rho + "," + theta + "]");
}

public void convertStorageToCartesian()
{
	//No need, we are already cartesian
}

	/**
	 * Calculates the distance in between two points using the Pythagorean
	 * theorem	(C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public double getDistance(PointCP3 pointB)
	{
		// Obtain differences in X and Y, sign is not important as these values
		// will be squared later.
		double deltaX = this.x - pointB.getX();
		double deltaY = this.y - pointB.getY();
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

	/**
	 * Rotates the specified point by the specified number of degrees.
	 * Not required until E2.30
	 *
	 * @param point The point to rotate
	 * @param rotation The number of degrees to rotate the point.
	 * @return The rotated image of the original point.
	 */
	public PointCP3 rotatePoint(double rotation)
	{
		double radRotation = Math.toRadians(rotation);
		double newX = Math.cos(radRotation) * x - Math.sin(radRotation) * y;
		double newY = Math.sin(radRotation) * x - Math.cos(radRotation) * y;
		return new PointCP3(newX, newY);
	}

	/**
	 * Returns information about the coordinates.
	 *
	 * @return A String containing information about the coordinates.
	 */
	public String toString()
	{
		return "Cartesian (" + x + "," + y + ")" + "\n";
	}
}
