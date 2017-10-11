// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int v = A.length; 
        if (v == 1) {return A[0]; }
        else if ((v == 0)||(A == null)) {return 0;}
        
        Arrays.sort(A);       
        for (int i = 0; i < v; i+=2) {
            if (A[i] != A[i+1]) return A[i];  
            if ((i+2) == (v-1)) return A[i+2];
        }
        return 0;
    }
}