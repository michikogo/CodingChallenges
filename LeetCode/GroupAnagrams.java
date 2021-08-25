import java.util.*;
import java.lang.*;
import java.io.*;

/*
    Given an array of strings strs, group the anagrams together. You can return the answer in any 
    order.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
*/

class Main {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =new ArrayList<>();
        HashMap<String, List<String>> lookUp = new HashMap<>();
        
        for(int i = 0; i<strs.length; i++) {
            // sort each element in the array
            String[] temp = strs[i].split("");
            Arrays.sort(temp);
            String tempJoin=String.join("", temp);
            // System.out.println(tempJoin + " || " + strs[i]);
            
            // find the key using the sorted element
            if(!lookUp.containsKey(tempJoin)){
                // crete new section of lookup table that has arrayList as values
                lookUp.put(tempJoin, new ArrayList<String>());
              } 
            // add them to the section
            lookUp.get(tempJoin).add(strs[i]);
        }
        // pass the data from lookup table to result
        for(List<String> list: lookUp.values()) {
            result.add(list);
        }
        // System.out.println(lookUp);
        return result;
    }
    
    public static void main(String[] args) {
        
        // EXAMPLE 1
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]] (in any order)
        
        // EXAMPLE 2
        String[] strs = {""};
        // Output: [[""]]
        
        // EXAMPLE 3
        String[] strs = {"a"};
        //Output: [["a"]
        
        System.out.println(groupAnagrams(strs));
    }
}