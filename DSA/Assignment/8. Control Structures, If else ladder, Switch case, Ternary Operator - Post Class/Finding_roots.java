/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Finding roots
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25+i2.22
-0.25-i2.22
 **********************************************************************************************************************/

/*Solution */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                       double a,b,c,root1,root2;
			int temp;
			Scanner inp=new Scanner(System.in);
			a=inp.nextDouble();
			b=inp.nextDouble();
			c=inp.nextDouble();
			double dt=(b*b)-(4.0*a*c);
			if(dt>0.0)
				temp=1;
			else if(dt==0.0)
				temp=0;
			else
				temp=-1;
			switch(temp)
			{
				case 1:
					root1=(-b+Math.sqrt(dt))/(2.0*a);
					root2=(-b-Math.sqrt(dt))/(2.0*a);
					System.out.format("%.2f",root1);
					System.out.format("\n%.2f",root2);
					break;
				case 0:
					root1=-b/(2.0*a);
					System.out.format("%.2f",root1);
					System.out.format("\n%.2f",root1);
					break;
				case -1:
					root1=-b/(2.0*a);
					root2=Math.sqrt(-dt)/(2.0*a);
					System.out.format("%.2f+",root1);
					System.out.format("i%.2f",root2);
					System.out.format("\n%.2f-",root1);
					System.out.format("i%.2f",root2);
					
					break;
			}
    }
}