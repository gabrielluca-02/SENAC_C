public static String sc_strdup(String str) {
    char[] chars = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
        chars[i] = str.charAt(i);
    }

    return new String(chars);
}