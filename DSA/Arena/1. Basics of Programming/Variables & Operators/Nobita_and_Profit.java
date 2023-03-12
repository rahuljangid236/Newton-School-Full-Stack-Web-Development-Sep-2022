/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Nobita and Profit
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Nobita wants to become rich so he came up with some ideas. Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends. Now Nobita wants to know how much he gains by selling 1 gadget. As we all know Nobita is weak in maths help him to find the profit he gets
Input
The input contains two integer C and S separated by spaces.

Constraints:-
1 <= C <= S <= 1000
Output
Print the profit Nobita gets from selling one gadget.
Example
Sample Input:-
3 5

Sample Output:-
2

Sample Input:-
9 15

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
                      int C =sc.nextInt();
                      int S = sc.nextInt();
                      int profit;
                      if(C>S){
                        profit = C-S;
                      }else{
                          profit = S-C;
                      }
                      
                      System.out.println(profit);
    }
}