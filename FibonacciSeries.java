

import java.util.Scanner;

/*
* The Fibonacci sequence is a type series where each number is the sum of the two that precede it. 
* It starts from 0 and 1 usually. The Fibonacci sequence 
* is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on. The numbers in the
*  Fibonacci sequence are also called Fibonacci numbers.
*/

/*
* Create a Java class

Create a variable num1 of int and assign value 0. 

Create a variable num2  of int and assign value 1. 

Print num1 and num2 

Run for loop for number of elements

Create local variables num3 of type int 

Assign the sum of num1 and num2 to num3 

Print num3 

Assign num2 to num1 

Assign num3 to num2
*/

public class FibonacciSeries {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input the number of elements: ");
		
		int num = scan.nextInt();
		
		fibonacci(num);
		
		scan.close();
		
	}
		
		public static void fibonacci(int elements ) {
			
			
			//constraint - n is a positive number
			if(elements < 0) {
				System.out.println("please input a positive number");
			}
			
			else if(elements == 0){
				System.out.println("please input a positive number");
			}
			
			else {				// writing fibonacci series for the +ve number
				
				int firstEle = 0, secondEle = 1;
				
				System.out.print(firstEle+","+secondEle);
				
				for (int count=2; count < elements; count++) {
					 int thirdEle = firstEle + secondEle;
					 firstEle = secondEle;
					 secondEle = thirdEle;
					 System.out.print(","+secondEle);
				}			
			}
		}
}
