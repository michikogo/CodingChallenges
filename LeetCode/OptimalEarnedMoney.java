import java.util.*;
import java.io.*;
import java.math.*;

class Main {
   
    public static void maxProfit(int N, int[] ti, int[] di) {
       
        ArrayList<Integer> tNew = new ArrayList<>();
        // loop through amount of time
        for(int i = 0; i<ti.length; i++) {
            int temp = ti[i];
            int sum = 0;
            // loop to get smallest from temp
            for(int j = 0; j<ti.length; j++) {
                if(temp > ti[j]){
                    // add smallest
                    sum += ti[j];
                }
            }
            // get smallest numbers and add temp to get new value
            // System.out.println(sum+temp);
            tNew.add(sum + temp);
        }

        int profit = 0;
        // loop the deadline of each task
        for (int i = 0; i < di.length; i++) {
            // get difference of newtime and deadline
            int difference = di[i] - tNew.get(i);
            // get total profit
            profit += difference;
        }
        System.out.println(profit);
    }

    public static void main(String args[]) {
        int N = 3;
        int[] ti = {4,2,3};
        int[] di = {5,7,9};
        maxProfit(N, ti, di);
    }
}