/*
Keven Melendez
CoSci 290

2d arrays
*/

public class Lab15
{
public static void main(String[] args)
{
  int[] row1 = new int[5];
  int[] row2 = new int[5];
  int[] row3 = new int[5];
  int[] row4 = new int[5];
  int[] row5 = new int[5];

  for(int i =0; i<row1.length;i++)
  {
    //each variable in arrays below is given a random value usint method random()
    row1[i] = random();
    row2[i] = random();
    row3[i] = random();
    row4[i] = random();
    row5[i] = random();
    
    //rows is a int 2d array... literals are stored into it
    /*
    instead like a normal array which has for example below
    int[] 1dArray
    
    2d arrays has instead like below
    int[][] 2dArray
    in 2d arrays variables could be accesed not just from left to right like
    a normal array but, from top to bottom as well
    
    for example 
    int[][] array = {
    {0, 1},
    {2, 3}
    };
    
    the first bracket[] is the rows
    and the second bracket[] is the column
    System.out.println(array[1][0]);
    
    expected output:
    2
    
    because 2 is on the 2nd row and its the first stored integer in that row
    */
    int[][] rows = {
      {row1[0], row1[1],row1[2], row1[3],row1[4]},
      {row2[0], row2[1], row2[2], row2[3], row2[4]},
      {row3[0], row3[1], row3[2], row3[3], row3[4]},
      {row4[0], row4[1], row4[2], row4[3], row4[4]},
      {row5[0], row5[1] , row5[2], row5[3], row5[4]},
    };
    //the second for loop is used to print out the rest of the rows
    for(int j=0; j<rows[i].length; j++)
    {
    System.out.println(rows[j][i]+"\n");
      
    }
  }
}
  
  //method returning a random number
  public static int random()
  {
    int min = 0;
    int max = 4;
    int random = min +  (int)(Math.random() * max);
    return random;
  }
//no code after this
}