



public class lab8
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
    //below the method profile() is used in the array initializer
    Student[] studentProfile = {profile(2.3, "Electrical Engineering"), profile(3.5, "Psychology"), profile(3.8, "Math"), profile(4.0, "Kinesiology"), profile(3.0, "Art")};
    
    //below the method printStudents() is used to print out the array studentProfile
    printStudents(studentProfile);
    
    //below the method findMajor() is used 
    System.out.println("\n" + findMajor(studentProfile, "Art"));
  }
  
  //method printStudents() is used to print out the array using a for loop
  public static void printStudents(Student[] students)
  {
    for(int i = 0; i < students.length; i++)
    {
      System.out.println("\n" + students[i]);
    }
  }
  
  //method findMajor() returns an object if input String value mathces a student object in the array inputted
  public static Student findMajor(Student[] students, String major)
  {
    Student defaultStudent = new Student();
    for(int i = 0; i < students.length; i++)
    {
      if (students[i].getMajor() == major)
      {
        return students[i];
      }
    }
    return defaultStudent;
  } 

}