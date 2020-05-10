public class NestingLoop {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (char c = 'A'; c <= 'E'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.print(c + " " + n);

                // Ques1> Look at the first set of nested loops ("CN"). Which variable changes
                // faster? Is it the variable controlled by the outer loop (c) or the variable
                // controlled by the inner loop (n)?

                // Ans1> variable n changes faster than c and its's controlled by inner loop.

                // Ques2>Change the order of the loops so that the "c" loop is on the inside and
                // the "n" loop is on the outside. How does the output change?

                // for (char n = 'A'; n <= 'E'; n++) { for (int c = 1; c <= 3; c++) {
                // System.out.println(n + " " + c);

                // Ans2> There is no changes in output.

            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"

        // Ques3>Look at the second set of nested loops ("AB"). Change the print()
        // statement to println(). How ////does the output change? (Then change it back
        // to print().)

        // Ans3> The Output printed into column instead of row.

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
                // System.out.println(a + "-" + b + " ");
            }
            // Ques4>Add a System.out.println() statement after the close brace of the inner
            // loop (the "b" loop), but //still inside the outer loop. How does the output
            // change?
            // Ans4> Output comes in matrix form.
            System.out.println();
        }

        System.out.println("\n");

        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(n + " " + c);

            }
        }
    }
}