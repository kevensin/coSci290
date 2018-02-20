/*
  Keven Melendez
  Co Sci 290
  
  Demo topics on:
    - Increment/decrement operators
    - augmented assignment operators
*/


public class DemoBoolean{
  
  public static void main(String[] args)
  {
    int num = 1;
    num = num + 1;
    num ++;
    ++num;
    
    num = 1;
    int count  = ++ num;
    count = num++;
    System.out.println("count " + count + " num " + num);
    num = 1;
    count = num++;
    System.out.println("count " + count + " num " + num);
    
    count = num--; //post-decrement
    count = --num; //pre-decrement
    
    //examples of augmented assignment operators
    num += 2;
    num *= 2;
    num /= 2;
    num -= 2;
    
    num = 2;
    double num2 = 3.0;
    
    System.out.println("Double wins " + num * num2); //double wins because it takes up more memory
    System.out.println((int) num2); //loses .0
    System.out.println((double) num); //adds .0
    System.out.println((int) 'c'); //turns the c into 99 because of ASt
    
    int numberOfZombies = 3;
    
    if(numberOfZombies < 5)
    {
     System.out.println("You might survive this apocalypse");
      
    }
    else
    {
      System.out.println("You might survive but, maybe not");
      
    }
    
    //Generating a randmon number
    // mathc pow (3, 2) 3^2
    System.out.println(Math.random());
    
    System.out.println(1 + (int)(Math.random() * 10));
    
    int chanceOfSurviving = 1 + (int)(Math.random() * (10-1));
    
    if(chanceOfSurviving <= 3)
    {
      System.out.println("You made it alive!");
      
    }
    else
    {
      System.out.println("You are doomed");
    }
    
    
  
  }
  



}