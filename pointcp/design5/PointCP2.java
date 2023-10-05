package design5;

public class PointCP2 extends PointCP5
{
  //Instance variables ************************************************
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double rho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double theta;
	
  
  //Constructors ****************************************************** 

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2(double rho, double theta){
    super(rho, theta);
    this.rho = rho;
    this.theta = theta;
  }
	
  
  //Instance methods **************************************************
  
    public double getRho(){
    return rho;
  }
  
  public double getTheta(){
      return theta;
  }

  public double getX() {
   return (Math.cos(Math.toRadians(theta)) * rho);
  }
  
  public double getY() {
    return (Math.sin(Math.toRadians(theta)) * rho);
  }  

   /**
   * Converts Cartesian coordinates to Polar coordinates.
   * 
   */
  public void convertStorageToPolar()
{
    //No need for this method
}

public void convertStorageToCartesian()
{
    // Simply calculating
    double x = getX() * Math.cos(Math.toRadians(getY()));
    double y = getX() * Math.sin(Math.toRadians(getY()));
}

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP2 pointB) {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = this.getX() - pointB.getX();
    double deltaY = this.getY() - pointB.getY();
     return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }
/*

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation) {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString() {
    return "Polar [" + getRho() + "," + getTheta() + "]" + "\n";
  }
}
