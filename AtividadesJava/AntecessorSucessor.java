//Gustavo Margotti Cesconetto 3-52

import java.util.Scanner; 

public class AntecessorSucessor { 

    private static int numero, antecessor, sucessor;
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); 
            System.out.println("Digite um número: "); 
                numero = ler.nextInt();
                    antecessor = ( numero - 1);
                        sucessor = ( numero + 1);
            System.out.println("O antecessor de "+ numero +" é "+ antecessor+ "!");
                System.out.println("O sucessor de "+ numero +" é "+ sucessor+ "!");
        
        ler.close();

    }
}