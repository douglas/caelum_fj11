class TesteLoopsCondicionais {
    public static void main(String[] args) {

        // lembrar sempre de declarar a variavel dentro do laco ou fora dele
        // caso necessario
        for (int i=0; i<10; i++) {
            System.out.println("Valores do for: " + i);
        }

        int cont = 0;

        while (cont < 10) {
            System.out.println("Valores do while: " + cont);
            cont++;
        }

        do {
            System.out.println("Decrementando no do-while: " + cont);
            cont--;
        }
        while (cont > 0);

        int mes = 2;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            default:
                System.out.println("Outro mes");
                break;
        }
    }
}
