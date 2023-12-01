package AtividadeTRYCATCH;

import java.util.Scanner;

public class atividade4 {
    public class long1 {
    public static void main(String[] args) {
        try{
        Scanner scnQuantia = new Scanner(System.in);
        System.out.println("Digite o valor da quantia que deseja depositar");
        long quantia = scnQuantia.nextLong();

            if (quantia > 1500000000000000000L) { 
                System.out.println("Valor muito alto para depósito! Tente outro valor.");
            } else {
                System.out.println("Valor depositado com sucesso");
            }
        }catch (Exception e){
            System.out.println("Ops! Ocorreu um erro " + e);
        }
    }
    }
}

