/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Rook
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an 8*8 empty chessboard in which a rook is placed at a position (X, Y). Your task is to find the minimum steps Rook will take to go to the position (1, 1).
Input
The input contains two integer X and Y.

Constraints:-
1 <= X <= 8
1 <= Y <= 8
Output
Print the number of steps rook will take to go to the position (X, Y).
Example
Sample Input:-
2 4

Sample Output:-
2

Explanation:-
one of the possible paths is:-
(2, 4) - > (2, 1) - > (1, 1)

Sample Input:-
1 2

Sample Output:-
1
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
        int x = sc.nextInt();
        int y = sc.nextInt();
        if( x == 1 && y == 1){
            System.out.print(0);
        }
        else if(x == 1 || y == 1){
            System.out.print(1);
        }else{
            System.out.print(2);
            
        }
    }
}