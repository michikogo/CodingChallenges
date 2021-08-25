import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
   
    public static void sumEvenNumbers(int input) {
        int sum = 0;
        for(int i = 2; i<=input; i++) {
            if(i%2==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
   
    public static void atbashCipher(String input){
        char backwardChar = 'z';
        HashMap<String, String> lookupTable = new HashMap<>();
        for(char c = 'a'; c<='z'; c++) {
            lookupTable.put(String.valueOf(c), String.valueOf(backwardChar));
            backwardChar--;
        }
        // System.out.println(lookupTable);
       
        String[] inputArray = input.toLowerCase().split("");
        ArrayList<String> resultArray = new ArrayList<>();
       
        for(int i = 0; i<inputArray.length; i++) {
            String temp = lookupTable.get(inputArray[i]);
            resultArray.add(temp);
           
        }
        for(int i=0; i<resultArray.size(); i++) {
            System.out.print(resultArray.get(i));
        }
    }
   
    public static void checkStright(int[] input) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        
        for(int i = 0; i<input.length; i++) {
            resultArray.add(input[i]);
        }
        
        if((resultArray.contains(1) && resultArray.contains(2) && resultArray.contains(3) && resultArray.contains(4)) ||
            (resultArray.contains(2) && resultArray.contains(3) && resultArray.contains(4) && resultArray.contains(5)) || 
            (resultArray.contains(3) && resultArray.contains(4) && resultArray.contains(5) && resultArray.contains(6))){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
   
    public static void notPainted() {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int N = scan.nextInt();
        int temp=0;
        ArrayList<Integer> inputArray = new ArrayList<>();
        while(scan.hasNext()) {
            temp = scan.nextInt();
            // System.out.println(temp);
            inputArray.add(temp);
        }
       
        Collections.sort(inputArray);
        // System.out.println(temp);
       
        int counter = 0;
        int i = 0;
        while(i<inputArray.size()) {
            int start = inputArray.get(i);
            int end = inputArray.get(i+1);
            System.out.println(start + " || " + end);
            for(int j = start; j<end; j++) {
                counter++;
            }
            i+=2;
        }
        System.out.println("counter: " + counter);
       
    }
   
    public static void main(String[] args) {
        // sumEvenNumbers(10);
        
        // atbashCipher("abcxyz");
        
        // int[] input = {1,2,3,4};
        int[] input = {1,1,1,2};
        checkStright(input);
        
        // notPainted();
       
    }
}