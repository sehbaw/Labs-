
public class Point {
    private  int x;
    private  int y;
  
    //default constructor
    public Point() {
            x = 0;
            y = 0;
    }
    //alternate constructor
    public Point (int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    //setters
    //setters would be what? what is considered invalid 
    public void set (int xCoord, int yCoord) {
        //x = xCoord;
        //y = yCoord;
        x = (xCoord <= 0) ? xCoord:0;
        y = (yCoord <= 0) ? yCoord:0;
    }
    public double distanceFromOrigin () {
        //do not need parameteres because there is no need to access outside the class
        return Math.sqrt(x*x + y*y);
        //could also use pow but I was concerned that I would get the syntax wrong because it worked the first time and not the second time
        
    }
    public double distance (Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx*dx + dy * dy);
    }

    /*public int distance (int x1, int y1, int x1, int y2) {
        int deltaY = (int)Math.pow((y2 - y1), 2);
        int deltaX = (int) Math.pow(x2 - x1),2);
        result = (int)sqrt(deltaX + deltaY)
        return result;


    }*/

    public int slope (int x1, int y1, int x2, int y2) {
        int deltaY = y2 - y1;
        int deltaX = x2 - x1;
        int result = deltaY / deltaX;
        return result;
    }


    

    public void copy (Point p) {
        x = p.x;
        y = p.y;

    }

    public Point getCopy () {
        //no passing of paramteres
        //this what I think is right? 
        return new Point (x,y);
    }

    public boolean isVertical(Point p) {
        //comparing the y coordinates ,?
        return (y == p.y);

    }
    public boolean isHorizontal(Point p) {
     //comparing the x coordinates ?
     return (x == p.x);
    }
//did not try to use the setter here because it was giving me weird compilation error
    public void translate (int dx, int dy) {
        //should have the same y??
        //there is no dx and dy declared need to do that 
        x = x  + dx;
        y = y + dy;
        System.out.println("This is the translate coordinate:" + x + "," + y);
   }
    

    public String toString () {
        return "("+ x + "," + y +")";
    
    }
//has the same thing as toString 
    public void print() {
        System.out.println(x + y);

    }
    
    public boolean equals (Point otherPoint){
        return (x == otherPoint.x && y == otherPoint.y);
      }
}





















