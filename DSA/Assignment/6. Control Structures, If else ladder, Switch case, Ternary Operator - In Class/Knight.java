/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Knight
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y). Your task is to find the number of positions knight can jump into in a single move.

Note:- Rows and Columns are numbered through 1 to N.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Knight() that takes integers X and Y as arguments.

Constraints:-
1 <= X <= 8
1 <= Y <= 8
Output
Return the number of positions Knight can jump into in a single move.
Example
Sample input:-
4 5

Sample Output:-
8

Explanation:-
Positions:- (3, 3), (5, 3), (3, 7), (5, 7), (6, 6), (6, 4), (2, 6), (2, 4)

Sample input:-
1 1

Sample Output:-
2

Explanation:-
Positions:- (3, 2), (2, 3)
 **********************************************************************************************************************/

/*Solution */
static int Knight(int X, int Y){
    //Ener your code here
     int P[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int Q[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        int n = 9;
        int count = 0;
        for (int i = 1; i < 9; i++) {
            int x = X + P[i-1];
            int y = Y + Q[i-1];
            if (x >= 1 && y >= 1 && x < n && y < n)
                count++;
            }
        return count;
    }