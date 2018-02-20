import java.util.Scanner;

public class ZombieTextAdventure{

public static void main (String[] args)
{ 
  Scanner input = new Scanner(System.in);
  String name;
  String partnerName = "Jake";
  int age = 0;
  
  System.out.println("Welcome survivor! Please, tell us your name?");
  
  name = input.next();
  
  System.out.println("Greetings " + name + ". It is great to have you here. Please, tell us your age so we could partner you with someone suitable to help aid you when traveling." );
  
  age = input.nextInt();
  
  if (age >= 18 && age <= 45)
  {
    partnerName = "Samantha";
    System.out.println("I see, you are " + age + " years old. Then you will be paired with " + partnerName + ". " + partnerName + " is fast and agile. She will be suitable with your ability to move quickly." );
  }
  else if (age >= 5 && age <=17 || age >= 46 && age <= 120)
  {
    partnerName = "Robert";
    System.out.println("Do not fret my friend. For I am much older than you. Well in that case you must partner with our strong man named " + partnerName + ". Although we excel in experience he will fill in for what people like us may lack, strength." );
  }
  else if(age >= 121)
  {
    partnerName = "Cornelius";
      System.out.println(age + ", really? Haha, you are like me, immortal. Then you will be our anchor and you should be partnered up with our almighty, " + partnerName + "!");
  }
  else if(age <= 4)
  {
    partnerName = "JO";
      System.out.println(age + ", then you must be from a time that will take me centuries to get to. Your advantage in knowing about the future may aid you in making decisions but, I am afraid to tell you that the technology in this era may be from the stonage to you. In that case you must partner up with " + partnerName + ". For he is well educated in technology for this time period. He is the the Leonardo Da Vinci of our time period");
    /*partneringUp(partnerName);*/
  }
  else
  {
    System.out.println("You didn't tell me you are age. So then you will be partnered with " + partnerName); 
    
  }
  
  System.out.println("Say hello to your new partner " + partnerName + ".");
  
  



}
  
  /*public String partneringUp(String partnerName)
  {
    
    return "Say hello to your new partner " + parnerName;
    
  }*/


}