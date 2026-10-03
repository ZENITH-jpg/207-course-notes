/**
 * yayayayayaya.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructor.
   *
   * @param w snjnwnnw
   * @param h jnimkmk
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Double.
   *
   * @return area
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor uhiii
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * compare areas.
   *
   * @param other ijijijijoj
   * @return uhguhu
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
