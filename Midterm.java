
import java.util.*;

public class Midterm
{

public static void main(String[] args)
{
  ArrayList<Double> list = new ArrayList<Double>(); 
  
  
  
  list.add(2.0);
  list.add(4.2);
  list.add(3.1);
  list.add(2.8);
  list.add(1.6);
  
  
  sortArray(list);
  
  //System.out.println(setOfNumbers[1]);


}
  
  public static void sortArray(ArrayList<Double> list)
  {
    java.util.Collections.sort(list);
    for(int i = 0; i < list.size(); i++)
  {
    System.out.println(list.get(i));
  }
  }

}