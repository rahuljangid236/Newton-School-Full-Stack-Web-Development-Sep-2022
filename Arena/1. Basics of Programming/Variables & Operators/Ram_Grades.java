/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Ram Grades
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Ram is studying in Class V and has four subjects, each subject carry 100 marks. He passed with flying colors in his exam, but when his neighbour asked how much percentage did he got in exam, he got stuck in calculation. Ram is a good student but he forgot how to calculate percentage. Help Ram to get him out of this problem.
Input
First line contains four variables a, b, c and d.

Constraints
1<= a, b, c, d <= 100
Output
Print single line containing the percentage.
Example
Sample Input 1:
25 25 25 25

Sample Output 1:
25

Sample Input 2:
75 25 75 25

Sample Output 2:
50
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
                      int d = sc.nextInt();
                      int total = a + b + c + d;
                      int percentage = (total*100/400);
                      System.out.println(percentage);
    }
}