
package complementarios;

import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float perimetro = 0, apotema = 0, altura = 0;
        
        System.out.println("¿Cual es el perimetro de la base del pentagono? ");
        perimetro = in.nextFloat();
        
        System.out.println("¿Cual es el apotema del pentagono? ");
        apotema = in.nextFloat();
        
        System.out.println("¿Cual es la altura del prisma? ");
        altura = in.nextFloat();
        
        System.out.println("****************************************");
        System.out.println("* Area de la Base: " + AreaBase(perimetro, apotema));
        System.out.println("* Area Lateral: " + AreaLateral(perimetro, altura));
        System.out.println("* Area Total: " + AreaTotal(perimetro, altura, apotema));
        System.out.println("* Volumen: " + Volumen(perimetro, altura, apotema));
        System.out.println("****************************************");
        
    }
    
    private static float AreaBase(float perimetro, float apotema){
        float base = (perimetro * apotema) / 2;
        return base;
    }
    private static float AreaLateral(float perimetro, float altura){
        float lateral = perimetro * altura;
        return lateral;
    }
    private static float AreaTotal(float perimetro, float altura, float apotema){
        float total = (2 * AreaBase(perimetro, apotema)) + AreaLateral(perimetro, altura);
        return total;
    }
    private static float Volumen(float perimetro, float altura, float apotema){
        float volumen = AreaBase(perimetro, apotema) * altura;
        return volumen;
    }
}
