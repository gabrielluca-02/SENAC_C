public static String sc_strjoin(String s1, String s2) {
    if (s1 == null || s2 == null) {
        return null;
    }

    int len1 = s1.length();
    int len2 = s2.length();

    char[] result = new char[len1 + len2];

    int i = 0;

    while (i < len1) {
        result[i] = s1.charAt(i);
        i++;
    }

    int j = 0;

    while (j < len2) {
        result[i + j] = s2.charAt(j);
        j++;
    }

    return new String(result);
}