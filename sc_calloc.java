public static byte[] sc_calloc(int count, int size) {
    if (count <= 0 || size <= 0) {
        return null;
    }

    if (count > Integer.MAX_VALUE / size) {
        return null;
    }

    byte[] ptr = new byte[count * size];

    sc_bzero(ptr, ptr.length);

    return ptr;
}