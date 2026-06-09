
public class sc_isalpha {
    public static boolean sc_isalpha(char c) {
        return (c >= 'A' && c <= 'Z') ||
               (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        System.out.println(sc_isalpha('A')); // true
        System.out.println(sc_isalpha('z')); // true
        System.out.println(sc_isalpha('5')); // false
        System.out.println(sc_isalpha('@')); // false
    }
}