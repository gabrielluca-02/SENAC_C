public static byte[] sc_memcpy(byte[] dest,
                               byte[] src,
                               int n) {

    if (dest == null || src == null) {
        return null;
    }

    int limite =
        Math.min(n,
            Math.min(dest.length, src.length));

    for (int i = 0; i < limite; i++) {
        dest[i] = src[i];
    }

    return dest;
}