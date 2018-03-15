/*
Keven Melendez
Co Sci 290
*/


import java.util.Scanner;

public class TestStudent
{
  
  public static String profile(double gpa, String major)
  {
    Student student = new Student();
    student.setGpa(gpa);
    student.setMajor(major);
    return student.toString();
    
  }
  
  
  public static void main(String[] args)
  {
    Student[] studentProfile = new Student[5];
    String[] examStud = {profile(1.0, "rn"), profile(2.0, "PL")};
    /*Scanner input = new Scanner(System.in);
    Student student1 = new Student();
    System.out.println(student1.getGpa());
    student1.setGpa(2.0);
    System.out.println(student1.getGpa());*/
    Student student1 = new Student();
    /*student1.setGpa(1.0);
    student1.setMajor("RN");*/
    //student1 = profile(1.0, "RN");
    //student1.profile(1.0, "rn");
    studentProfile[0] = student1;
    
    
    
    System.out.println(examStud[0] + "\n" + examStud[1]);
    
    
    
    
    
    
  }

}