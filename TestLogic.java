/*
  Keven Melendez
  Co Sci 290
    
    Topics:
      - multi-way if-else
      - logical operators
      - symbolic logic

*/

import java.util.Scanner;
public class TestLogic
{
   public static void main(String[] args)
   {
     System.out.println("Enter a grade");
     //ask user for grade
     Scanner input = new Scanner(System.in);
     
     
   int grade = input.nextInt();
   
     //simple if
   /*if(grade >= 90)
   {
    System.out.println("A");
   }
     //two-way if-else
   if(grade < 90)
   {
     System.out.println("grade is not an A");
     
   }
   else
   {
     System.out.println("grade is an A");
   }*/
     
     if(grade >= 90 && grade <= 100)
     {
       System.out.println("A");
       
     }
     else if (grade >= 80 && grade <= 89)
     {
       System.out.println("B");
       
     }
     else if(grade >= 70 && grade <= 79)
     {
       System.out.println("C");
       
     }
     else if(grade >= 60 && grade <= 69)
     {
       System.out.println("D");
       
     }
     else if(grade <= 59 && grade >= 0)
     {
       System.out.println("F");
       
     }
     else
     {
       System.out.println("Value not accepted");
     }
   
     if (grade >= 80 && grade <= 100)
     {
       System.out.println("good grade");
     }
    else if (grade >= 70 && grade <= 79)
    {
      System.out.println("This is an average grade");
      
    }
   else if (grade >= 0 && grade <= 69)
   {
     System.out.println("Bad grade");
     
   }
   else if (grade > 100)
   {
     System.out.println("EXTRA CREDIT! WOW!");
   }
   else
   {
     System.out.println("Grade out of range");
     
   }
   
   int minimum = 1;
   int maximum = 4;
   String weapon1 = "gun";
   String weapon2 = "axe";
   String weapon3 = "hammer";
   String weapon4 = "Stick";
   int randomWeapon = minimum + (int)(Math.random() * maximum);
       
   if(randomWeapon == 1)
   {
   System.out.println(weapon1);  
   }    
   else if(randomWeapon == 2)
   {
     System.out.println(weapon2);
   }
   else if(randomWeapon == 2)
   {
     System.out.println(weapon3);
   }
   else
   {
     System.out.println(weapon4);
   }
   
   
   //no code outside of this unless new class
   }



//no code outside of this
}
