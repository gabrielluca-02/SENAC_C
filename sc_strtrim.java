public static String sc_strtrim(String s1, String set) {
    int start = 0;
    int end = s1.length() - 1;

    while (start < s1.length()
            && isInSet(s1.charAt(start), set)) {
        start++;
    }

    while (end >= start
            && isInSet(s1.charAt(end), set)) {
        end--;
    }

    return sc_substr(s1, start, end - start + 1);
}