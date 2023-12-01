package AtividadeTRYCATCH;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        try{
                    Scanner scnIdade = new Scanner(System.in);
                    System.out.println("Digite um número: ");
                    short idade = scnIdade.nextShort();

                    if (idade> 18){
                        System.out.println("Parabéns, você é maior de idade.");
                } else {
                    System.out.println("Xii! Você é menor de idade.");
                }
            } catch (Exception e) {
                System.out.println("Ops! Ocorreu um erro" + e);
            }
            
        } 

    }