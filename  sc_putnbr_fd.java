public static void sc_putnbr_fd(int n, int fd) {
    long num = n;

    if (num < 0) {
        sc_putchar_fd('-', fd);
        num = -num;
    }

    if (num >= 10) {
        sc_putnbr_fd((int)(num / 10), fd);
    }

    sc_putchar_fd((char)('0' + (num % 10)), fd);
}