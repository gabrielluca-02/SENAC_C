public static String[] sc_split(String str, char delimiter) {
    if (str == null) {
        return null;
    }

    int words = countWords(str, delimiter);
    String[] result = new String[words];

    int i = 0;
    int index = 0;

    while (i < str.length()) {

        while (i < str.length() && str.charAt(i) == delimiter) {
            i++;
        }

        int start = i;

        while (i < str.length() && str.charAt(i) != delimiter) {
            i++;
        }

        int len = i - start;

        if (len > 0) {
            result[index++] = sc_substr(str, start, len);
        }
    }

    return result;
}