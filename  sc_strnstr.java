public static int sc_strnstr(String big, String little, int len) {
    if (little.isEmpty()) {
        return 0;
    }

    for (int i = 0; i < len && i < big.length(); i++) {
        int j = 0;

        while (
            j < little.length() &&
            i + j < len &&
            i + j < big.length() &&
            big.charAt(i + j) == little.charAt(j)
        ) {
            j++;
        }

        if (j == little.length()) {
            return i;
        }
    }

    return -1;
}