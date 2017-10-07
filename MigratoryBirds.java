import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
        Problem link : https://www.hackerrank.com/challenges/migratory-birds
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        HashMap hm = new HashMap();
        
        int n = in.nextInt();
        int[] ar = new int[n];
        int max_id = 0;
        int max = 0;
        Integer value = 0;
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            String bird_id = String.valueOf(ar[ar_i]);
            
            if (hm.containsKey(bird_id)) {
                value = (Integer)hm.get(bird_id);
                hm.put(bird_id, ++value);
                
                if (value > max) {
                    max_id = Integer.parseInt(bird_id);
                    max = value;
                } else if (value == max) {
                    if (Integer.parseInt(bird_id) < max_id) {
                        max_id = Integer.parseInt(bird_id);
                    }
                }
                
            } else {
                hm.put(bird_id, new Integer(1));
            }
        }
        
        System.out.println(max_id);
    }
}
