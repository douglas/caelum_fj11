// imprima todos os multiplos de 3 entre 1 e 100

class Exercicio3 {
    public static void main(String[] args) {
        for (int i=3; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
