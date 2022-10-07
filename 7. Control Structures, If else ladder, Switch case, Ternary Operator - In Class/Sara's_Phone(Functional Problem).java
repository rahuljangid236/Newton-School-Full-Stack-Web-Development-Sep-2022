/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Sara's Phone (Functional Problem)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara's Phone has N apps and each app takes K unit of memory. Now Sara wants to release M units of memory. Your task is to tell the minimum apps Sara needs to delete or say it is not possible.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Phone() that takes integers N, K, and M as arguments.

Constraints:-
1 <= N <= 1000
1 <= K <= 100
0 <= M <= 10000
Output
Return minimum apps to delete and if it is not possible return -1.
Example
Sample Input:-
10 3 10

Sample Output:-
4

Sample Input:-
10 3 40

Sample Output:-
-1
 **********************************************************************************************************************/

/*Solution */
static int Phone(int n, int k, int m){
    //Enter your code here
    
    if(n*k>m){
        if(m%k==0){
            return m/k;
        }
        return ((m/k)+1);
    
        }
        return -1;
    }