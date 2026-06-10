public static int sc_strncmp(String s1, String s2, int n) {
    for (int i = 0; i < n; i++) {
        char c1 = (i < s1.length()) ? s1.charAt(i) : '\0';
        char c2 = (i < s2.length()) ? s2.charAt(i) : '\0';

        if (c1 != c2) {
            return c1 - c2;
        }

        if (c1 == '\0') {
            return 0;
        }
    }

    return 0;
}