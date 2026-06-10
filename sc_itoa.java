public static String sc_itoa(int n) {
    long num = n; // evita problemas com Integer.MIN_VALUE

    int len = countDigits(n);
    char[] result = new char[len];

    if (num == 0) {
        result[0] = '0';
        return new String(result);
    }

    boolean negative = false;

    if (num < 0) {
        negative = true;
        num = -num;
    }

    int i = len - 1;

    while (num > 0) {
        result[i] = (char) ('0' + (num % 10));
        num /= 10;
        i--;
    }

    if (negative) {
        result[0] = '-';
    }

    return new String(result);
}