public class ChOne7 {
    public static void main(String[] args) {
        double res = 0.0;
        int terms = 6; // number of terms to approximate
        for (int i = 0; i < terms; i++) {
            int denominator = 2 * i + 1;
            if (i % 2 == 0) {
                res += 1.0 / denominator;  // positive term
            } else {
                res -= 1.0 / denominator;  // negative term
            }
        }
        double piApprox = 4 * res;
        System.out.println(piApprox);
    }
}