package JavaBasics;
// 23 June 2023 - Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers
import java.util.Scanner;

public class JavaBasics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evenSum = 0;
		int oddSum = 0;

		int choice;
		do {
			System.out.println("Enter the number");
			int number = sc.nextInt();

			if(number % 2 == 0){
				evenSum+=number;//evenSum = evenSum+number;
			}
			else{
				oddSum+=number;//evenSum = evenSum+number;
			}
			System.out.println("Press 1 For continue & Press 0 For exit");
			choice = sc.nextInt();

		} while (choice == 1);

		System.out.println("Even number sum is "+evenSum);
		System.out.println("Odd number sum is "+oddSum);

	}
}

// 24 June 2023 - factorial of number
// import java.util.Scanner;

// public class JavaBasics {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number to generate factorial of the number");
// 		int number  = sc.nextInt();

// 		for (int i = number; i>1 ; i--) {
// 			number = number * (i-1);
// 			System.out.println(number);
// 		}
// 		System.out.println("The factorial of given number is " +number);
// 	}
// 	}

//  24 June 2023 - Table of number (2 one's are twooooo)

// import java.util.Scanner;

// public class JavaBasics {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number for generating Table of it");
// 		int number = sc.nextInt();
// 		for (int i = 1; i <= 10; i++) {
// 			int table = number * i;
// 			System.out.println(number + "*" + i + "=" + table);

// 		}
// 	}
// }

// 20-August-2023 - Binary to decimal

// import java.util.*;
// public class JavaBasics {
// 	public static void decToBin(int decNum){
// 		int myNum = decNum;
// 		int pow = 0;
// 		int binNum = 0;
// 		while (decNum>0) {
// 			int rem = decNum%2;
// 			binNum = binNum + rem * ((int)Math.pow(10, pow));
// 			pow++;
// 			decNum = decNum / 2;

// 		}
// 		System.out.println("Binary Number of "+myNum+" is "+binNum);

// 	}

// 	public static void binToDec(int n){
// 		int ParamBinNum  = n;
// 		int binNum = n;
// 		int pow = 0;
// 		int decNum = 0;
// 		while (binNum > 0) {
// 			int lastDigit = binNum % 10;
// 			decNum = decNum + (lastDigit*((int)Math.pow(2, pow)));
// 			pow++;
// 			binNum=binNum/10;
// 		}
// 		System.out.println("Decimal Number of "+ParamBinNum+" is "+decNum);

// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		decToBin(20);

// 	}

// }
// 01 September 2023
// 1. Write a Java method to compute the average of three numbers.

// import java.util.*;

// public class JavaBasics{
// 	public static float AvgNum(float a, float b, float c) {
// 	return ((a+b+c)/3);
// }
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter 3 numbers to perform Average of the numbers");
// 		System.out.println("Enter First Number");
// 		float ap_a = sc.nextFloat();
// 		System.out.println("Enter Second Number");
// 		float ap_b = sc.nextFloat();
// 		System.out.println("Enter Third Number");
// 		float ap_c = sc.nextFloat();

// 		float varAvgNum= AvgNum(ap_a,ap_b,ap_c);
// 		System.out.println(varAvgNum);
// 	}
// }

// 03 September 2023
// Question 2: Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also, write a program to test your method.

// import java.util.*;

// public class JavaBasics{
// 	public static boolean isEven(int n){
// 		if (n%2==0) {
// 			return true;
// 		}
// 		else{
// 			return false;
// 		}
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number : ");
// 		int number = sc.nextInt();
// 		// System.out.println("The number is even & this statement is "+isEven(number));
// 		// isEven(number);
// 		boolean isEvenResult = isEven(number);
// 		if (isEvenResult) {
// 			System.out.println(number + " is even!");
// 		} else {
// 			System.out.println(number + " is odd!");
// 		}

// 	}
// }

// Question 3: Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)

