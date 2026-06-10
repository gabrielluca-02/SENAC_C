public static void main(String[] args) {
    char[] buffer = new char[11];

    buffer[0] = 'H';
    buffer[1] = 'e';
    buffer[2] = 'l';
    buffer[3] = 'l';
    buffer[4] = 'o';
    buffer[5] = '\0';

    int result = sc_strlcat(buffer, " World", buffer.length);

    System.out.println("Retorno: " + result);

    for (char c : buffer) {
        System.out.print(c == '\0' ? "\\0" : c);
    }
}