public static void sc_bzero(byte[] memoria, int n) {

    int limite = Math.min(n, memoria.length);

    for (int i = 0; i < limite; i++) {
        memoria[i] = 0;
    }
}