// import java.util.*;
// public class JavaBasics{
// 	public static boolean isPalindrome(int n){
// 		int unmodified_n = n;
// 		int reminder = 0;
// 		int reversedNum = 0;
// 		while(n>0){
// 			reminder = n%10;
// 			// System.out.println("reminder "+reminder);
// 			reversedNum = reversedNum*10+reminder;
// 			// System.out.println("reversedNum "+reversedNum);
// 			n=n/10;
// 			// System.out.println("n is "+n);
// 		}
// 		if (unmodified_n!=reversedNum) {
// 			// System.out.println("in if");
// 			// System.out.println(n);
// 			// System.out.println(reversedNum);
// 			return false;
// 		} else {
// 			return true;
// 		}
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number to check its palindrome or not");
// 		int num = sc.nextInt();
// 		boolean isPalindromeResult = isPalindrome(num);
// 		if (isPalindromeResult) {
// 			System.out.println("the number "+num+ " is a palindrome");
// 		} else {
// 			System.out.println("the number "+num+ " is NOT a palindrome");
// 		}

// 	}
// }

// 04-Sept-2023
// Question 4: READ & CODE EXERCISE

// Search about (Google) & use the following methods of the Math class in Java:

// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

// Free reading resource (https://www.javatpoint.com/java-math)

// Please feel free to look for more resources/websites on your own.

// a. Math.min( )
// import java.util.*;
// public class JavaBasics{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the two number to see which is smaller :");
// 		int num_1 = sc.nextInt();
// 		int num_2 = sc.nextInt();
// 		int minResult = Math.min(num_1, num_2);
// 		System.out.println("The Smallest number among given numbers is "+minResult);

// 	}
// }

// b. Math.max( )
// import java.util.*;
// public class JavaBasics{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the two numbers to see which number is greater :");
// 		int num_1 = sc.nextInt();
// 		int num_2 = sc.nextInt();
// 		int maxResult = Math.max(num_1, num_2);
// 		System.out.println("The greatest number among given numbers is "+maxResult);

// 	}
// }

// c. Math.sqrt( )

// import java.util.*;
// public class JavaBasics{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number to get square root :");
// 		int num_1 = sc.nextInt();
// 		double sqrtResult = Math.sqrt(num_1);
// 		System.out.println("The Square root of the given number is "+sqrtResult);

// 	}
// }

// d. Math.pow( )

// import java.util.*;
// public class JavaBasics{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the two numbers to see which number is greater :");
// 		int num_1 = sc.nextInt();
// 		int num_2 = sc.nextInt();
// 		int maxResult = Math.max(num_1, num_2);
// 		System.out.println("The greatest number among given numbers is "+maxResult);

// 	}
// }

// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

// import java.util.*;
// public class JavaBasics{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the two numbers to perform operations :");
// 		double num_1 = sc.nextDouble();
// 		double num_2 = sc.nextDouble();
// 		System.out.println("The Smaller number among given numbers is "+Math.min(num_1, num_2));
// 		System.out.println("The greater number among given numbers is "+Math.max(num_1, num_2));
// 		System.out.println("The Square root of the first number is "+Math.sqrt(num_1));
// 		System.out.println("The Square root of the second number is "+Math.sqrt(num_2));
// 		System.out.println("The  answer of " + num_1 + " raised to " + num_2 + " is "+Math.pow(num_1, num_2));
// 		System.out.println("The  Average of " + num_1 + " & " + num_2 + " is "+((num_1 + num_2)/2));
// 		System.out.println("The  absolute value of " + num_1 + " & " + num_2 + " is " + Math.abs(num_1) + " & " +Math.abs(num_2));

// 	}
// }

// Question 5 :Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this question in the following way:a.Take a variable sum = 0b.Find the last digit of the numberc.Add it to the sumd.Repeat a & b until the number becomes 0 )

// import java.util.*;

// public class JavaBasics {
// 	public static int digitSum(int n) {
// 		int sumOfNum = 0;
// 		while (n > 0) {
// 			int reminder = n % 10;
// 			sumOfNum = sumOfNum + reminder;
// 			n = n/10;
// 		}
// 		return sumOfNum;
		
// 	}

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number to compute sum of the digits");
// 		int num = sc.nextInt();
// 		System.out.println("The digit sum of the "+num+" is "+digitSum(num));
		
// 	}
// }
