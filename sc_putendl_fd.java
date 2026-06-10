public static void sc_putendl_fd(String str, int fd) {
    if (str == null) {
        return;
    }

    sc_putstr_fd(str, fd);
    sc_putchar_fd('\n', fd);
}