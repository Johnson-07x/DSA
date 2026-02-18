package Basics;

public class SwitchCases {
    static void main(String[] args) {
        int day = 1;
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";

            case 2:
                dayName = "Tuesday";

            case 3:
                dayName = "Wednesday";

            default:
                System.out.println(dayName);
                dayName = "InValid";
        }
        System.out.println(dayName);
    }
}
