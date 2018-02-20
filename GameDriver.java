/*
  Keven Melendez
  CoSci 290
*/

//Do this command right before editing code every session
//git pull origin master
//don't forget to document code
// putt // every section of code to show what each piece of code is actually doing

import java.util.Scanner;

public class GameDriver
{
  public static void main(String[] args)
  {
    String mainTitle = "\t.  ..___.    __ .__..  ..___  .___..__.  .__ .__..__ .  ..  ..__..__  |"
                        + "\n\t|  |[__ |   /  `|  ||\\/|[__     |  |  |  |  \\[__][__)|_/ |__|[__][__) |"
                        + "\n\t|/\\|[___|___\\__.|__||  |[___    |  |__|  |__/|  ||  \\|  \\|  ||  ||  \\ * ";
    
    String mainIntro = "\n\n\tWelcome to Darkhar!"
                        + "\n\tWhere we stand now is on no man's land." 
                        + "\n\tThere is no law; no faith on this unconquered land "
                        + "\n\tAnything goes here. Trust no stranger even your own friends.";
    
    String storyPart1 = "\n\n\tNarrator: \"You wake up from being knocked-out."
                        + "\n\t\t  Sadly, you remember nothing now but, as time passes by you will remember little by little who you are."
                        + "\n\t\t  You look up and realize a man is talking to you.\"\n";

    
    String askPlayerForName = "\n\tMan: \"What is your name warrior?\" \n\t";
    
    //displays all strings above to user
    System.out.println(mainTitle + mainIntro + storyPart1 + askPlayerForName);
    
    //___________________________________________________________________________________________________________________________________//
    
    //Recieves input from player and stores it under String playerName
    Scanner input = new Scanner(System.in);
    String playerName;
    playerName = input.next();
    
    //___________________________________________________________________________________________________________________________________//
    
    //displays String introCharacter1... introducing player to character1 and showing recieved string input for playerName
    String character1 = "Cristof";
    String introCharacter1 = "\n\tMan: \"" + playerName + "! *Hahaha(laughs), that is a mighty fine name for a warrior.\""
                              + "\n\n\tMan: \"To satisfy your curiosity " + playerName + "."
                              + "\n\t     My name is Cristovich but, call me " + character1 + "."
                              + "\n\t     I know, Cristovich? I get it. Quite an odd name for a region like this, is it not?\"";
    
    System.out.println(introCharacter1);
    
    //___________________________________________________________________________________________________________________________________//
    
    //displays message that will ask player for age
    String introCharacter2 = "\n\t" + playerName + " how old are you?\n";
    System.out.println(introCharacter2);
    
    //___________________________________________________________________________________________________________________________________//
    
    /*
      depending on the age the player chooses it will give the player a certain fighting class being 
      a white-knight, templar, barbarian or wizard. Each of these fighting classes recieves a certain amount 
      of possible health and damage using if and else with the Math.random code
    */
    int playerAge;
    int playerHealth;
    String playerType;
    
    /*
      the amount of damage that the player will give to its opponent is stored in
      playerMove(One/Two) and the names of those moves will be stored in
      playerMove(One/Two)Name
    */
    String playerMoveOneName;
    int playerMoveOne;
    String playerMoveTwoName;
    int playerMoveTwo;
    
    //damage that the first opponent will give to player in battle
    int strikeFromEnemy1;
    
    //the consequence for deciding attack move 1 or 2 is stored in playerConsequenceFromMove(One/Two) which will affect playerHealth
    int playerConsequenceFromMoveOne;
    int playerConsequenceFromMoveTwo;
    
    //when player puts in the number of age it will be put under variable playerAge
    playerAge = input.nextInt();
    
    //depending on the age put in it will give the player a certain message
    String ifAgeBetween18to45 = "\n\tCristof: \"" + playerAge + " years old, I am not surprised since you look healthy."
                                 + "\n\t\tWith that age, healthy look and sword you carry; you must be a White Knight."
                                 + "\n\t\tWhite Knights are known to be mortals who wander around doing their best to keep peace\"";
    String ifAgeBetween14to17 = "\n\tCristof: \"" + playerAge + " years old!?! But, you look so mature."
                                 + "\n\t\tYou must be a templar for they hold a lot of information on healthy growth practices for their young.\"";
    String ifAgeBetween46to120 = "\n\tCristof: \"" + playerAge + ", hahahaha(laughs). You and I may not be so different then."
                                 + "\n\t\tFor us barbarians we enjoy traveling through well known countries.\"";
    String ifAgeSomethingElse = "\n\tCristof: \"" + playerAge + "!?! Are you a child of the gods? Dear heavens you look so different for your age."
                                 + "\n\t\t  You must be a wizard which would explain why you carry that strange pointy hat on you and that stick with you.\"";
    
    /*
      since the player put in an age between 18-45 the string ifAgeBetween18to45 is displayed,
      certain amount of health is given (stored in playerHealth), name of moves (stored in both playerMoveOneName & playerMoveTwoName), 
      and name of player type (stored in playerType)
    */
    if(playerAge >= 18 && playerAge <= 45) //white-knight
    {
      System.out.println(ifAgeBetween18to45);
      
      playerType = "White-Knight";
      playerHealth = 121 + (int)(Math.random() * 20);
      playerMoveOneName = "double-edged strike";
      playerMoveTwoName = "quick-jab";
      
    }
    
    /*
      since the player put in an age between 14-17 the string ifAgeBetween18to45 is displayed,
      certain amount of health is given (stored in playerHealth), name of moves (stored in both playerMoveOneName & playerMoveTwoName), 
      and name of player type (stored in playerType)
    */
    else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      System.out.println(ifAgeBetween14to17);
      
      playerType = "Templar";
      playerHealth = 111 + (int)(Math.random() * 20);
      playerMoveOneName = "double strike";
      playerMoveTwoName = "jab & shield";
      
    }
    
