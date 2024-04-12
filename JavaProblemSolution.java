import java.util.ArrayList;

public class JavaProblemSolution {
    public static void main(String[] args) {

        //1. done
       /* int[] a = {1, 2, 3, 4};
        System.out.println(sumOfArray(a));*/

        //2. done
       /*    int[] a = {1, 2, 3, 4, 120, 5, 110, 91};
        System.out.println(largestElementInArray(a));*/

        //3. done
        /*int[] a = {1, 2, 3, 4, 120, 5, 110, 91, 93};
        int[] result = countEvenOrOdd(a);
        System.out.println("Total even = " + result[0]);
        System.out.println("Total odd = " + result[1]);*/

        //4. done
       /* int[] a = {1, 2, 3, 4};
        int[] reversedArray = reverseAnArray(a);
        for (int j : reversedArray) {
            System.out.print(j + " ");
        }*/

        //5. done
       // System.out.println(factorial(0));

        // 6. done
        //System.out.println(checkPalindrome("redivider"));

        // 7. done
        //System.out.println(determinePrimeNumber(23));

        //8. done
        //fibonacciSeries(10);

        //9. done
        /*int[] array = {5, 2, 3, 8, 11, 9 , 90, 5, 10};
        System.out.println(linearSearch(array, 12));*/

        //10. done
       /* int[] sortedArray = {1, 3, 4, 5, 7, 9, 11, 12};
        System.out.println(binarySearch(sortedArray, 13));*/

        //11. done
         int[] array = {1, 3, 4, 5, 7, 9, 11, 12, 2};
        System.out.println(findDuplicates(array));



    }


    //1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
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
        for (int j : array) {
            if (j % 2 == 0) {
                count[0] = ++even;
            } else {
                count[1] = ++odd;
            }
        }
        return count;
    }

    //4. Reverse an Array: Reverse the elements of an array.
    public static int[] reverseAnArray(int[] array) {
        int[] reverse = new int[array.length];
        int c = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[c] = array[i];
            c++;
        }

        return reverse;
    }

    //5. Factorial Calculation: Write a program to calculate the factorial of a given number.*****: + recursive solution.
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    //6. Palindrome Check: Check if a given string is a palindrome. (use char string)
    public static boolean checkPalindrome(String string) {
        int j = string.length()-1;
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i) != string.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
//7. Prime Number Check: Determine whether a given number is prime.
    public static boolean determinePrimeNumber(int number){

        if (number==2){
            return true;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number%i==0){
                return false;
            }
        }

        return true;
    }

//8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.*****:
//+ recursive solution.
    public static void fibonacciSeries(int n){
        int first = 0;
        int second = 1;
        int last = first + second;
        System.out.print(first + " " + second);
        if (n>1){
            for (int i = 2; i <= n; i++) {
                first = second;
                second = last;
                System.out.print(" " + last);
                last = first + second;
            }
        }
    }


//9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)
    public static boolean linearSearch(int[] array, int target){
        for (int j : array) {
            if (j == target) {
                return true;
            }
        }

        return false;
    }

// 10. Binary Search: Implement binary search for a sorted array.

    public static boolean binarySearch(int[] sortedArray, int target){
        int left = 0;
        int right = sortedArray.length;
        int mid = (left+right)/2;
        int len = sortedArray.length;

        while (mid != 0 && mid != len){
            if (sortedArray[mid] == target){
                return true;
            } else if (target < sortedArray[mid]) {
                right = mid-1;
                mid = (left+right)/2;
            }else {
                left = mid+1;
                mid = (left+right)/2;
            }
        }
        return false;
    }
//11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
    public static boolean findDuplicates(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
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
