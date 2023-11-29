package AtividadeTRYCATCH;

import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
    try{
        Scanner scnAltura = new Scanner (System.in);
        System.out.println("Digite a altura");
        double altura = scnAltura.nextDouble();

        Scanner scnLargura = new Scanner(System.in);
        System.out.println("Digite a largura");
        double largura = scnLargura.nextInt();

        System.out.println("O metro quadrado é de " + (largura * altura));

        scnAltura.close();
        scnLargura.close();
    } catch (Exception e){
        System.out.println("Ops! Ocorreu um erro " + e);
    }
}
}
