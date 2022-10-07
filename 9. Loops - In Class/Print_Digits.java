/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Print Digits
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a natural number N, your task is to print all the digits of the number in words. The words have to separated by space and in lowercase english letters.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.

Constraints:-
1 <= N <= 10000000
Output
Print the digits of the number as shown in the example.

Note:- Print all digits in lowercase English letters
Example
Sample Input:-
1024

Sample Output:-
one zero two four

Sample Input:-
2

Sample Output:-
two
 **********************************************************************************************************************/

/*Solution */
static void Print_Digits(int N){
    //Enter your code here
    String word[] = {"zero", "one", "two", "three","four",
                    "five", "six", "seven", "eight", "nine"};
                    int digits[] = new int[10]; 
     
        int dc = 0; 
     
        do
        {
            digits[dc] = N % 10;
            N = N/10;
            dc++;
        } while (N != 0);
     
        for (int i = dc - 1; i >= 0; i--)
            System.out.print(word[digits[i]] + " ");
    
    }