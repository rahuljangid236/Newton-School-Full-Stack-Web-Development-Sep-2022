/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Nobits's Test
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Nobita wants to score well in his upcoming test, but he is not able to solve the simple division problems, seeing Nobita's determination Doraemon gives him a gadget that can do division problems easily but somehow Nobita deleted the internal program which calculates the division.
As an excellent coder, Nobita came to you for help. Help Nobita to write a code for his gadget.
You will be given two integers D and Q, you have to print the floor value of D/Q
Input
The input contains two space- separated integers depicting the values of D and Q.

Constraints:-
0 <= D, Q <= 100
Output
Print the values of D/Q if the value can be calculated else print -1 if it is undefined.

Note:- Remember division by 0 is an undefined value that will give runtime error in your program.
Example
Sample Input:-
9 3

Sample Output:-
3

Sample Input:-
8 5

Sample Output:-
1

Explanation:-
8/5 = 1.6 = 1(floor)
 **********************************************************************************************************************/

/*Solution */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
		int d =sc.nextInt();
        int q =sc.nextInt();
        if(q==0){
         System.out.println("-1");
        }else{
         System.out.println(d/q);
        }
    }
}