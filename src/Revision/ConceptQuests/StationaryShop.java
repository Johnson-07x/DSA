package Revision.ConceptQuests;

public class StationaryShop {
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Combination formula -> (n! / r! (n - r)!)
    static int findPencilsCombo(int n, int r) {
        return (factorial(n)) / (factorial(r) * factorial(n - r));
    }

    // Combination formula -> (n! / r! (n - r)!)
    static int findEraserCombo(int n, int r) {
        return (factorial(n)) / (factorial(r) * factorial(n - r));
    }

    static void main(String[] args) {
        int n = 5; // Total no of pencils
        int m = 2; // Total no of Erasers

        int p = 5; // No of pencils boy can take
        int e = 2; // No of Erasers boy can take

        int pencilsCombo = findPencilsCombo(n, p);
        System.out.println("Pencil Combination: " + pencilsCombo);

        int eraserCombo = findEraserCombo(m, e);
        System.out.println("Eraser Combination: " + eraserCombo);

        int result = pencilsCombo + eraserCombo;
        System.out.println("Total Combinations: " + result);
    }
}
