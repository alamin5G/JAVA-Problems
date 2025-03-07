import java.util.ArrayList;
import java.util.Arrays;

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
        /* int[] array = {1, 3, 4, 5, 7, 9, 11, 12, 2};
        System.out.println(findDuplicates(array));*/

        //12. done
        //countVowelsAndCons("My Name is Alamin");

        //13. done
        //multiplicationTable(3);

        //14. done
       /* int[][] m1 = {{1, 2},{3,4}, {5, 6}};
        int[][] m2 = {{7, 8}, {9, 10}, {11, 12}};
        int[][] mResult = addMatrices(m1, m2);
        for (int i = 0; i < mResult.length; i++) {
            for (int j = 0; j < mResult[0].length; j++) {
                System.out.print(mResult[i][j] + " ");
            }
            System.out.println();
        }*/

        //15. done
       /* int[] a = {1, 2, 3, 4, 5};
        System.out.println(calculateAvg(a));*/

        //16. leap year
        //System.out.println(isLeapYear(100));

        //17. pyramid
        //printPyramid(10);

        //18. reverse
        //System.out.println(reverseAString("Apple"));

        //19. armstrong number
        //System.out.println(isArmstrong(151));

        //20.
        int[] ar = { 1, 5, 23, 345, 32, 10,341, 293};
        findMinMax(ar);
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
//12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
    public static void countVowelsAndCons(String s){
        String caseSens = s.replaceAll("\\s", "");
        caseSens = caseSens.toLowerCase();
        int countVowels = 0;
        int countCons = 0;
        for (int i = 0; i < caseSens.length(); i++) {
            if (caseSens.charAt(i) == 'a' || caseSens.charAt(i) == 'e' || caseSens.charAt(i) == 'i' || caseSens.charAt(i) == 'o' || caseSens.charAt(i) == 'u'){
                countVowels++;
            }else {
                countCons++;
            }
        }

        System.out.println("Total Vowels: " + countVowels);
        System.out.println("Total Cons: " + countCons);
    }
// 13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
    public static void multiplicationTable(int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + i*number);
        }
    }
//14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2){
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

//15. Calculate Average: Calculate the average of elements in an array.
    public static double calculateAvg(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum /2;
    }
//16. Leap Year Check: Determine whether a given year is a leap year.
    public static boolean isLeapYear(int year){
        if (year%4 == 0 && year % 100 != 0 ){
            return true;
        }else if (year%400 == 0){
            return true;
        }else {
            return false;
        }
    }
//17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)
    public static void printPyramid(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=rows-i; j++) {
                System.out.printf(" ");
            }

            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//18. String Reversal: Reverse a given string without using built-in functions. apple, elppa
    public static String reverseAString(String string){
        String reverse = "";
        for (int i = string.length()-1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        return reverse;
    }
//19. Armstrong Number: Check if a number is an Armstrong number.
public static boolean isArmstrong(int number) {
    int originalNumber, remainder, result = 0, n = 0;
    originalNumber = number;

    // Count number of digits
    while (originalNumber != 0) {
        originalNumber /= 10;
        ++n;
    }

    originalNumber = number;

    // Calculate result
    while (originalNumber != 0) {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, n);
        originalNumber /= 10;
    }

    return result == number;
}
//20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
public static void findMinMax(int[] array){
    Arrays.sort(array);
    System.out.println("Lowest element : " + array[0]);
    System.out.println("Highest element : " + array[array.length-1]);
}

//Class ki?
//todo - A class in Java is a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) of objects.
// Objects are instances of classes.

// Object ki?
    //todo - An object is nothing but an instance of a Class. In Java, an object is a fundamental unit of data that represents a real-world entity or concept.
    // It is an instance of a class, which serves as a blueprint for creating objects.
    // Objects encapsulate both data (attributes or fields) and behavior (methods or functions) related to the entity they represent.

//Instance ki?
    //todo - An instance, in the context of object-oriented programming, refers to a specific realization or occurrence of a class.
    // When you create an object from a class, you are creating an instance of that class.
    // Each instance of a class has its own set of data (state) and can execute the methods defined in the class.

//Constructor ki?
    //todo - Constructors in Java are special methods used to initialize objects of a class.
    // They have the same name as the class and are called automatically when an object is created.

//How to declare method in a class?
    //accessSpecifier returnType methodName(parameterList) {
    //    // Method body
    //}
    //todo - Let's break down each part:
    // accessSpecifier: Specifies the visibility of the method. It can be public, private, protected, or package-private (no specifier).
    // returnType: Specifies the data type of the value returned by the method. If the method does not return anything, use void.
    // methodName: The name of the method. This is used to call the method later in your code.
    // parameterList: A list of parameters (if any) that the method accepts. Each parameter consists of a data type followed by the parameter name.
    // If the method doesn't take any parameters, you can leave the parentheses empty.
    // Method body: Contains the code that defines what the method does. This is enclosed within curly braces {}.

//How to create an object?
    //todo - Define a class: You start by defining a class using the class keyword. This class will serve as a blueprint for creating objects.
    // Instantiate the class: Next, you use the new keyword followed by the class name and parentheses to create an instance of the class.

//How to assign value in object through constructor?
    //todo - Define instance variables: Declare instance variables within your class to represent the properties of the object.
    // Define a constructor: Create a constructor method in your class. This constructor should accept parameters that correspond to the properties you want to initialize.
    // Initialize instance variables: Inside the constructor, assign the parameter values to the instance variables.

// How to call a method from an object?
    //todo - objectName.methodName(arguments);
    // objectName is the name of the object you want to call the method on.
    // methodName is the name of the method you want to call.
    // arguments are any parameters required by the method (if applicable).

//What is recursion?
    //todo - Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem.

//What is base case?
    // todo - an end point to prevent the further recursion.
//What is recursive case?
    //todo - an recursive case is nothing but the invoke the recursive method
// What is stack memory?
    //todo - Stack memory is a region of a computer's memory system used for storing variables that are created inside functions or methods.
    // In Java, each thread has its own stack memory, which is used for method invocations and local variables.
//What is heap memory?
    //todo - Heap memory allows for dynamic allocation and de-allocation of memory during runtime. Each object created with new keyword is stored in heap memory.

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
