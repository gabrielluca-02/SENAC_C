public static int sc_strrchr(String str, char c) {
    if (c == '\0') {
        return str.length();
    }

    for (int i = str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == c) {
            return i;
        }
    }

    return -1;
}