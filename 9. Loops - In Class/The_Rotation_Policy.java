/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
The Rotation Policy
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
English Team has now adopted a rotation policy for two of their players: Dom and Leach.
On the first day, both of them played but, from the second day onwards, Dom plays every second day, while Leach plays every third day.

For example, on:
Day 1 - Both the players play,
Day 2 - Neither of them play,
Day 3 - Only Dom plays,
Day 4 - Only Leach plays,
Day 5 - Only Dom plays,
Day 6 - Neither of them play,
Day 7 - Both the players play.. and so on.

Find the number of days in the interval [A, B] (A and B, both inclusive) when neither Dom nor Leach plays.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function RotationPolicy() that takes integers A, and B as arguments.

Constraints:-
1 <= A, B <=100000
Output
Return the number of days when neither of the two players played the game.
Example
Sample Input:-
3 8

Sample Output:-
2

Sample Input:-
1 4

Sample Output:-
1
 **********************************************************************************************************************/

/*Solution */
static int RotationPolicy(int A, int B){
    //Enter your code here
    int count = 0;
        for(int i=A; i<=B; i++){
            if((i-1) % 2 != 0 && (i-1) % 3 != 0){
                count++;
            }
        }
        return count;
    }