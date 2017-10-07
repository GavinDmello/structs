import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
        Problem link :
        https://www.hackerrank.com/challenges/breaking-best-and-worst-records
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int low_score = 0;
        int high_score = 0;
        int low_score_count = 0;
        int high_score_count = 0;
        
        for(int s_i = 0; s_i < n; s_i++){

            s[s_i] = in.nextInt();
            
            if (s_i == 0) {
                low_score = s[s_i];
                high_score = s[s_i];
            } else {
                if (s[s_i] > high_score) {
                    high_score = s[s_i];
                    high_score_count++;
                } else if (s[s_i] < low_score) {
                    low_score = s[s_i];
                    low_score_count++;
                }
            } 
        }
        System.out.println(String.valueOf(high_score_count) + " " + String.valueOf(low_score_count));
    }
}
