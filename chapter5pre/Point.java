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

}