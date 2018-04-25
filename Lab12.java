/*

<<!----- Keven Melendez ------>>
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * * 
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *
    * * * * *
	  * * * * 
	    * * * 
	      * * 
	        *
	4. Fix the indentation of the code. 
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

public class Lab12
{

public static void main(String[] args) 
{
  int i, j, k;
	String shape = "";
	
	for(i=0; i<5;i++)
	{
		int m = 1+i;
		for(j=0; j<m;j++)shape+="* \n";
		
	}
	
	for(j=1;j<9;j++)shape+=" ";
	shape+="*\n";
	for(j=1;j<7;j++)shape+=" ";
	for(j=1;j<4;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<5;j++)shape+=" ";
	for(j=1;j<6;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<3;j++)shape+=" ";
	for(j=1;j<8;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<10;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<3;j++)shape+=" ";
	for(j=1;j<8;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<5;j++)shape+=" ";
	for(j=1;j<6;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<7;j++)shape+=" ";
	for(j=1;j<4;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<9;j++)shape+=" ";
	shape+="*\n";
	for(j=1;j<3;j++)shape+=" ";
	for(j=1;j<6;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<3;j++)shape+=" ";
	for(j=1;j<5;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<5;j++)shape+=" ";
	for(j=1;j<4;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<7;j++)shape+=" ";
	for(j=1;j<3;j++)shape+="* ";
	shape+="\n";
	for(j=1;j<9;j++)shape+=" ";
	for(j=1;j<2;j++)shape+="* ";
  
	printTriangle(shape);
}

public static void printTriangle(String shape)
{
	System.out.println(shape);
}
}