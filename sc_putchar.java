public static void sc_putchar_fd(char c, int fd) {
    switch (fd) {
        case 1:
            System.out.print(c);
            break;

        case 2:
            System.err.print(c);
            break;
    }
}