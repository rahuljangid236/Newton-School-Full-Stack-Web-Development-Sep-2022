/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Operators
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b, your task is to calculate and print the following four values:-
a+b
a-b
a*b
a/b

Note:- See example for more clarity.
Input
The input contains two integers a and b separated by spaces.

Constraints:
1 <= b <= a <= 1000

Note: It is guaranteed that a will be divisible by b.
Output
Print the mentioned operations each in a new line.
Example
Sample Input:
15 3

Sample Output:
18
12
45
5
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
                      int add = a+b;
                      int sub = a-b;
                      int mul = a*b;
                      int div = a/b;
                      System.out.println(add);
                      System.out.println(sub);
                      System.out.println(mul);
                      System.out.println(div);
    }
}