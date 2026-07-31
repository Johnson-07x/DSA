package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPattern {
    public static void solve(int n, ArrayList<Integer> result) {
        result.add(n);
        if (n <= 0) return;
        solve(n - 5, result);
        result.add(n);
    }

    static public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        solve(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> result = pattern(n);
        System.out.println(result); 
    }
}
