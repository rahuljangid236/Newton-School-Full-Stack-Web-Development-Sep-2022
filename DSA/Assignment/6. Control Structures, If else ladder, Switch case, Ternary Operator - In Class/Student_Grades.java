/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Student Grades
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given marks of a student in 5 subjects(any). You need to find the grade he/she would get on the basis of percentage obtained. Grades computed are as follows:

If the percentage of marks is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else prints Grade ‘D’
Input
The input contains 5 integers separated by spaces.

Constraints:
1 <= marks <= 100
Output
You need to print the grade obtained by him/her.
Example
Sample Input:
75 70 80 90 100

Sample Output:
A
 **********************************************************************************************************************/

/*Solution */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int e = sc.nextInt();
     int total_marks = a+b+c+d+e;
     int percentage =  total_marks/5;

     if (percentage >= 80){
         System.out.println("A");
     }
     else if(percentage < 80 && percentage >= 60){
         System.out.println("B");
     }
     else if(percentage < 60 && percentage >= 40){
         System.out.println("C");
     }
     else{
         System.out.println("D");
     }
    }
}