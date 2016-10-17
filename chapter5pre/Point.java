public class Point { 
  
  private int xcoord; 
  private int ycoord; 
  
  Point() { 
    xcoord = 0; ycoord = 0; } 

  Point(int setX , int setY) { 
    xcoord = setX;
    ycoord = setY;
  }

  public int getX() { 
    return xcoord; 
  }

  public int getY() {   
    return ycoord; 
  } 

  public void moveLeft(int spaces) {
    xcoord = xcoord - spaces;
  }

  public void moveRight(int spaces) {
    xcoord = xcoord + spaces;
  }

  public void moveUp(int spaces) {
    ycoord = ycoord + spaces;
  }

  public void moveDown(int spaces) {
    ycoord = ycoord - spaces;
  }

  public double distance(Point p1) {
    double eDistance;
    eDistance = Math.sqrt(((p1.xcoord-xcoord)*(p1.xcoord-xcoord)) + (p1.ycoord-ycoord)*(p1.ycoord-ycoord));
    return eDistance;
  }

  public boolean equals (Point p1) {
    if (p1.xcoord == xcoord && p1.ycoord == ycoord) {
      return true;
    }
    else {
      return false;
    }
  }

  public String toString () {
    String stringXcoord = Integer.toString(xcoord);
    String stringYcoord = Integer.toString(ycoord);
    return "("+ stringXcoord + "," + stringYcoord+")";
  }

  public Point add (Point p1) {
    xcoord += p1.xcoord;
    ycoord += p1.ycoord;
    Point newPoint = new Point(xcoord, ycoord);
    return p1;
  }

}