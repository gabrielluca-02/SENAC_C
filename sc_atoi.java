public static int sc_atoi(String str) {

    int i = 0;
    int sinal = 1;
    int resultado = 0;

    // Ignorar espaços iniciais
    while (i < str.length() && str.charAt(i) == ' ') {
        i++;
    }

    // Verificar sinal
    if (i < str.length() && str.charAt(i) == '-') {
        sinal = -1;
        i++;
    }
    else if (i < str.length() && str.charAt(i) == '+') {
        i++;
    }

    // Ler os dígitos
    while (i < str.length()
            && str.charAt(i) >= '0'
            && str.charAt(i) <= '9') {

        int digito = str.charAt(i) - '0';

        resultado = resultado * 10 + digito;

        i++;
    }

    return resultado * sinal;
}