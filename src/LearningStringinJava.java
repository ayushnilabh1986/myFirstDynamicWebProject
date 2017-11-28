/*
 * 1) Fibonacci series

Write a java program to print fibonacci series without using recursion and using recursion.

Input: 10

Output: 0 1 1 2 3 5 8 13 21 34
 public class LearningStringinJava {

    public static void main(String[] args) {

        int n = 100, t1 = 0, t2 = 1;
        
        System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

//------------------------
2) Prime number

Write a java program to check prime number.

Input: 44

Output: not prime number

Input: 7

Output: prime number
import java.util.Scanner;
public class LearningStringinJava
{
	
	private static Scanner scan;

	public static void main(String []args)
	{
		    scan = new Scanner(System.in);

		    //For string

		    String text= scan.nextLine();

		    System.out.println(text);

		    //for int
System.out.println("Enter the number:");
		    int num= scan.nextInt();

		    System.out.println(num);
		    for(int i=2;i<num/2;)
		    {
if(num%i==0)
{
	System.out.println("The number is not prime");
	break;
	}
else
{
	i++;
	}
		if(i==num/2)
		{
			System.out.println("The number is prime");
		}
		    }
		}
		}*/

/*3) Palindrome number

Write a java program to check palindrome number.

Input: 329

Output: not palindrome number

Input: 12321

Output: palindrome number*/
/*import java.util.Scanner;
public class LearningStringinJava
{*/
	/*private static Scanner scan;

	public static void main(String []args)
	{
		   int num, reversedInteger = 0, remainder, originalInteger;
		   
		   //scan = new Scanner(System.in);
		   System.out.println("Enter the number:");
		   scan = new Scanner(System.in);
		num= scan.nextInt();

		    System.out.println(num);
	        originalInteger = num;

	        // reversed integer is stored in variable 
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalInteger == reversedInteger)
	            System.out.println(originalInteger + " is a palindrome.");
	        else
	            System.out.println(originalInteger + " is not a palindrome.");
	    }
*/		
	//public class StringCompareEmp{
		  /* public static void main(String args[]){
		      String str = "Hello World";
		      String anotherString = "hello world";
		      Object objStr = str;

		      System.out.println( str.compareTo(anotherString) );
		      System.out.println( str.compareToIgnoreCase(anotherString) );
		      System.out.println( str.compareTo(objStr.toString()));
		   }
		}	
*/

//public class StringCompareEmp{
	   /*public static void main(String args[]){
	      String str = "Hello World";
	      String anotherString = "hello world";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	   }
*/	   
	   
	   //public class StringCompareequl{
		   /*public static void main(String []args){
		      String s1 = "tutorialspoint";
		      String s2 = "tutorialspoint";
		      String s3 = new String ("Tutorials Point");
		      System.out.println(s1.equals(s2));
		      System.out.println(s2.equals(s3));
		   }
		}*/
/*	   public static void main(String args[]) {
	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	   }
*/	
		 /*  public static void main(String args[]) {
		      String string1 = "saw I was ";
		      System.out.println("Dot " + string1 + "Tod");
		   }*/
//	public class StringCompareequl{
		   /*public static void main(String []args){
		      String s1 = "tutorialspoint";
		      String s2 = "tutorialspoint";
		      String s3 = new String ("Tutorials Point");
		      System.out.println(s1 == s2);
		      System.out.println(s2 == s3);
		   }
		}*/
//	public class StringCompareEmp{
		   /*public static void main(String args[]){
		      String str = "Hello World";
		      String anotherString = "hello world";
		      Object objStr = str;

		      System.out.println( str.compareTo(anotherString) );
		      System.out.println( str.compareToIgnoreCase(anotherString) );
		      System.out.println( str.compareTo(objStr.toString()));
		   }
		   
*/		   class Calculation {
			   int z;
				
			   public void addition(int x, int y) {
			      z = x + y;
			      System.out.println("The sum of the given numbers:"+z);
			   }
				
			   public void Subtraction(int x, int y) {
			      z = x - y;
			      System.out.println("The difference between the given numbers:"+z);
			   }
			}

			public class LearningStringinJava extends Calculation {
			   public void multiplication(int x, int y) {
			      z = x * y;
			      System.out.println("The product of the given numbers:"+z);
			   }
				
			   public static void main(String args[]) {
			      int a = 20, b = 10;
			      LearningStringinJava demo = new LearningStringinJava();
			      demo.addition(a, b);
			      demo.Subtraction(a, b);
			      demo.multiplication(a, b);
			   }
			}
