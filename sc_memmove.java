public static void main(String[] args) {

    byte[] dados = {1, 2, 3, 4, 5};

    sc_memmove(dados, 1, 0, 3);

    for (byte b : dados) {
        System.out.print(b + " ");
    }
}