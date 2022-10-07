/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Magic number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
Given a number N, your task is to find the closest Magic number from the given number N.

Note:- If more than one answer exists return the minimum one
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function MagicNumber() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return a magic number closest to the given number N.
Example
Sample Input:-
8

Sample Output:-
79

Sample Input:-
900

Sample Output:-
897
 **********************************************************************************************************************/

/*Solution */
static int MagicNumber(int N){
    //Enter your code here
     if(N>=79){
              int a=0;
              while(true){
                  int first=N-a;
                  int second=N+a;
                  if(isDigitPresent(first)){
                    return first;
                  }
                  if(isDigitPresent(second)){
                    return second;
                  }
                  a++;
                }
            }
            else{
                return 79;
            }
        }
        static boolean isDigitPresent(int x){
              while(x>0){
                if(x%10==7){
                  while(x>0){
                    if(x%10==9)
                       break;
                    x/=10;   
                  }
                  break;
                } 
                else      
                if(x%10==9){
                  while(x>0){
                    if(x%10==7)
                       break;
                    x/=10;   
                  }
                  break;
                }       
                x/=10;
              }
              return (x>0);
    }