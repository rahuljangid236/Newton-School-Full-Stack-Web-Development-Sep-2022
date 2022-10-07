/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Max Integer
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given three integers your task is to calculate the maximum integer among the given integers.
Input
The input contains three integers a, b, and c

Constraint:
1<=integers<=10000
Output
Print the maximum integer among the given integers.
Example
Sample Input:-
2 6 3

Sample Output:-
6

Sample Input:-
48 100 100

Sample Output:
100
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
                      int a = sc.nextInt();
                      int b = sc.nextInt();
                      int c = sc.nextInt();  
            if(a>b && a>c){
                System.out.println(a);
            }else if(b>a && b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }

    }
}