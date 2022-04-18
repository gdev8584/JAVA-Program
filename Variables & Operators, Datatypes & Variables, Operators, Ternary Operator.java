//Variable
/* Area of Square:
Problem Statement
Given a side of a square, your task is to calculate its area.
Input
The first line of the input contains the side of the square.

Constraints:
1 <= side <=100
Output
You just have to print the area of a square
Example
Sample Input:-
3

Sample Output:-
9

Sample Input:-
6

Sample Output:-
36
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
			Scanner s= new Scanner(System.in);
			int side = s.nextInt();
			if (side>=1){
				if (side<=100){
					System.out.println(side*side);
				}
               
			}

	}
}
