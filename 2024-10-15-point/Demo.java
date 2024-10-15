public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt( Math.pow( (a.getX() - b.getX()), 2) + Math.pow( (a.getY() - b.getY()), 2) );
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p1);
    Point p5 = new Point (2,7);
    Point p6 = new Point (9,-6);
    Point p7 = new Point (-2, 3);
    System.out.println("original point: " + p3);
    System.out.println("copied point: " + p3);
    System.out.println("distance from (1,1) to (-1,-1) using 3 different methods:");
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println("distance from (3,4) to (2,7) using 3 different methods:");
    System.out.println( distance(p3,p5));
    System.out.println( Point.distance(p3,p5));
    System.out.println( p3.distanceTo(p5));
    System.out.println("distance from (9,-6) to (-2,3) using 3 different methods:");
    System.out.println( distance(p6,p7));
    System.out.println( Point.distance(p6,p7));
    System.out.println( p6.distanceTo(p7));

    Point eqTri1 = new Point (0,0);
    Point eqTri2 = new Point (1,0);
    double yOfThirdPoint = -1 * Math.sqrt(1 - 0.25);
    Point eqTri3 = new Point (0.5, yOfThirdPoint);
    System.out.println("side length of eqTri1 to eqTri2 found using 3 different methods:");
    System.out.println( distance(eqTri1,eqTri2));
    System.out.println( Point.distance(eqTri1,eqTri2));
    System.out.println( eqTri1.distanceTo(eqTri2));
    System.out.println("side length of eqTri1 to eqTri3 found using 3 different methods:");
    System.out.println( distance(eqTri1,eqTri3));
    System.out.println( Point.distance(eqTri1,eqTri3));
    System.out.println( eqTri1.distanceTo(eqTri3));
    System.out.println("side length of eqTri2 to eqTri3 found using 3 different methods:");
    System.out.println( distance(eqTri2,eqTri3));
    System.out.println( Point.distance(eqTri2,eqTri3));
    System.out.println( eqTri2.distanceTo(eqTri3));

  }
}
