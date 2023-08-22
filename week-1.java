class Swap{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+"\nb:"+b);
	}
}



class IsPrime{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int i=2;
		if (num==1)
		{
			System.out.println("neither prime nor composite");
		}
		else if (num==2)
		{
			System.out.println("prime");
		}
		else
		{
			for(;i<num;i++)
			{
				if (num%i==0)
				{
					System.out.println("not a prime");
					break;
				}
			}
			if (i==num)
			{
					System.out.println("prime");
					
			}
		}
		
	}
}


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 5, 9, 11); // Replace with your list of integers
        
        boolean allOdd = true;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                allOdd = false;
                break;
            }
        }
        
        if (allOdd) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // Replace with the number for which you want to find the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

public class SecondLargestExample {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15}; // Replace with your array of integers
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest number is: " + secondLargest);
    }

    static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an n-digit number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        scanner.close();
    }

    static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        scanner.close();
    }

    static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
}

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }

    static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (hasVowels(sentence)) {
            System.out.println("The sentence contains vowels.");
        } else {
            System.out.println("The sentence does not contain vowels.");
        }

        scanner.close();
    }

    static boolean hasVowels(String str) {
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }

        return false;
    }
}

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseWords(input);
        System.out.println("Reversed: " + reversed);

        scanner.close();
    }

    static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}

import java.util.Scanner;

public class GCDCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("Greatest Common Divisor (GCD): " + gcd);

        scanner.close();
    }

    static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6}; // Replace with your array of integers

        // Sort the array in ascending order
        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }
        
        char original = board[row][col];
        board[row][col] = '#'; // Mark the cell as visited
        
        boolean found = dfs(board, row + 1, col, word, index + 1) ||
                        dfs(board, row - 1, col, word, index + 1) ||
                        dfs(board, row, col + 1, word, index + 1) ||
                        dfs(board, row, col - 1, word, index + 1);
        
        board[row][col] = original; // Restore the cell
        
        return found;
    }
}




