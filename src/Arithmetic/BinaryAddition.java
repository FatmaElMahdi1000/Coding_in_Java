package Arithmetic;

public class BinaryAddition {
    long binary1;
    long binary2;
    private int[] Sum = new int[20];

    BinaryAddition(long binary1, long binary2) {
        this.binary1 = binary1;
        this.binary2 = binary2;
    }

    public void BinAdd() {
        int i = 0;
        int remainder = 0;

        while (binary1 != 0 || binary2 != 0) {
            // 1. Calculate the current bit and store it
            // We use i++ only ONCE here
            Sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);

            // 2. Calculate the remainder (DO NOT save it to the Sum array yet)
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);

            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0) {
            Sum[i++] = remainder;
        }

        System.out.print("Binary Sum: ");
        --i; // Move back from the empty slot to the last filled slot
        while (i >= 0) {
            System.out.print(Sum[i--]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryAddition op1 = new BinaryAddition(1011, 1101);
        // Call the method to perform the work and print the result
        op1.BinAdd();
    }
}

