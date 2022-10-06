/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Queen's attack
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In an 8X8 chessboard. Given the position of the Enemy Queen(X, Y) and the King(P, Q) your task is to check whether the king is in an attacking position by the queen i.e. you have to check if the king is in the check position by the queen or not.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function QueenAttack() that takes integers X, Y, P, and Q as arguments.

Constraints:-
1 <= X, Y, P, Q <= 8

Note:- King and Queen can not be in the same position
Output
Return 1 if the king is in the check position else return 0.
Example
Sample Input:-
1 1 5 5

Sample Output:-
1

Sample Input:-
3 4 6 6

Sample Output:-
0
 **********************************************************************************************************************/

/*Solution */
static int QueenAttack(int X, int Y, int P, int Q){
    //Enter your code here
    if (X == P)
            return 1;
     
       
        if (Y == Q)
            return 1;
     
       
        if (Math.abs(X - P) == Math.abs(Y - Q))
            return 1;
     
        
        return 0;
    }