    /*
      since the player put in an age between 46-120 the string ifAgeBetween46to120 is displayed,
      certain amount of health is given (stored in playerHealth), name of moves (stored in both playerMoveOneName & playerMoveTwoName), 
      and name of player type (stored in playerType)
    */
    else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      
      System.out.println(ifAgeBetween46to120);
      
      playerType = "Barbarian";
      playerHealth = 141 + (int)(Math.random() * 20);
      playerMoveOneName = "barrage strike";
      playerMoveTwoName = "fling 'astone";
      
    }
    
    /*
      since the player put in an age that DOES NOT FALL INTO EITHER 18-45, 14-17 & 46-120 THEN the string ifAgeSomethingElse is displayed,
      certain amount of health is given (stored in playerHealth), name of moves (stored in both playerMoveOneName & playerMoveTwoName), 
      and name of player type (stored in playerType)
    */
    else //wizard
    {
      System.out.println(ifAgeSomethingElse);
      
      playerType = "Wizard";
      playerHealth = 76 + (int)(Math.random() * 20);
      playerMoveOneName = "dark spell";
      playerMoveTwoName = "light spell";
      
    }
    
    //___________________________________________________________________________________________________________________________________//
    
    //name of first opponent stored in enemy1
    String enemy1 = "Prometheus";
    
    //introduction to first battle stored in String battleDemoIntro
    String battleDemoIntro = "\n\n\t" + character1 + ": \"Well then you " + playerType + ", shall we warm you up with a battle?"
                             + "\n\t\t Meet, " + enemy1 + "! He will warm you up with a decent battle."
                             + "\n\t\t Do not under-estimate him for he is a formidable opponent. Even for me.\"";
    //then displayed through here
    System.out.println(battleDemoIntro);
    
    //number which triggers either move one, two or help display will be stored under strike
    int strike;
    
    //amount of HP the first opponent will have
    int enemy1HP = 300;
    
    //number of damage dealt to enemy stored in here
    int damageDoneToEnemy = 0;
    //report of number of damage given to enemy will be stored in damageDoneToEnemyUpdate
    String damageDoneToEnemyUpdate = "";
    //number of damage recieved from enemy will be stored in damageRecievedFromEnemy
    int damageRecievedFromEnemy = 0;
    //report of number of damage recieved is stored in damageDoneToEnemyUpdate
    String damageRecievedFromEnemyUpdate = "";
    String moveDecided = "";
    
    /*
      as long as BOTH the player or opponent has some type of number of 
      health greater or equal to 1 the messages and choices will appear within here
    */
    while (enemy1HP >= 1 && playerHealth >= 1)
    { 
      //status report of player health, damage done to enemy & damage given to player are all combined into String fightUpdateMessageBattle
      String fightUpdateMessageBattle = "\n\t" + enemy1 + " has " + enemy1HP + " HP."
                                          /*
                                            when the battle first begins there is nothing stored in damageDoneToEnemyUpdate 
                                            but once a choice is made between move 1 and 2 it will be updated and displayed
                                          */
                                        + damageDoneToEnemyUpdate + moveDecided
                                        + "\n\n\t" + playerName + " has " + playerHealth + " HP."
                                          /*
                                            when the battle first begins there is nothing stored in damageRecievedFromEnemyUpdate 
                                            but once a choice is made between move 1 and 2 it will be updated and displayed
                                          */
                                        + damageRecievedFromEnemyUpdate
                                        + "\n\n\tType 1 for strong attack or press 2 for weak attack."
                                        + "\n\tType in any other number if you need help in choosing which attack.\n";
      //String fightUpdateMessageBattle is displayed through here
      System.out.println(fightUpdateMessageBattle);
      
      //through this code when the player puts in 1 it will trigger the stronger move and if 2 is put in it will trigger the weaker move
      strike = input.nextInt();
      
      strikeFromEnemy1 = 1 + (int)(Math.random() * 28);
     
                /*
                  put the values inside the while. So whenever the while remains true.
                  The number of damage dealt to opponent and number of damage recieved by the opponent will be re-rolled using Math.random
                  values of attack are different for every role that could be assigned to player which
                  was already assigned to the player at the start of the game when the player put in a certain age number
                */
                 if(playerAge >= 18 && playerAge <= 45) // white knight
                {
                  playerMoveOne = 31 + (int)(Math.random() * 10);
                  playerMoveTwo = 9 + (int)(Math.random() * 6);
                  playerConsequenceFromMoveOne = (-1) * (strikeFromEnemy1 + 10);
                  playerConsequenceFromMoveTwo = (-1) * (strikeFromEnemy1 / 3 );

                }

                else if (playerAge >= 14 && playerAge <= 17) // templar
                {
                  playerMoveOne = (13 + (int)(Math.random() * 10)) + (12 + (int)(Math.random() * 9));
                  playerMoveTwo = 8 + (int)(Math.random() * 14); 
                  playerConsequenceFromMoveOne = (-1) * (strikeFromEnemy1);
                  playerConsequenceFromMoveTwo = 10 + ((-1) * (strikeFromEnemy1));

                }

                else if (playerAge >= 46 && playerAge <= 120) // barbarian
                {
                  playerMoveOne = (5 + (int)(Math.random() * 5)) + (5 + (int)(Math.random() * 4)) + (4 + (int)(Math.random() * 4)) + (3 + (int)(Math.random() * 3)) + (2 + (int)(Math.random() * 2)) + (1 + (int)(Math.random() * 2));
                  playerMoveTwo = 7 + (int)(Math.random() * 11);
                  playerConsequenceFromMoveOne = (-1) * (strikeFromEnemy1 + 3);
                  playerConsequenceFromMoveTwo = (-1) * (strikeFromEnemy1/4);

                }
                else //wizard
                { 
                  playerMoveOne = 21 + (int)(Math.random() * 20);
                  playerMoveTwo = 6 + (int)(Math.random() * 20);
                  playerConsequenceFromMoveOne = (-1) * (strikeFromEnemy1);
                  playerConsequenceFromMoveTwo = (-1) * (playerMoveTwo - strikeFromEnemy1);
                  

                }
      //if user types in 1 then move one is triggered
     if (strike == 1)
     {
       enemy1HP = enemy1HP - playerMoveOne;
       playerHealth = playerHealth + playerConsequenceFromMoveOne;
       damageDoneToEnemy = playerMoveOne;
       damageDoneToEnemyUpdate = "\n\t" + playerName + " caused " + damageDoneToEnemy + " damage to " + enemy1 + ".";
       damageRecievedFromEnemy = (-1) * playerConsequenceFromMoveOne;
       damageRecievedFromEnemyUpdate = "\n\t" + enemy1 + " caused " + damageRecievedFromEnemy + " damage to " + playerName + ".";
       moveDecided = "\n\tUsing " + playerMoveOneName;
       
     }
      //if user types in 2 then move two is triggered
     else if (strike == 2)
     {
       enemy1HP = enemy1HP - playerMoveTwo;
       playerHealth = playerHealth + playerConsequenceFromMoveTwo;
       damageDoneToEnemy = playerMoveTwo;
       damageDoneToEnemyUpdate = "\n\t" + playerName + " caused " + damageDoneToEnemy + " damage to " + enemy1 + ".";
       damageRecievedFromEnemy = (-1) * playerConsequenceFromMoveTwo;
       damageRecievedFromEnemyUpdate = "\n\t" + enemy1 + " caused " + damageRecievedFromEnemy + " damage to " + playerName + ".";
       moveDecided = "\n\tUsing " + playerMoveTwoName;
     }
     //if user types in any other number then help is triggered
     else
     {
       //help message
       String helpSection = "\n\n\tBased on the age you the player put in you recieved a certain class being either a White-Knight, Templar, barbarian or wizard."
                            + "\n\tCertain classes gives the player certain advantages."
                            + "\n\tWhite-Knight: Health between 120 - 140 HP"
                            + "\n\t\tdouble-edged strike deals a damage between 31 - 41"
                            + "\n\t\tquick-jab deals a damage between 9 - 15"
                            + "\n\tTemplar: Health between 110 - 130 HP"
                            + "\n\t\tdouble strike deals a damage between 25 - 44"
                            + "\n\t\tjab & shield deals a damage between 8 - 22"
                            + "\n\tBarbarian: Health between 140 - 160 HP"
                            + "\n\t\tbarrage strike deals a damage between 20 - 41"
                            + "\n\t\tfling 'astone deals a damage between 7 - 19"
                            + "\n\tWizard: Health between 75 - 95 HP"
                            + "\n\t\tdark spell deals a damage between 21 -41"
                            + "\n\t\tlight spell deals a damage between 6 - 26"
                            + "\n\n\tBUT! WHEN THE YOU PLAYER DECIDES TO USE MOVE ONE YOU RUN THE RISK OF RECIEVING MORE DAMAGE!"
                            + "\n\tWHEN YOU CHOOSE MOVE 2 YOU RUN THE RISK OF TAKING LESS DAMAGE!";
       //help message displayed through here
       System.out.println(helpSection);
     }
     
     

      
    }
    
    if (enemy1HP <= 0) //if opponent number of HP is less than or equal to 0 then message below pops up
    {
      System.out.println("\n\tPrometheus is DEFEATED.\n\t GAME OVER");
      
    }
    
    else if (playerHealth <= 0) //if player number of HP is less than or equal to 0 then message below pops up
    {
      System.out.println("\n\tYOU WERE DEFEATED.\n\tGAME OVER");
      
    }
    else //else is just used to fill in... nothing important
    {
      System.out.println("\n\tContinue the fight");
    }
                                
    
  }
  
  //do not type code after this => }
}