package com.practice.data_structure_and_algorithm.Collections_Framework.HashMap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class Practice {
    public static void main(String[] args) {

        int[]nums = {1,2,3,1};

        boolean result = containsUniqueValues(nums);
        //System.out.println(result);

        int[] numbers = {2,7,11,15};
        Map<Integer, Integer> integerMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            integerMap.get(numbers[i]);
        }
        Integer value = 0;
        System.out.println(integerMap);
        System.out.println(value);
        String rs = "pwwkew";
        //int str = lengthOfLongestSubstring(rs);
        int str = lengthOfLongestSubstring2(rs);
        System.out.println(str);


    }

    /*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
    public static boolean containsUniqueValues(int[] array){

        Map<Integer, Integer> entry = new HashMap<>();
        int count = 1;
        for(int n : array){
            if(entry.containsValue(n)){
                return true;
            }else {
                entry.put(count, n);
                count++;
            }
        }

        return false;
    }

    /*
    Given a string s, find the length of the longest
              substring without repeating characters.
       Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

     Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//
//        while (i < n && j < n) {  //This loop runs as long as both pointers are within the bounds of the string.
//            // Try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))) { //f the character at the current position j is not already in the set
//                set.add(s.charAt(j)); // the character is added to the set, and j is incremented by 1.
//                j++;
//                if (j - i > ans) { //It checks if the current window size (j - i) is greater than ans.
//                    ans = j - i; //If so, it updates ans to the current window size.
//                }
//            } else {  //If the character is already in the set, the character at the i position is removed from the set, and i is incremented by 1. This step shrinks the window from the left.
//                set.remove(s.charAt(i));
//                i++;
//            }
//        }
//        return ans; // After the loop, the method returns the length of the longest substring without repeating characters.
//    }

    public static int lengthOfLongestSubstring2(String s){
        Set<Character> chars = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        int n = s.length();
        while(i<n && j<n){
            if(!chars.contains(s.charAt(j))){
                chars.add(s.charAt(j));
                j++;
                if(j-i>ans)
                    ans = j-i;
            }else {
                chars.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }

    /*
    Given a string, s, we define a substring, s', of s to be a string that occurs in s (i.e., a string matching some contiguous block of characters in s).
Complete the count_binary_substrings function. It has one parameter: a string, s, consisting of only 0s and 1s.
 The function must return an integer denoting the total number of substrings of s satisfying both of the following two conditions:
The 0s and 1s are grouped consecutively (e.g., 01, 10,0011, 1100, 000111, etc.).
The number of 0s in the substring is equal to the number of 1s in the substring
     */

}
