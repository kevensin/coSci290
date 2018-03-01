/*
  Sina Tuy
  CoSci 290
  
  Topics:
   functions/methods - what all the different parts are
    - access modifier
    - return type
    - function name
    - parameters (optional)
    */
    
    public class TestFunctions
    {
      //entry point of application
      /*
        public is an access modifier
        access modifiers
        - public anything can see/access
        - only functions within a class can access
        default - same thing as not written/declared modifier
        
      */
      
      //return types
      /*
        - int
        - String
        - double
        - char
        - boolean
        - void - doesn't return anything
        - also different objects
      */
      
      //funtion name
      /*
         - main is just the name which follows the same rules as any identifier
         - use the name of function to call it
      */
      
      //funtion parameters
      /*
         - input that the function uses inside somewhere
         - seperate multiple parameters with commas
      */
      public static void main(String[] args)
      {
        
        int num1 = 2;
        int num2 = 3;
        
        String name = "keven";
        
        //call function findSum()
        System.out.println("" + findSum(num1, num2));
        printHello(name);
        
          
      }
    
      //class which adds two numbers and returns the sum
      public static int findSum(int num1 , int num2)
      {
        
        int sum = num1 + num2;
        return sum;
        
      }
      
      public static void printHello(String name)
      {
        System.out.println("Hello " + name);
        
      }
        
        
    //do not code after this
    }