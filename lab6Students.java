/*
  Keven Melendez
  Co Sci 290
*/


import java.util.Scanner;

public class lab6Students
{

public static void main(String[] args)
  {
    int numStud = 5;
    Student[] studentProfile = new Student[numStud];
    
  
    /*
      Student.java is used to assign values to the student variables below
      student variables are then stored in array studentProfile
    */
  
    //________________________________________
  
    //Variable student1 is created
    Student student1 = new Student();
    
    /*
      in Student.java .setGpa & .setMajor allows the user to input a value
      these values are then assigned to a specific variable of choice
      
      below, values 3.0 and "Computer Science" were given to student1
      using .setGpa & .setMajor
    */
    student1.setGpa(3.0);
    student1.setMajor("Computer Science");
    studentProfile[0] = student1;
    
    //________________________________________
    
    /*
      like student1 the following below is repeated 4 more times
      for other variables
    */
  
    Student student2 = new Student();
    student2.setGpa(3.1);
    student2.setMajor("Math");
    studentProfile[1] = student2;
    
  //________________________________________
    Student student3 = new Student();
    student3.setGpa(3.2);
    student3.setMajor("RN");
    studentProfile[2] = student3;
    
  //________________________________________
    Student student4 = new Student();
    student4.setGpa(3.3);
    student4.setMajor("Psychology");
    studentProfile[3] = student4;
    
  //________________________________________
    Student student5 = new Student();
    student5.setGpa(3.4);
    student5.setMajor("Biology");
    studentProfile[4] = student5;
    
    //________________________________________
  
    //for is used to print everything in array studentProfile
    for(int i = 0; i < numStud; i++)
    {
      System.out.println("\n " + studentProfile[i].toString());
    }
    
    
    
    
    
  }


}
