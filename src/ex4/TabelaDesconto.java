package ex4;

public class TabelaDesconto {
    public static void main(String[] args) {
        double valor = 300;
        double desconto = 1;
        System.out.printf("Valor da Compra\t\tPorcentagem de Desconto\t\t Valor\n");
        for(int i=0; i<20; i++){
            double valorDescontado = valor*(1-desconto/100);
            System.out.printf("R$%.2f\t\t\t%.0f%%\t\t\t\t\t\t\t R$%.2f\n", valor, desconto, valorDescontado);
            valor +=100;
            desconto++;
        }
    }
}
