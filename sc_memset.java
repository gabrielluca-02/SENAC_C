public static byte[] sc_memset(byte[] memoria,
                               byte valor,
                               int n) {

    int limite = Math.min(n, memoria.length);

    for (int i = 0; i < limite; i++) {
        memoria[i] = valor;
    }

    return memoria;
}