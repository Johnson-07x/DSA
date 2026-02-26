package OOPS;

class SBI_BANK {
    final long accountNumber = 146136124631346l;
    private String holderName = "Johnson A J";
    private long aadhaarNumber = 2512514146146l;

    void display() {
        System.out.println(holderName);
        System.out.println(accountNumber);
    }

    void changeHolderName(String holderName) {
        this.holderName = holderName;
    }

    String getHolderName() {
        return holderName;
    }
}

public class GetterAndSetter {
    static void main(String[] args) {
        SBI_BANK sbi = new SBI_BANK();
        sbi.display();
        System.out.println(sbi.getHolderName());
    }
}
