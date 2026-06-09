public class sc_tolower {

    public static int sc_tolower(int c) {

        if (c >= 'A' && c <= 'Z') {
            return c + 32;
        }

        return c;
    }

    public static void main(String[] args) {

        System.out.println((char) sc_tolower('A'));
        System.out.println((char) sc_tolower('Z'));
        System.out.println((char) sc_tolower('M'));

        System.out.println((char) sc_tolower('a'));
        System.out.println((char) sc_tolower('5'));
    }
}