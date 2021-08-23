package ex2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        while(opcao!=3) {
            System.out.printf("Menu de Opções:\n1. Idade\n2. IMC\n3.Sair\n\nDigite a opção desejada:\n ");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o seu ano de Nascimento: ");
                    int anoNascimento = input.nextInt();
                    System.out.println("Digite o ano Atual");
                    int anoAtual = input.nextInt();
                    calculaIdade(anoNascimento, anoAtual);
                    break;
                case 2:
                    System.out.println("Digite a altura: ");
                    double altura = input.nextDouble();
                    System.out.println("Digite o peso");
                    double peso = input.nextDouble();
                    calculaIMC(altura, peso);
            }
        }
    }
    static void calculaIdade(int anoNascimento, int anoAtual) {
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: "+ idade);
    }
    static void calculaIMC(double altura, double peso) {
        double imc = peso/(altura*altura);
        System.out.printf("IMC: %.2f\n\n", imc);
    }
}
