public static String sc_strchr(String str, char c) {
    int i = 0;

    while (i < str.length()) {
        if (str.charAt(i) == c) {
            return str.substring(i);
        }
        i++;
    }

    return null;
}