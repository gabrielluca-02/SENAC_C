public static int sc_memchr(byte[] memoria,
                            byte valor,
                            int n) {

    if (memoria == null) {
        return -1;
    }

    int limite = Math.min(n, memoria.length);

    for (int i = 0; i < limite; i++) {

        if (memoria[i] == valor) {
            return i;
        }
    }

    return -1;
}