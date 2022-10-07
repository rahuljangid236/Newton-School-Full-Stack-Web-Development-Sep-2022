/* Author = Rahul Jangid */
/* GitHub Id = rahuljangid236 */
/* Language = JAVA */
/* Address = Udaipur,Rajasthan,INDIA (313001)*************************************************************************/

/********************************************************************************************************************* 
Leap Year
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.
Input
User Task:
Complete the function LeapYear() that takes integer n as a parameter.

Constraint:
1 <= n <= 5000
Output
If it is a leap year then print YES and if it is not a leap year, then print NO
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO
 **********************************************************************************************************************/

/*Solution */
import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {
       //Capture the user's input
       Scanner scanner = new Scanner(System.in);
       //Storing the captured value in a variable
       int n = scanner.nextInt();
       LeapYear(n);

    
}
static void LeapYear(int n){
    //Write code here
     int p=0;
    if(n%400==0){
        p=1;
    }else if(n%100==0){
        p=0;
    }else if(n%4==0){
        p=1;
    }else{
        p=0;
    }

    if(p==1){
        System.out.print("YES");
    }else{
        System.out.print("NO");
    }
}
    
}