public class Person() {
  
  //default constructor
  //these should not be final 
  private String first;
  private String last;
  //look over this 
  public Person () {
    first;
    last;
  }
  //alt constructor
  public Person (String firstName, String lastName) {
    firstName = firstName;
    lastName = lastName;
  }
  
  public void printLastFirst(){
     System.out.println(lastName + "," + firstName);
  }
   public void print () {
       System.out.println(firstName + lastName);
  }
   public String toString(){
      
   }
   public boolean equals (Object obj) {
     if (obj instanceOf Person){
       Person otherPerson (Person);
       return firstName == otherPerson.firstName && lastName == otherPerson.lastName;
         }
     
   }
  
   public void copy(Person otherPerson){
     firstName = otherPerson.firstName;
     lastName = otherPerson.lastName;
   }
   
   
   public void getCopy(){
     return new Person (firstName, lastName);
   }
       
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
}