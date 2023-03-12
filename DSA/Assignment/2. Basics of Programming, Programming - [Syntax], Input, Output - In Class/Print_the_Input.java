/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Print the input!
easy
Problem Statement
Take an integer as input and print it.
Input
The first line contains integer as input.

Constraints
1 <= N <= 10
Output
Print the input integer in a single line
Example
Sample Input:-
2

Sample Output:-
2

Sample Input:-
4

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
        int num = sc.nextInt();
        System.out.println(num);
    }
}
