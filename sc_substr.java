public static String sc_substr(String s, int start, int len) {
    if (s == null) {
        return null;
    }

    if (start >= s.length()) {
        return "";
    }

    int size = 0;

    while (size < len && (start + size) < s.length()) {
        size++;
    }

    char[] result = new char[size];

    for (int i = 0; i < size; i++) {
        result[i] = s.charAt(start + i);
    }

    return new String(result);
}