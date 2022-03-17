//Lab 4

public class Time {
private constant final int hrs;
private constant final int mins;
private constant final int secs;
    public static void main(String[]args) {

    }
    //default 
    public Time () {
        hrs = 0;
        mins = 0;
        secs = 0;
    }
    //alternate constructor
    public Time (int h, int m, int s) {
        //be able to pass to the private data 
      h = hrs;
      m = mins;
      s = secs;

    }
    //getters here 
    public int getHrs () {
        //get the private data
        return hrs;
    }  
    public int getMins () {
        return mins;

    }
    public int getSecs () {
        return secs;
    }
    public set (int h, int m, int s) {
        //use the conditional operator
        hrs = (h > 0 && h < 24) ? h:0;
        mins = (m > 0 && m < 60) ? h:0;
        secs = (s > 0 && s < 60) ? h:0;

    }

        //print in correct format of military 
        //more of the conditional operator
        public void printTimeMilitary(){
            System.out.print((hrs < 10? "0": "") + hrs + ":");
            System.out.print((mins < 10? "0": "") + mins + ":");
            System.out.print((secs < 10? "0": "") + secs); 
        }
    }

        public void printTimeStandard(){
            System.out.print((hrs == 0 || hrs == 12? 12: hrs % 12) + ":");
            System.out.print((mins < 10? "0": "") + mins + ":");
            System.out.print((secs < 10? "0": "") + secs + " ");
            System.out.print((hrs < 12? "AM": "PM"));
            } 

    }

    public equals (Time otherTime) {
        //
        if (hrs == otherTime.hrs  && mins == otherTime.mins && secs == otherTime.secs)
            return true;

    }

    public void copy (Time t) {
        hrs = t.hrs;
        mins = t.mins;
        secs = t.secs;

    }
//GO OVER THIS METHOD
    public getCopy (Time t) {
     return new Time (hrs, mins, secs);
}
       
    public advanceSecs () {
        //advance both minutes and secs? 
      secs++;
        if (secs > 59)
        secs = 0;
        mins++;
    }

    public boolean lessThan(Time t){
       return (hrs < t.hrs || t.hrs == t.hrs && mins < t.mins || hrs == t.hrs && mins == t.mins && secs < t.secs);
    }
    public boolean notEquals(Time otherTime) {
        return (hrs < otherTime.hrs || otherTime.hrs != otherTime.hrs && mins < otherTime.mins || hrs != otherTime.hrs && mins != otherTime.mins && secs < otherTime.secs);
    }

    public boolean lessOrEquals(Time otherTime) {
        return (hrs <= otherTime.hrs || otherTime.hrs <= hrs && mins <= otherTime.mins || hrs <= otherTime.hrs && mins <= t.mins && secs <= otherTime.secs);
       
    }
    public boolean greaterThan(Time otherTime) {
        return (hrs < otherTime.hrs || otherTime.hrs == otherTime.hrs && mins < otherTime.mins || hrs == otherTime.hrs && mins == otherTime.mins && secs < otherTime.secs);
       
    }
    public boolean greaterOrEquals(Time otherTime) {
        return (hrs >= otherTime.hrs || otherTime.hrs >= otherTime.hrs && mins >= otherTime.mins || hrs >= otherTime.hrs && mins >= otherTime.mins && secs >= otherTime.secs);
  
    }
    
    public advanceMins (){
         mins++
        if (mins > 59) {
         mins = 0;
         hrs++;
        }
    }

    public advanceHrs() {
         hrs++
         if (hrs > 23) {
            hrs = 0;
         }
    }
      
    }
    //return a string with military time of a time object 
    public toMilitary () {
       return String.format("%02d%:%02d%:%02d", hrs, mins, secs);
      
    }

    public toStandard() {
       return String.format("%02d%:%02d%:%02d", hrs, mins, secs);
       
    }
}

