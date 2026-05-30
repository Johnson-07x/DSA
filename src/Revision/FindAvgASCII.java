package Revision;

public class FindAvgASCII {
    static double findAvg(String s) {
        int n = s.length();
        int result = 0;
        for (char c : s.toCharArray()) {
            result += c;
        }
        return (double) result / n;
    }

    static void main(String[] args) {
        String s = "source";
        double result = findAvg(s);
        System.out.println(result);
    }
}
