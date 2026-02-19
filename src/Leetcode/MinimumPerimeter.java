package Leetcode;

public class MinimumPerimeter {
    static public long minimumPerimeter(long neededApples) {
        int plot = 0;
        while (neededApples / 12 > 0) {
            plot++;
            neededApples /= 12;
        }
        return plot;
    }

    static void main(String[] args) {
        System.out.println(minimumPerimeter(1000000000));
    }
}
