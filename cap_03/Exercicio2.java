class Exercicio2 {
    public static void main(String[] args) {
        int acumulador = 0;

        for (int i=1; i<=1000; i++) {
            acumulador += i;
        }

        System.out.println("O valor total eh: " + acumulador);
    }
}
