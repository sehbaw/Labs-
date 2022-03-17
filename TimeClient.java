//
import java.util*;
//remmeber that you don't have to call to each method but make sure that you know that every method is available.

public class TimeClient() {
   pubilc static void main(String[]args){
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter your time");
    Time t1 = new Time (10,15,20); //alternate constructor..pass parameters
    Time t2 = new Time (); //default constructor
    int hours, int minutes, int seconds;
    //would you want to do selection
    System.out.print("Initial time t1 - Military Time: ");
    t1.printTimeMilitary();
    System.out.println();


    System.out.print("Initial Time t1 - Standard Time :")
    t1.printTimeStandard();
    System.out.println();

    System.out.print("Initial Time t2 - Standard Time: ");
    t2.printTimeMilitary();
    System.out.println();

    System.out.print("Initial Time t2 - Military Time");
     
    //want to setTime here?
    t2.setTime(10,11,12);
    System.out.print("Time is set - MilitaryTime");
    t2.printMilitaryTime();
    System.out.println();
    System.out.print("Time is set - Standard time");
    t2.printTimeStandard();
    System.out.println();
    //we would do input and selection here
    System.out.print("Enter hours, minutes and seconds");
    hours = console.nextInt();
    mins = console.nextInt();
    secs = console.nextInt();
    System.out.println("Lets us now increment the time");
    t1.advanceHrs();
    t1.advanceMins();
    t1.advanceSecs();
    t1.printTimeStandard();
    System.out.print();

    t2.advanceHrs();  
    t2.advanceMins();
    t2.advanceSecs();
    t2.printTimeStandard();
    System.out.println();
    

//seeing if they are equal to each other
 if (t1.equals(t2)) {
    //dont need curly brackets bc one action but i still put them helps me track where ia m
    System.out.println("Times are equals");
    else {
        System.out.println("times are not equal");
    }
if (t1.lessThan(t2)){
    System.out.println("t1 is less than t2");
else {
    System.out.println("t1 is not less than t2");
   }
      }

  //call to toString
t2.toString();
  }
}
    
}