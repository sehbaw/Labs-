import java.util.Scanner;

public class PointClient {
  
public static void main (String[]args){
//Scanner input = new Scanner(System.in);
//int x;
//int y;
Point p1 = new Point();
Point p2 = new Point(4,7);
Point p3 = new Point (5,3);
//assign with alt constructor?
//printing out the cooridnates with toString 
System.out.println("Point 1 is:" + p1);
System.out.println("Point 2 is:" + p2);
System.out.println("Point 2 is:" + p3);


if(p3.isHorizontal(p2)){
  System.out.println("These points horizontally line up");
}
if(p3.isVertical(p2)){
  System.out.println("These points vertically line up");
  
}
//distance from origin
p2.distanceFromOrigin();
p3.distanceFromOrigin();

//copy
p2.copy(p1);
  System.out.println("The point has been copied");
 p1.print();
 p3.copy(p2);
  System.out.println("The point has been copied"); 
  //this should print out the 
 p3.print();


//translation
System.out.println("This is the translate coordinate:");
p2.translate(5,2);
//System.out.print(his is the new coordinate:" + toString(p2.translate(5,2)));
//System.out.print("This is the translate coordinate:");
//p3.translate.print;


p2.equals(p3);
System.out.println("These points are the same!");
p3.equals(p2);
System.out.println("These points are the same!");

}
public static int getInt(Scanner input, String prompt) {
        //type errors in input
        System.out.print (prompt);
     while (!input.hasNextInt()) {
         System.out.println("This is not a valid input. Please enter the input");
         input.next();
             }
     return input.nextInt();
}
}
