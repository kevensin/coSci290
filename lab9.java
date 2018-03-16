/*
  Keven Melendez
  Co Sci 290
*/


import java.util.*;
import java.util.Scanner;

public class lab9
{
  //profile() returns an object
  /*
  Student.java is called within the method and creates an object named student
  setGpa gives the student object a double value
  setMajor gives the student object a String value
  in the end it returns the student object with the values given to it which could be used in an array
  */
     public static Student profile(double gpa, String major)
  {
    Student student = new Student();
    student.setGpa(gpa);
    student.setMajor(major);
    return student;
  }
  
  public static void main(String[] args)
  {
    /*
    ArrayList could be used to allow a user to keep storing into its list
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    
    its unlike normal arrays where you have to set the size and have to set those specific indexes to a values like below
    String[] names = new String[5];
    names[0] = "keven";
    
    array initializer allows a programmer to add as many values but only as long as its in {}
    String[] names = {"keven", "rachel"}
    
    ArrayList are not restricted within brackets like these {}
    it has no harcoded max
    it could allow the user of the program to add to the list encase 
    if further down the lines we forgot something we could just code for example list.add(someValue);
    */
    ArrayList<Student> list = new ArrayList<Student>();
    //and object is added to the array with a double value and String value using the method profile() created above
    list.add(profile(2.3, "Electrical Engineering"));
    list.add(profile(3.5, "Psychology"));
    list.add(profile(3.8, "Math"));
    list.add(profile(4.0, "Kinesiology"));
    list.add(profile(3.0, "Art"));
    
    printStudents(list);
    
    //below the method findMajor() is used 
    /*
    Since art is stored as a String major in one of the student objects
    it will return a student object with a String major "Art" in it
    */
    System.out.println("\n" + findMajor(list, "Art"));
  }
  
  //method printStudents() is used to print out the array using a for loop
  public static void printStudents(ArrayList<Student> list)
  {
    for(int i = 0; i < list.size(); i++)
    {
      System.out.println("\n" + list.get(i));
    }
  }
  
  //method findMajor() returns an object if input String value matches a student object stored in the ArrayList<Student> inputted
  public static Student findMajor(ArrayList<Student> list, String major)
  {
    Student defaultStudent = new Student();
    for(int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getMajor() == major)
      {
        return list.get(i);
      }
    }
    return defaultStudent;
  } 


}