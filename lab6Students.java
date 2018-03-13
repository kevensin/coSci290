/*
  Keven Melendez
  Co Sci 290
*/


import java.util.Scanner;

public class lab6Students
{

public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
  int numStudents = 0;
  
  String askNumberOfStudents = "How many students are we talking about?";
  System.out.println(askNumberOfStudents);
  numStudents = input.nextInt();

  String[] studNames = new String[numStudents];
  String[] studMajors = new String[numStudents];
  double[] studGpa = new double[numStudents];
  
  for(int i = 0; i < numStudents; i++)
  {
    //asks for student name
    System.out.println("Name of student?");
    studNames[i] = input.next();
    //then asks for the major of student under the name previously given
    System.out.println("The major of this student?");
    studMajors[i] = input.next();
    //finally asks for the gpa of student under the name previously given
    System.out.println("The gpa of this student?");
    studGpa[i] = input.nextDouble();    
  }
  
  /*
    the for above is used to store
    the for below is used to print
    
    I separated them to ensure that every time the user is finished 
    inputting for every student the following below is not printed every time
  */
  for(int i = 0; i < numStudents; i++)
  {
  System.out.println("\n" + studNames[i] + " - major: " + studMajors[i] + " and gpa: " + studGpa[i]);
  }
  


}


}
