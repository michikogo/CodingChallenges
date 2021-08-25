import java.util.*;
import java.lang.*;
import java.io.*;

/*
    A magic array is an array in which the sum of the prime numbers in the array is 
    equal to the first element of the array.
    
    If there are no prime numbers in the array, the array is a magic array
    
    Input: List of Integer          Output: true if magic array; false if not magic array
    
    Example: 
    1. {21,3,7,9,11,4,6} is magic array becuse 3,7,11 is 21 which is the first index's digit
    2. {13,4,4,4,4} is magic array since 13 is prime and is the first index
    3. {8,5,-5,5,3} not a magic array because 5+5+3 is not 8, -5 is not a prime number
*/

class Main {
    
    public static void magicNumbers(int[] input) {
        int sum = 0;
        for(int i = 0; i<input.length; i++) {
            if(input[i] > 0){
                if(input[i] == 3 || input[i] == 2){
                    sum += input[i];
                } else if(input[i]%2 == 0 || input[i]%3 == 0){
                    // System.out.println("IS PRIME: " + input[i]);
                } else {
                    sum += input[i];
                }
            }
        }       
        // System.out.println(sum);
        if(sum == input[0])
            System.out.println("true");
        else 
            System.out.println("false");
    }
    public static void main(String[] args) {
        // int[] input = {21,3,7,9,11,4,6}; // is magic number
        // int[] input = {13,4,4,4,4}; // is magic number
        int[] input = {8,5,-5,5,3}; // is not magic number
        magicNumbers(input);
    }
}