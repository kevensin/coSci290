

import java.util.Scanner;

public class WeaponRandomizer
{
  public static void main(String[] args)
  {
   int minimum = 1;
   int maximum = 1000;
   String weapon1 = "gun";
   String weapon2 = "axe";
   String weapon3 = "hammer";
   String weapon4 = "Stick";
   int randomWeapon = minimum + (int)(Math.random() * maximum);
       
   if(randomWeapon >= 200 && randomWeapon <= 250)
   {
   System.out.println(weapon1);  
   }    
   else if((randomWeapon >= 1 && randomWeapon <= 199) || (randomWeapon >= 251 && randomWeapon <= 350) )
   {
     System.out.println(weapon2);
   }
   else if((randomWeapon >= 351 && randomWeapon <= 430) || (randomWeapon >= 500 && randomWeapon <= 700) || (randomWeapon >= 890 && randomWeapon <= 1000))
   {
     System.out.println(weapon3);
   }
   else
   {
     System.out.println(weapon4);
   }
  
  }

}