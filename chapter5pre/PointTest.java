public class PointTest { 

  public static void main(String[] args) { 

    Point hi = new Point(5,5);
    hi.moveLeft(6);

    System.out.println("The X coordinate is " + hi.getX() + " and the Y coordinate is " + hi.getY());

  } 
}