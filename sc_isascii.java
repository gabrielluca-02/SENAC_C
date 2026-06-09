public class sc_isascii {

    public static boolean sc_isascii(int c) {
        return c >= 0 && c <= 127;
    }

    public static void main(String[] args) {

        System.out.println(sc_isascii('A')); // true
        System.out.println(sc_isascii('z')); // true
        System.out.println(sc_isascii(127)); // true

        System.out.println(sc_isascii(128)); // false
        System.out.println(sc_isascii(-1));  // false
    }
}