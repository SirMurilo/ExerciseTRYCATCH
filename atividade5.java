package AtividadeTRYCATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class atividade5 {
    public static void validarInteger(String erro) {
        boolean retornar = false;
        if (Integer.valueOf(erro) > 2147483647) {
            throw new InputMismatchException("Ops! Valor inteiro maior que o permitido. Favor digitar um valor válido.");
        } else if (Short.valueOf(erro) >= 2147483647) {
            System.out.println("Valor aceito pelo sistema, prosseguindo...");
        }else {
            Integer[] numeros = {0,1,2,3,4,5,6,7,8,9};
            boolean achouInteiro = false;
            boolean achouString = false;
            for (int n = 0; n < erro.length(); n++){
                achouInteiro = false;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] == Integer.valueOf(erro.substring(n, n + 1))) {
                        achouInteiro = true;
                        
                    }
                }
                if (achouInteiro == false) {
                    achouString = true;
                }
            }
            if (achouString == true) {
                System.out.println("Ops! Contem algum carácter não numérico na digitação. Utilize apenas números");
            }else{
                retornar true;
            }
        }
        return retornar;
    }
    public static void main(String[] args) {
        try{
            boolean identificouValor = false;
            Scanner scnValor = new Scanner(System.in);

            while (identificouValor == false) {
                System.out.println("Digite um valor");
                int valor = scnValor.nextInt();
                if (validarInteger(String.valueOf(valor)) == true) {
                    identificouValor = true;
                }
            }
            scnValor.close();
        } catch (Exception e) {
            System.out.println("Ops! Deu erro " + e);
        }
    }
}
