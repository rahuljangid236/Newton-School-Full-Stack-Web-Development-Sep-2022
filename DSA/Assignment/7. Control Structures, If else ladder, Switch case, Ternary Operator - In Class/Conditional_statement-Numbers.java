/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Conditional statement - Numbers
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer n , your task is to print the lowercase English word corresponding to the number if it is <=5 else print "Greater than 5".

1 = one
2 = two
3 = three
4 = four
5 = five
Input
The input contains a single integer N.

Constraint:
1 <= n <= 100
Output
Print a string consisting of the lowercase English word corresponding to the number if it is <=5 else print the string "Greater than 5"
Example
Sample Input:
4

Sample Output
four

Sample Input:
6

Sample Output:
Greater than 5
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
        int n = sc.nextInt();
        if(n==1){
            System.out.println("one");
        }else if(n==2){
            System.out.println("two");
        }else if(n==3){
            System.out.println("three");
        }else if(n==4){
            System.out.println("four");
        }else if(n==5){
            System.out.println("five");
        }else{
            System.out.println("Greater than 5");
        }
    }
}
