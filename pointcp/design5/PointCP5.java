package design5;

public abstract class PointCP5{
	
	//Instance variables ************************************************

  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  protected double xOrRho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  protected double yOrTheta;
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP5(double xOrRho, double yOrTheta) {
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
  }
	
  
  //Instance methods **************************************************
 
 
  public abstract double getX();
  
  public abstract double getY();
  
  public abstract double getRho();
  public abstract double getTheta();
  public abstract void convertStorageToPolar();
  public abstract void convertStorageToCartesian();
  public double getDistance(PointCP5 pointB) {
    return 0;
}

// Default implementation for rotatePoint method
  public PointCP5 rotatePoint(double rotation) {
    return null;
}
  
  public abstract String toString();
	
}