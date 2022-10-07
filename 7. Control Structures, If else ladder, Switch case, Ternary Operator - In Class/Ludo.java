/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Ludo
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a rule in ludo that a token can only be unlocked when either a 1 or 6 shown in the die. Given the die number N, Your task is to check whether the token can be unlocked or not.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function ludo() that takes integers N as argument.

Constraints:-
1 <= N <= 6
Output
Return 1 if the token can be unlocked else return 0.
Example
Sample Input:-
1

Sample Output:-
1

Sample Input:-
2

Sample Output:-
0
 **********************************************************************************************************************/

/*Solution */
static int ludo(int n){
    //Enter your code here
    
    if(n == 1 || n==6){
        return 1;
    }else{
        return 0;
    }
    }