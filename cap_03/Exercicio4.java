// imprimir os fatoriais de 1 a 10
// fatorial => !n = n * n-1 * n-2 * ...

class Exercicio4 {
    public static void main(String[] args) {
        for (int n=1; n<=27; n++) {
            double fatorial=1;
            for (int i=n; i>0; i--) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }
    }
}
