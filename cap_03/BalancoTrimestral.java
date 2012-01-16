class BalancoTrimestral {
    public static void main(String[] args) {
        int gastos_janeiro = 15000;
        int gastos_fevereiro = 23000;
        int gastos_marco = 17000;

        int gastos_trimestre = gastos_janeiro + gastos_fevereiro + gastos_marco;
        int media_mensal = gastos_trimestre / 3;

        System.out.println("Valor dos gastos no trimestre: " + gastos_trimestre);
        System.out.println("Valor dos média mensal: " + media_mensal);
    }
}
