/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Odd or Even
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is even or odd using switch case.
Input
First Line of the input contains the number n.

Constraints
1 <= n <= 1e9
Output
If the number is even print "Even" otherwise "Odd"
Example
Sample Input :
23

Sample Output :
Odd

Sample Input :
24

Sample Output :
Even
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
                      int num = sc.nextInt();
                      switch(num%2){
                          case 0 :
                          System.out.println("Even");
                          break;
                          case 1:
                          System.out.println("Odd");
                          
                      }
    }
}