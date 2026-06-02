package Revision.Patterns;

public class Vshape {
    static void main(String[] args) {
        int row = 5;
        int col = row * 2 - 1;
        int idx = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j || i + j == col - 1) {
                    System.out.print(idx);
                    idx++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
