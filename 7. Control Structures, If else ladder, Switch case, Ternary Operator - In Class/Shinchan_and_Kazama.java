/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Shinchan and Kazama
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Shinchan and Kazama are standing in a horizontal line, Shinchan is standing at point A and Kazama is standing at point B. Kazama is very intelligent and recently he learned how to calculate the speed if the distance and time are given and now he wants to check if the formula he learned is correct or not So he starts running at a speed of S unit/s towards Shinhan and noted the time he reaches to Shinhan. Since Kazama is disturbed by Shinchan, can you calculate the time for him?
Input
The input contains three integers A, B, and S separated by spaces.

Constraints:-
1 <= A, B, V <= 1000

Note:- It is guaranteed that the calculated distance will always be divisible by V.
Output
Print the Time taken in seconds by Kazama to reach Shinchan.

Note:- Remember Distance can not be negative
Example
Sample Input:-
5 2 3

Sample Output:-
1

Explanation:-
Distance = 5-2 = 3, Speed = 3
Time = Distance/Speed

Sample Input:-
9 1 2

Sample Output:-
4
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();
        int dis = Math.abs(a-b);
        System.out.print(dis/s);
    }
}