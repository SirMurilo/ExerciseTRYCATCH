package AtividadeTRYCATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        try{
            Scanner scnPeso = new Scanner(System.in);
            System.out.println("Digite seu peso em kilos");
            double peso = scnPeso.nextDouble();

            Scanner scnAltura = new Scanner(System.in);
            System.out.println("Digite sua altura em metros");
            double altura = scnAltura.nextDouble();

            System.out.println("Seu IMC é de "  + (peso/ (altura * altura)));

            scnPeso.close();
            scnAltura.close();
        }catch (InputMismatchException e){
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
    }
}
