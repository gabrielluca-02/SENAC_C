  

public class sc_isalnum {

    public static boolean sc_isalpha(char c) {
        return (c >= 'A' && c <= 'Z') ||
               (c >= 'a' && c <= 'z');
    }

    public static boolean sc_isdigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean sc_isalnum(char c) {
        return sc_isalpha(c) || sc_isdigit(c);
    }

    public static void main(String[] args) {

        System.out.println(sc_isalnum('A')); // true
        System.out.println(sc_isalnum('z')); // true
        System.out.println(sc_isalnum('7')); // true
        System.out.println(sc_isalnum('@')); // false
        System.out.println(sc_isalnum('#')); // false
    }
}