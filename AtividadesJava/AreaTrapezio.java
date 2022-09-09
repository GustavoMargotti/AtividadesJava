//Gustavo Margotti Cesconetto 3-52

import java.util.Scanner; 

public class AreaTrapezio { 

    private static float altura, base, basemaior, area; 

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); 

        System.out.println("Digite a altura: "); 
        altura = ler.nextFloat();
        System.out.println("Digite a base menor: ");
        base = ler.nextFloat();
        System.out.println("Digite a base maior: ");
        basemaior = ler.nextFloat();

        area = ((altura * (base + basemaior)) / 2); 

        System.out.println("Área do trapézio (exata): " + area); 
        System.out.println("Área do trapézio (arredondada): " + Math.round(area));

        ler.close();

    }
}