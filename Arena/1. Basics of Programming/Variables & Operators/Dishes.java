/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Dishes
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sheldon and Leonard are gone for lunch but none of them have money so they decided to wash dishes. In total, they washed T dishes from which N dishes are washed by Leonard. Now Leonard wants to know the number of dishes Sheldon washed. Help him to find it.
Input
The first line of the input contains N and T

Constraints:-
1 <= N <= T <= 1000
Output
Return the number of dishes Sheldon washed.
Example
Sample Input:-
3 6

Sample Output:-
3

Sample Input:-
2 4

Sample Output:-
2
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
                      int N = sc.nextInt(), T =sc.nextInt();
                      if(N>T){
                          System.out.println(N-T);
                      }else{
                          System.out.println(T-N);
                      }
    }
}