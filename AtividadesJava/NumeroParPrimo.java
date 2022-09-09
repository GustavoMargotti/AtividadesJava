//Gustavo Margotti Cesconetto 3-52

import java.util.Scanner; 

public class NumeroParPrimo { 

    private static int numero, i, resul;
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); 
            System.out.println("Digite um número: "); 
                numero = ler.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        } else 
            System.out.println("IMPAR");

        for (i = 2; i <= numero / 2; i++){
            if(numero % i == 0) {
                resul++;
                break;
                
            }
        }
        
        if (resul == 0)
            System.out.println("PRIMO");
        else
            System.out.println("NÃO PRIMO");
        ler.close();

    }
}