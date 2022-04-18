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

/* Data types
Problem Statement
Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
Input
The input contains the following values separated by lines:- integer, Long, float, double, char
Output
Print each element in a new line in the same order as input.
Example
Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s= new Scanner(System.in);
					  int i= s.nextInt();
					  long l = s.nextLong();
					  float f = s.nextFloat();
					  double d = s.nextDouble();
					  char c = s.next().charAt(0);

					  System.out.println(i);
					  System.out.println(l);
					  System.out.println(f);
					  System.out.println(d);
					  System.out.println(c);
	}
}
