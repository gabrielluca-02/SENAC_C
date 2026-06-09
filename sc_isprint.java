public class sc_isprint {

    public static boolean sc_isprint(int c) {
        return c >= 32 && c <= 126;
    }

    public static void main(String[] args) {

        System.out.println(sc_isprint('A'));  // true
        System.out.println(sc_isprint('0'));  // true
        System.out.println(sc_isprint(' '));  // true

        System.out.println(sc_isprint('\n')); // false
        System.out.println(sc_isprint('\t')); // false
        System.out.println(sc_isprint(127));  // false
    }
}