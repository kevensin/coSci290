


public class Villain
{

private int damagePotential;
private int villainHP;
private int hitPointsTaken;
private int damageTaken1;
  
public Villain()
{
  this.damagePotential = 0;
  this.villainHP = 0;
}

public int damage()
{
  this.damagePotential = 1 + (int)(Math.random() * 28);
  return this.damagePotential;
}
  
public void setDamageTaken(int damageTaken)
{
  this.damageTaken1 += damageTaken;
  
}

public int getDamageTaken()
{
  return this.damageTaken1;
}
 
public int getHitPoints()
{
  this.villainHP = 300;
  return this.villainHP - this.damageTaken1;
}


}