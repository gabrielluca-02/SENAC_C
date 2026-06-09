public class sc_toupper {

    public static int sc_toupper(int c) {

        if (c >= 'a' && c <= 'z') {
            return c - 32;
        }

        return c;
    }

    public static void main(String[] args) {

        System.out.println((char) sc_toupper('a'));
        System.out.println((char) sc_toupper('z'));
        System.out.println((char) sc_toupper('m'));

        System.out.println((char) sc_toupper('A'));
        System.out.println((char) sc_toupper('5'));
    }
}