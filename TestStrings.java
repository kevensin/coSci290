/*
  Keven Melendez
  Co Sci 290
*/

import java.util.Scanner;

public class TestStrings
{

  //main method
  public static void main(String[] args)
  {
    //instantiate the Scanner object -- Scanner is a class
    //Scanner becomes an object when you give it a name
    boolean flag = false;
    Scanner input = new Scanner(System.in);
    
    String question2 = ("What is your name?");
    System.out.println(question2);
    
    //get answer through console
    String answer = "";
    answer = input.next();
    
    for(int index = 0; index < answer.length(); index++)
    {
      //check if character in String is a char or int
      if(!Character.isLetter(answer.charAt(index))) //if not
      {
        flag = true;
      }
    }
    
    /* 
    .compareTo();
    .length(); - gives a int of how many characters the String is long
    */
    while(answer.length() <2 || flag == true)
    {
      System.out.println(question2);
      String characterLimit = "only letters please and it has to be 2 or more letter";
      System.out.println(characterLimit);
      answer = input.next();
      flag = false;
      for(int index = 0; index < answer.length(); index++)
    {
      //check if character in String is a char or int
      if(!Character.isLetter(answer.charAt(index))) //if not
      {
        flag = true;
      }
    }
    }
    System.out.println("Nice to meet you " + answer);
    
    //________________________________________________________________________________
    
    
    
    //________________________________________________________________________________
    
    /*
      want to run a code at least once use do-while loop
      do
      {
        body w/ code
      }
      while(some condition)
      {
      
      }
    */
    
    /*String greeting = "Nice to meet you " + greeting;
    System.out.println(greeting);
    
    
    String question1 = ("Are you wealthy?");
    System.out.println(question1);
    */
    
    /*
      example 1
      answer.toLowerCase(); <= you could have used this w/ a combo of .equals
      .equals() is literal and is case sensitive
      .equalsIgnoreCase(); is not case sensitive
    
    if(answer.equalsIgnoreCase("no")) //"no" is not equal to "No"
    {
      String answer = "That sucks!";
      System.out.println(answer);
    }
    
    */
    
  }
  
//no code outside of bracket below
}