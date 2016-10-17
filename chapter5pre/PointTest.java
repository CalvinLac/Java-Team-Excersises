public class PointTest { 

  public static void main(String[] args) { 

    Point hi = new Point(3,4);
    Point bye = new Point(0,0);
    bye.distance(hi);

    System.out.println("The X coordinate is " + hi.getX() + " and the Y coordinate is " + hi.getY());

  } 
}