import java.util.*;
import java.lang.*;
import java.io.*;

/*
    633. Sum of Square Numbers
    
    Given a non-negative integer c, decide whether there're two integers a and b 
    such that a2 + b2 = c.
*/

class Main {
    public static boolean judgeSquareSum(int c) {
        int i = 0;
        // square root so that it wont start from C
        int j = (int)Math.sqrt(c);
        
        // i cannot be bigger than j, will loop until it finds ans and c as equal
        while(i<=j){
            // solve for sum of two integers 
            int ans = i*i + j*j;
            // if ans is same as c
            if(ans==c)
                return true;
            // ans is bigger
            else if(ans>c)
                j--;
            // ans is smaller
            else i++;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // System.out.println(judgeSquareSum(5)); // true
        // System.out.println(judgeSquareSum(3)); // false
        // System.out.println(judgeSquareSum(10000000)); // true
        System.out.println(judgeSquareSum(2147482647)); // false
    }
}