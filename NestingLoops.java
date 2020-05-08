public class NestingLoops {

    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (char c = 'A'; c <= 'E'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }

        // The variable controlled by the inner loop (n) is changing faster because the
        // outer loop runs one interation and then goes into the inner loop which will
        // run fully before going back up to the second iteration of the outer loop.

        // 2) change the order of the loops
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }
        // The output changed the way the char received their numbers. In the first
        // nested for loops, the values were given to each letter first. For example A
        // was given A 1 A 2 A 3. Then B followed with B 1 B 2 B 3 and so on. When you
        // arrange the order, each letter gets assigned the first value first and then
        // you go on to the next. For example, A 1 B 1 C 1 D 1 ... and then after E 1
        // you start over with A 2 B 2 C 2. It just arranged the order the values were
        // assigned to each letter.

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");

            }
            // * You will add a line of code here.
            System.out.println();
        }

        // 3) When i changed the print statement to println it printed out each line of
        // code vertically instead of on the same line vertically. it gave each new
        // iteration it's own line instead of squishing them all on the same line
        // horizontally.
        System.out.println("\n");

        //4) The output changed to put all of the 1's on the first line so 1-1 1-2 1-3 and then went to a new line with the 2's 2-1 2-2 2-3. It put each b iteration on a new line. EVery time it wrapped back up to the outer loop, it printed out on a new line.
}