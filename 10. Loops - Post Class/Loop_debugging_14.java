/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Loop debugging 14
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, your task is to print all the even integer from 1 to N.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions For_Loop() that takes the integer n as a parameter.

Constraints:
1 <= n <= 100

Note:
But there is a catch here given user function has already code in it which may or may not be correct, now you need to figure out these and correct if it is required
Output
Print all the even numbers from 1 to n. (print all the numbers in the same line, space-separated)
Example
Sample Input:-
5

Sample Output:-
2 4

Sample Input:-
6

Sample Output:-
2 4 6
 **********************************************************************************************************************/

/*Solution */
public static void For_Loop(int n){
    for(int i=1;i<=n;i++){
       if(i%2==0){
           System.out.print(i+" ");
       }
   }
}
