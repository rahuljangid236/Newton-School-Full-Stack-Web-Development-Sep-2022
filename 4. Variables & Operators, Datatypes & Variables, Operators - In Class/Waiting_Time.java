/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Waiting Time
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is standing in a line for her turn to see the doctor. There are N people standing in front of Sara and for each person, the doctor takes exactly X minutes. Sara wants to know the time after which her number comes. Since Sara is weak in maths, your task is to calculate the time for her.
Input
Th input contains two integers N and X.

Constraints:-
1 <= N <= 1000
1 <= X <= 1000
Output
Return the total time Sara needs to wait before her turn in minutes.
Example
Sample Input:-
5 3

Sample Output:-
15

Sample Input:-
3 2

Sample Output:-
6
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
                      int X =sc.nextInt();

                      int time = N*X;
                      System.out.println(time); 
    }
}