package objectandclass;

public class CircleWithPrivateDataFields {

  /**
   * The radius of the circle
   */
  private double radius = 1;

  /**
   * The number of the objects created
   */
  private static int numberOfObjects = 0;

  /**
   * Construct a circle with radius 1
   */
  public CircleWithPrivateDataFields() {
    this(1);
    numberOfObjects++;

  }

  /**
   * Construct a circle with a specified radius
   */
  public CircleWithPrivateDataFields(double radius) {
    this.radius = radius;
    numberOfObjects++;
  }

  /**
   * Return radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Set a new radius
   */
  public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  /**
   * Return numberOfObjects
   */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  public static void setNumberOfObjects(int numberOfObjects) {
    if (numberOfObjects >= 0) {
      CircleWithPrivateDataFields.numberOfObjects = numberOfObjects;
    }

  }

  /**
   * Return the area of this circle
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }
}
