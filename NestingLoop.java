public class NestingLoop {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        // inner loop changes faster than outer loop.
        for (char c = 'A'; c <= 'E'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            // System.out.println(a + "-" + b + " ");// b is out of scope here, outside of
            // the loop.
        }

        System.out.println("\n");

        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(n + " " + c);
                // System.out.println(n + " " + c);
            }
        }
    }
}