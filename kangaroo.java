import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    Problem : https://www.hackerrank.com/challenges/kangaroo/problem
    Logic :
    x1(t) = x1_start + v1t
    x2(t) = x2_start + v2t
    x1_start + v1t = x2_start + v2t
    t = (x1 - x2)/(v2 - v1)
    If t == 0, the objects will meet sometime in the future
    Else they won't 
*/

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if (v2 >= v1) {
            return "NO";
        }
        
        int i1 = Math.abs(x1 - x2);
        int i2 = Math.abs(v2 - v1);
        
        if (i1 % i2 == 0){
            return "YES";
        } else {
            return "NO";
        }
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
