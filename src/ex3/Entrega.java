package ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Entrega {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Morador[] moradores = new Morador[5];
        moradores[0] = new Morador("234567893",101);
        moradores[1] = new Morador("234567893",123);
        moradores[2] = new Morador("234567893",96);
        moradores[3] = new Morador("234567893",44);
        moradores[4] = new Morador("234567893",50);
        //dois numeros impares
        int impar = 0;
        for(int i =0; i< moradores.length; i++){
            System.out.println("Numero de Residencia do morador: "+ moradores[i].getNumResidencia());
            System.out.println("Tem cachorro? (S/N)");
            String resp = input.next();
            if(resp.equals("S") || resp.equals("s"))
                System.out.println("Não entrega a correspondência!");
            else{
                System.out.println("Entrega a correspondência!");
                if(moradores[i].getNumResidencia() %2 == 1)
                    impar++;
            }
        }
        System.out.println("Foram entregues correspondências em "+ impar +" casas de número ímpar!");
    }
}
