public static String sc_strmapi(String s, CharMapper f) {
    if (s == null || f == null) {
        return null;
    }

    char[] result = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
        result[i] = f.apply(i, s.charAt(i));
    }

    return new String(result);
}

public static void sc_striteri(char[] str, CharIterator f) {
    if (str == null || f == null) {
        return;
    }

    for (int i = 0; i < str.length; i++) {
        str[i] = f.apply(i, str[i]);
    }
}