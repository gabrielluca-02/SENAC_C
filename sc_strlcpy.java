public static void main(String[] args) {
    char[] buffer = new char[6];

    int len = sc_strlcpy(buffer, "Hello World", buffer.length);

    System.out.println("Tamanho da origem: " + len);

    for (char c : buffer) {
        System.out.print(c == '\0' ? "\\0" : c);
    }
}