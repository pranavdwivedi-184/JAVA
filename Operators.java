public class Operators {
    static int a = 5;
    static int b = 7;

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        // ARTHMATIC OPERATOR
        // int c = 6;

        /*
         * System.out.println(a + b + c);
         * System.out.println(a - b - c);
         * System.out.println(a * b * c);
         * System.out.println(a / b / c);
         * System.out.println(a % b % c);
         */

        // Conditional or comparison or relational OPERATOR

        /*
         * System.out.println(a < b);
         * System.out.println(a > b);
         * System.out.println(a <= b);
         * System.out.println(a >= b);
         * System.out.println(a == b);
         * System.out.println(a != b);
         */

        // LOGICAL Operators

        /*
         * System.out.println(a > b || a < b);
         * System.out.println(a > b && a < b);
         * System.out.println(!(a > b));
         */

        // BITWISE OPERATOR
        /*
         * System.out.println(a | b); // or bitwise
         * System.out.println(a & b); // and bitwise
         * System.out.println(a ^ b); // or bitwise
         * System.out.println(~a); // -(a+1)
         * System.out.println(a << b); // left shift operator
         * System.out.println(a >> b); //right shift
         */

        // unray operator
        // --> pre increment and post increment also decrement

        /*
         * int c = a++;
         * int d = ++a;
         * int e = --a;
         * int f = b-- + ++a;
         * System.out.println(a);
         * System.out.println(b);
         * System.out.println(c);
         * System.out.println(d);
         * System.out.println(e);
         * System.out.println(f);
         */

        // assignment operator

        a -= 7; // a = a+7
        b <<= 7; // b = b<<7
        System.out.println(a);
        System.out.println(b);
    }
}
