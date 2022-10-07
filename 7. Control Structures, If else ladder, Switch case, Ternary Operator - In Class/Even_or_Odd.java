/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Conditional statement- Even or Odd
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer, your task is to check whether the integer is even or odd.
Input
The input contains a single integer N.

Constraint:
1<=N<=10000
Output
If the integer is even print 0 else if it is odd print 1.
Example
Sample Input:-
15

Sample Output:-
1

Sample Input:-
16

Sample Output:-
0
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
        int N = sc.nextInt();
        if(N%2==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}