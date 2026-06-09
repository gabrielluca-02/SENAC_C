
public class sc_isdigit  {

    public static boolean sc_isdigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {

        System.out.println(sc_isdigit('5')); // true
        System.out.println(sc_isdigit('0')); // true
        System.out.println(sc_isdigit('9')); // true

        System.out.println(sc_isdigit('A')); // false
        System.out.println(sc_isdigit('a')); // false
        System.out.println(sc_isdigit('@')); // false
    }
}