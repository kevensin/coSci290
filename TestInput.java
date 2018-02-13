/*
  Keven Melendez
  CS290
  2/13/2018
  
  Testing data types and input from the user
 */

import java.util.Scanner; //is a java object that allows you to take user input

public class TestInput{
    //main method starting point of application
  public static void main(String[] args)
  {
    //datatype variableName = expression;
    // I can only start withh a letter; _, or $
    // identifiers with multiple words are cammelCased
    // example numOfStudents. name. interestRate
    
    //primitive datatypes 
    // int - integer - whole number => max is 2147483647
    //double - decimal number => 3.33 0.2
    //char - single character inside single quotations => '3', 't'
    //boolean - true or false => true or false
    
    //object/reference datatypes
    //String - are for multiple characters surrounded by double quotations => "words go here"
    /*there are other objects in Java that comes with Java and that are custom
      objects/class that comes with java: Scanner, System, etc. Objexts
      => Customer classes: Zombie, SpaceInvader, person etc.
    */
    
    final double PI_VALUE = 3.1415; //constatnts are all capital, multiple words separated by underscores.. final will not allow a variable to get updated
    String name;
    int numberOfStudents = 29;
    double avgGPA = 3.70;
    int age;
    
    Scanner input = new Scanner(System.in /*allows to take input from some type of hardware... example keyboard*/);
    
    System.out.println("Hi, give me your name");
    
    name = input.next(); /*will allow input from user*/
    
    System.out.println("Hello " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt();
    
    if (age <= 17)
    {
      System.out.println(age + "?!? Wow you are a baby!");
      
    }
    else if (age >= 18 && age <= 40)
    {
      System.out.println("Great, you are " + age + "years old!");
    }
    
    else if (age >= 41)
    {
      System.out.println(age + "? You must be wise.");
    }
    else if (age <= 0)
    {
      System.out.println(age + "!?! WHAT! GET 'OUTA HERE");
    }
    else{
      System.out.println("I recieved no age input. I understand");
    }
    
    /*
    Arithmentic Operators
    + addition
    - subtraction
    * multiplication
    / division
    = assignment operator, equals
    % modulus, remainder example ==> 10 % 2 and finding remainder which is 0... 10 % 3 = 1 becuase it gives me remainder
    
    Programming Math operators follow the same order of operators
    (), ^ (<== exmponent symbol), multiplication || division, addition || subtraction
    from left to right
    */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("Anyways, if you are " + age + " years old then you are " + month + " months old, " + days + " days old, and " + hours + " hours old. Yeesh.");
    
    
  }
}