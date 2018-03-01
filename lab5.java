/*
  Keven Melendez
  CoSci 290
*/

import java.util.Scanner;

public class lab5
{
  public static void main(String[] args)
  {
  
    //instantiate the Scanner object -- Scanner is a class
    //Scanner becomes an object when you give it a name
    boolean flag = false;
    
    //Scanner is used to recieve input from user
    Scanner input = new Scanner(System.in);
    
    String question = ("What is your name?");
    System.out.println(question);
    
    //get answer through console
    String answer = "";
    answer = input.next();
    
    for(int index = 0; index < answer.length(); index++)
    {
      /*
        check if character in String is a char or int 
        if not then flag is set to true
      */
      if(!Character.isLetter(answer.charAt(index)))
      {
        flag = true;
      }
    }
    
    /* 
      .length(); - gives a int of how many characters withing the String there are
    */
    while(answer.length() <2 || flag == true)
    {
      System.out.println(question);
      String characterLimit = "only letters please and it has to be more than 2 characters";
      System.out.println(characterLimit);
      answer = input.next();
      //flag is set to false
      flag = false;
      /*
        flag is set to false 
        BUT the code inside the scope of the for checks every character within the String answer again
        SO IF ANY OF THE CHARACTERS WITHIN THE STRING IS NOT A LETTER
        THEN flag = true again ONLY THEN WILL THE LOOP CONTINUE
        
        if all characters within the String answer is a letter then the if within the scope of for is ignored
        then flag remains false
      */
      for(int index = 0; index < answer.length(); index++)
    {
      /*
        checks if any characters within String answer one by one
        if any character is not a letter then flag is true again
      */
      if(!Character.isLetter(answer.charAt(index)))
      {
        flag = true;
      }
    }
    }
    //answer is printed out below with an added message before it
    System.out.println("Nice to meet you " + answer);
    
  }

}


