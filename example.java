

import java.util.Scanner;

public class example
{



public static void main(String[] args)
{
Player student = new Player();
Villain villain = new Villain();

student.setPlayerAge(0);
System.out.println(student.getPlayerType() + " " + student.getPlayerHealth() + " " + student.getPlayerMoveOneName() + " " + student.getPlayerMoveOne() + " " + student.getPlayerMoveTwoName()+ " " + student.getPlayerMoveTwo());
System.out.println(student.playerSummary());  
System.out.println("damage consequence from move one " + student.getPlayerConsequenceFromMoveOne());
System.out.println("damage consequence from move two " + student.getPlayerConsequenceFromMoveTwo());
//System.out.println("villain hp " + villain.hitPoints() + "\n" + "villain damage " + villain.damage());
//villain.setDamageTaken(20);
//villain.setDamageTaken(student.getPlayerMoveOne());
//System.out.println("villain hitpoints: " + villain.getHitPoints());

  Scanner input = new Scanner(System.in);
  int move = 0;
  
  System.out.println("villain " + villain.getHitPoints());
  System.out.println("student " + student.getHitPoints());
  while(!(villain.getHitPoints() <= 0) && !(student.getHitPoints() <= 0)) 
  {
    System.out.println("type in 1 or 2 please");
    move = input.nextInt();
    
    if(move == 1)
    {
      villain.setDamageTaken(student.getPlayerMoveOne());
      student.setDamageTaken(student.getPlayerConsequenceFromMoveOne(), villain.damage());
    }
    else if(move == 2)
    {
      villain.setDamageTaken(student.getPlayerMoveTwo());
      student.setDamageTaken(student.getPlayerConsequenceFromMoveTwo(), villain.damage());
    }
    else
    {
      System.out.println("Please input 1 or 2. Try again");
    }
   
   if(!(villain.getHitPoints() <= 0) && !(student.getHitPoints() <= 0))
   {
    System.out.println("villain is still alive");
    System.out.println("hitpoints taken so far " + villain.getDamageTaken() + " hitpoints left over " + villain.getHitPoints());     
   }
  }
  if(villain.getHitPoints() <= 0) System.out.println("villain is dead");
  if(student.getHitPoints() <= 0) System.out.println("you dead as hell!! and villain is still standing YOU NOOB!");
}
}