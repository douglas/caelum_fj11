// imprimir os fatoriais de 1 a 10
// fatorial => !n = n * n-1 * n-2 * ...

class Exercicio41 {
    public static double fatorial(int number) {
        if(number <= 1)
            return 1;
        else
            return number * fatorial(number - 1);
    }

    public static void main(String[] args) {
        for (int n=1; n<=27; n++) {
            System.out.println(fatorial(n));
        }
    }
}
