import java.util.ArrayList;

public class JavaProblemSolution {
    public static void main(String[] args) {

        //1. done
       /* int[] a = {1, 2, 3, 4};
        System.out.println(sumOfArray(a));*/

        //2. done
       /*    int[] a = {1, 2, 3, 4, 120, 5, 110, 91};
        System.out.println(largestElementInArray(a));*/

        //2. done
        int[] a = {1, 2, 3, 4, 120, 5, 110, 91, 93};
        int[] result = countEvenOrOdd(a);
        System.out.println("Total even = " + result[0]);
        System.out.println("Total odd = " + result[1]);



    }


    //1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //2. Largest Element in Array: Find and print the largest element in an array.
    public static int largestElementInArray(int[] array) {
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    //3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
    public static int[] countEvenOrOdd(int[] array) {
        int[] count = new int[2];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count[0] = ++even;
            } else {
                count[1] = ++odd;
            }
        }
        return count;
    }
//4. Reverse an Array: Reverse the elements of an array.
//5. Factorial Calculation: Write a program to calculate the factorial of a given number.*****: + recursive solution.
//6. Palindrome Check: Check if a given string is a palindrome. (use char string)
//7. Prime Number Check: Determine whether a given number is prime.
//8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.*****:
//+ recursive solution.
//9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type) 10. Binary Search: Implement binary search for a sorted array.
//11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
//12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u) 13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
//14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
//15. Calculate Average: Calculate the average of elements in an array.
//16. Leap Year Check: Determine whether a given year is a leap year.
//17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)
//18. String Reversal: Reverse a given string without using built-in functions. apple, elppa
//19. Armstrong Number: Check if a number is an Armstrong number.
//20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.


//Class ki? //Object ki?
//Instance ki?
//Constructor ki?
//How to declare method in a class?
//How to create an object?
//How to assign value in object through constructor? //How to call a method from an object?


//What is recursion?
//What is base case?
//What is recursive case? //What is stack memory?
//What is heap memory?


//1. Create a class.
//2. Create an object.
//3. Assign value in object through constructor.
//4. Call method from object.
//5. Create a list of object. (ArrayList)
//6. Print data from the list of object.
//7. Understand what is heap and stack memory.
//8. Understand what is reference and value.
//9. Understand what is primitive and non-primitive data type.
}
