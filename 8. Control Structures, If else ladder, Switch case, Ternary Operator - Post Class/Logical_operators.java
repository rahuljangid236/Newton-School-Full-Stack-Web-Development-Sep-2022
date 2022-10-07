/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Logical operators
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b, your task is to check following conditions:-
1. If a <= 10 and b >= 10 (Logical AND).
2. Atleast one from a or b will be even (Logical OR).
3. if a is not equal to b (Logical NOT).
Input
The first line of the input contains 2 integers a and b.

Constraints:
1 <= a, b <= 100
Output
Print true if the condition holds in each function else false
Example
Sample Input:-
3 12

Sample Output:-
true true true

Sample Input:-
10 10

Sample Output:-
true true false
 **********************************************************************************************************************/

/*Solution */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        if (a<=10 && b>=10){
            System.out.print("true ");
        }
        else{
            System.out.print("false ");
        }
        if (a%2==0 || b%2==0){
            System.out.print("true ");
        }
        else{
            System.out.print("false ");
        }
        if (a==b){
            System.out.print("false ");
        }
        else{
            System.out.print ("true ");
        }
    }
}