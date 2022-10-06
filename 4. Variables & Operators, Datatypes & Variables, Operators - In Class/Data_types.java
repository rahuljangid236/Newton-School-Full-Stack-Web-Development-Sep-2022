/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Data types
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
Input
The input contains the following values separated by lines:- integer, Long, float, double, char
Output
Print each element in a new line in the same order as input.

Note:- Print float round off to two decimal places and double to 4 decimal places.
Example
Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c
 **********************************************************************************************************************/

/*Solution */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long b=sc.nextLong();
        float c=sc.nextFloat();
        double d=sc.nextDouble();
        char e=sc.next().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.printf("%.2f\n",c);
        System.out.printf("%.4f\n",d);
        System.out.println(e);
    }
}