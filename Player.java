/*
  Keven Melendez
  Co Sci 290
*/



public class Player
{
private String playerName;
private int playerAge;
private int playerHealth;
private int playerHP;
private String playerType;


private String playerMoveOneName;
private int playerMoveOne;
private String playerMoveTwoName;
private int playerMoveTwo;
private int playerConsequenceFromMoveOne;
private int playerConsequenceFromMoveTwo;
  
private int damageTaken;
  
public int damageFromVillain()
{
  int damage = 0;
  Villain damagePossible = new Villain();
  damage = damagePossible.damage();
  return damage;
}

public void Player()
{
  this.playerAge = 0;
  this.playerHealth = 0;
  this.playerType = "";
  System.out.println(playerType + playerHealth + playerAge);
}
  
public void setPlayerName(String name)
{
  this.playerName = name;
}
  
public String getPlayerName()
{
  return this.playerName;
}

public void setPlayerAge(int age)
{
  this.playerAge = age;
}

public int getPlayerAge()
{
  return this.playerAge;
}
  
public String getPlayerType()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerType = "White-Knight";
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerType = "Templar";
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerType = "Barbarian";
    }
  else //wizard
    { 
      return this.playerType = "Wizard";
    }
}
  
  public int getPlayerHealth()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerHealth = 121 + (int)(Math.random() * 20);
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerHealth = 111 + (int)(Math.random() * 20);
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerHealth = 141 + (int)(Math.random() * 20);
    }
  else //wizard
    { 
      return this.playerHealth = 76 + (int)(Math.random() * 20);
    }
}
  //_____________________________________________________________
  
  public void setDamageTaken(int damage1, int damage2)
{
  int damageTotal = 0;
    damageTotal += (damage1 + damage2);
  this.damageTaken += damageTotal;
  
}

public int getDamageTaken()
{
  return this.damageTaken;
}
 
public int getHitPoints()
{
  this.playerHP = this.playerHealth;
  return this.playerHP - this.damageTaken;
}
  //____________________________________________________________
  
  public String getPlayerMoveOneName()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerMoveOneName = "double-edged strike";
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerMoveOneName = "double strike";
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerMoveOneName = "barrage strike";
    }
  else //wizard
    { 
      return this.playerMoveOneName = "dark spell";
    }
}
  public int getPlayerMoveOne()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerMoveOne = 31 + (int)(Math.random() * 10);
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerMoveOne = (13 + (int)(Math.random() * 10)) + (12 + (int)(Math.random() * 9));
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerMoveOne = (5 + (int)(Math.random() * 5)) + (5 + (int)(Math.random() * 4)) + (4 + (int)(Math.random() * 4)) + (3 + (int)(Math.random() * 3)) + (2 + (int)(Math.random() * 2)) + (1 + (int)(Math.random() * 2));
    }
  else //wizard
    { 
      return this.playerMoveOne = 21 + (int)(Math.random() * 20);
    }
}
 
  public int getPlayerConsequenceFromMoveOne()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerConsequenceFromMoveOne = damageFromVillain() + 10;
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerConsequenceFromMoveOne = damageFromVillain();
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerConsequenceFromMoveOne = damageFromVillain() + 3;
    }
  else //wizard
    { 
      return this.playerConsequenceFromMoveOne = damageFromVillain();
    }
}
  
  
  public String getPlayerMoveTwoName()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerMoveTwoName = "quick-jab";
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerMoveTwoName = "jab & shield";
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerMoveTwoName = "fling 'astone";
    }
  else //wizard
    { 
      return this.playerMoveTwoName = "light spell";
    }
}
  
  public int getPlayerMoveTwo()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerMoveTwo = 9 + (int)(Math.random() * 6);
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerMoveTwo = 8 + (int)(Math.random() * 14); 
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerMoveTwo = 7 + (int)(Math.random() * 11);
    }
  else //wizard
    { 
      return this.playerMoveTwo = 6 + (int)(Math.random() * 20);
    }
}
  
  public int getPlayerConsequenceFromMoveTwo()
{
  if(this.playerAge >= 18 && this.playerAge <= 45) //white-knight
    {
      return this.playerConsequenceFromMoveTwo = (-1) * (damageFromVillain() / 3 );
    }
    
  else if (playerAge >= 14 && playerAge <= 17) //templar
    {
      return this.playerConsequenceFromMoveTwo = 10 + ((-1) * (damageFromVillain()));
    }  
  else if (playerAge >= 46 && playerAge <= 120) //barbarian
    {
      return this.playerConsequenceFromMoveTwo = (-1) * (damageFromVillain()/4);
    }
  else //wizard
    { 
      return this.playerConsequenceFromMoveTwo = (-1) * (this.playerMoveTwo - damageFromVillain());
    }
}
  
  public String playerSummary()
  {
    String summary = "Your type: " + this.playerType
                      + "\nYour Health: " + this.playerHealth
                      + "\nYour move 1: " + this.playerMoveOneName
                      + "\nYour move 2: " + this.playerMoveTwoName;
    return summary;
  }
  


}