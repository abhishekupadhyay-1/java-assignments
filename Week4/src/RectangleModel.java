public class RectangleModel {
  public void RectangleModel_func() {

    Rectangle rect1 = new Rectangle();
    System.out.println(rect1);


    Rectangle rect2 = new Rectangle(4.0);
    System.out.println(rect2);


    Rectangle rect3 = new Rectangle(4.0, 6.0);
    System.out.println(rect3);

    System.out.println("Area: " + rect3.getArea());
    System.out.println("Perimeter: " + rect3.getPerimeter());
    System.out.println("Is square: " + rect3.isSquare());

    rect3.scale(2.0);
    System.out.println("After scale by 2.0: " + rect3);
  }

  public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
      this(1.0, 1.0);
      System.out.println("No arg constructor called");
    }

    Rectangle(double side) {
      this(side, side);
      System.out.println("One arg constructor called");
    }

    Rectangle(double width, double height) {
      System.out.println("Two arg constructor called");
      if (width <= 0 || height <= 0) {
        System.err.println("Dimensions must be positive. Falling back to 1.0 by 1.0");
        this.width = 1.0;
        this.height = 1.0;
      } else {
        this.width = width;
        this.height = height;
      }
    }

    public double getArea() {
      return width * height;
    }

    public double getPerimeter() {
      return 2 * (width + height);
    }

    public boolean isSquare() {
      return width == height;
    }

    public void scale(double factor) {
      if (factor > 0) {
        width *= factor;
        height *= factor;
      } else {
        System.err.println("Scale factor must be positive");
      }
    }

    public String toString() {
      return "Rectangle width=" + width + ", height=" + height;
    }
  }
}