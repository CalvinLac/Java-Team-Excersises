/** 
*  Point.java
*  @version CPSC 233
*  @author Jordano Martinez
*  Class which can take an x- and y-coordinate and manipulate them on a plane, and/or can take two points
*  (one invoked and one as an argument) and find the distance between them with the Pythagorean theorem.
*/

public class PointRight {
  // Attributes:
	private int xcoord;
	private int ycoord;

		/** Constructors **/
    /** Overwrite default constructor
    */
    /** Default */

	public PointRight()
	{
		xcoord=0;
		ycoord=0;
	}

	/** Overload constructor to accept two coordinates
    * @param x The x-coordinate
    * @param y The y-coordinate
    */

	public PointRight (int x,int y)
	{
		xcoord=x;
		ycoord=y;
	}

	/** Get methods **/
    /**Get the x- or y-coordinate
    * @return x- and y-coordinate
    */
	public int getX()
	{
		return xcoord;
	}

	public int getY()
	{
		return ycoord;
	}

  /** Operational methods **/
    /** Moves the point on the plane by specified amount
    * @param amount:  the int value (distance) to move point
    */

	public void moveUp(int amount)
	{
		ycoord+=amount;
	}

	public void moveDown(int amount)
	{
		ycoord-=amount;
	}

	public void moveLeft(int amount)
	{
		xcoord-=amount;
	}

	public void moveRight(int amount)
	{
		xcoord+=amount;
	}

	  /** Distance method **/
    /** Calculates the distance between points
    * @param point_two The second point called as an argument
    * @return The distance between the invoked point and the argument point
    */
	public double distance( PointRight point_two)
	{
		int x_change=xcoord-point_two.xcoord;
		int y_change=ycoord-point_two.ycoord;
		double distance = Math.sqrt(x_change*x_change + y_change*y_change);
		return distance;
	}

	/**Quadrant method **/
	/**determines which quadrant the point is in
	* @return String with quadrant
	*/

	public String quadrant()
	{
		String quadString = "False";

		// when xcoord is east, determines ycoord quadrant
		if (xcoord >0) {
			if (ycoord>0) {
				quadString="NE";
			}
			else if (ycoord==0) {
				quadString= "E";
			}
			else {
				quadString= "SE";
			}
		}
		// when xcoord is west, determines ycoord quadrant
		if (xcoord < 0) {
			if (ycoord > 0) {
				quadString= "NW";
			}
			else if (ycoord == 0) {
				quadString= "W";
			}
			else {
				quadString= "SW";
			}
		}
		// when xcoord is equal to zero, determines ycoord quadrant
		if (xcoord ==0) {
			if (ycoord ==0) {
				quadString= "origin";
			}
			else {
				if (ycoord >0) {
					quadString= "N";
				}
				else if (ycoord<0) {
					quadString= "S";
				}
			}
		}
		return quadString;
	}

	/**Equals **/
	/** Determines if two points are equal
	* @param randompoint Point taken as argument
	* @return Returns boolean
	*/


	public boolean equals(Point randompoint)
	{
		if ((randompoint.getX()== xcoord) && (randompoint.getY()==ycoord))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**to String**/
	/** Creates string with x- and y-coordinates
	* @return string with x- and y-coordinate
	*/

	public String toString()
	{
		String stringx=Integer.toString(xcoord);
		String stringy=Integer.toString(ycoord);
		return "(" +stringx + "," + stringy+ ")";
	}

	/** add **/
	/** Adds argument point to invoked point
	* @param randompoint Point taken as argument
	* @return Final added point
	*/

	public PointRight add(PointRight randompoint)
	{
		int newx=xcoord+randompoint.xcoord;
		int newy=ycoord+randompoint.ycoord;
		PointRight finalpoint= new PointRight(newx,newy);
		finalpoint.xcoord=newx;
		finalpoint.ycoord=newy;
		return finalpoint;
	}
}