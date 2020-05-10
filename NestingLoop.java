public class NestingLoop {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
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
            // System.out.println();
        }

        System.out.println("\n");

    }
}

/*
 * Q1>: Look at the first set of nested loops ("CN"). Which variable changes
 * faster? Is it the variable controlled by the outer loop (c) or the variable
 * controlled by the inner loop (n)? Answer in a comment. Ans1>: inner loop
 * changes faster than outer loop.variable controlled by the inner loop(n).
 * 
 * Q2>: Change the order of the loops so that the "c" loop is on the inside and
 * the "n" loop is on the outside. How does the output change? Ans2>: Output
 * does not change.
 * 
 * Q3>: Look at the second set of nested loops ("AB"). Change the print()
 * statement to println(). How does the output change? (Then change it back to
 * print().) Ans3>: 1-1 1-2 1-3 2-1 2-2 2-3 3-1 3-2 3-3
 * 
 * Q4>: Add a System.out.println() statement after the close brace of the inner
 * loop (the "b" loop), but still inside the outer loop. How does the output
 * change? Ans4>: 1-1 1-2 1-3 2-1 2-2 2-3 3-1 3-2 3-3
 */