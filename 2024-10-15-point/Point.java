public class Point{

  private double x,y;

  public String toString(){
    return ("(" + this.x + ", " + this.y + ")");
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    this.x = other.x;
    this.y = other.y;
    //Then write test cases.
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    return Math.sqrt( Math.pow( (this.getX() - other.getX()), 2) + Math.pow( (this.getY() - other.getY()), 2) );
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    return a.distanceTo(b);
  }


}
