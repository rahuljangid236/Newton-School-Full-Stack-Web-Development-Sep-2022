/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Fahrenheit to Celsius
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a temperature F in Farenheit, your task is to convert it into Celsius using the following equation:-
T(°c) = (T(°f) - 32)*5/9
Input
The input contains a single integer F.

Constraints:-
-10^3 <= F <= 10^3

Note:- It is guaranteed that F - 32 will be a multiple of 9.
Output
Print an integer containing converted temperature in Fahrenheit.
Example
Sample Input :
77

Sample Output:
25

Sample Input:-
-40

Sample Output:-
-40
 **********************************************************************************************************************/

/*Solution */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int F = sc.nextInt();
                      int C =((F-32)*5)/9;
                      
                      System.out.println(C);
    }
}