/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Pattern
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, you have to print the given below pattern for N >= 3.

Pattern for N = 4:-
*
*^*
*^^*
*****
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integers N as argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern for size N.
Example
Sample input:-
3

Sample Output:-
*
*^*
****

Sample Input:-
6

Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
******
 **********************************************************************************************************************/

/*Solution */
static void Pattern(int N){
    //Enter your code here
    System.out.println("*");
    
      for(int i=1;i<=N-2;i++){
        System.out.print("*");
        for(int j=1;j<=i;j++){
          System.out.print("^");
        }
    
        System.out.println("*");
    
      }
    
      for(int i=1;i<=N+1;i++){
        System.out.print("*");
      }
    }