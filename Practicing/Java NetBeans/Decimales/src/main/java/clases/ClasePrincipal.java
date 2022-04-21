
package clases;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
        
        //Utilizar clase decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
        
        //Utilizar String format
        System.out.println("La raiz cuadrada de " + numero + " es: " + String.format("%.2f", raiz));
        
        //Utilizar la clase math y el metodo round
        System.out.println("La raiz cuadrada de " + numero + " es: " + (double)Math.round(raiz * 100d) / 100);
        
        //Utilizar la clase BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.CEILING.HALF_UP);
        
        System.out.println("La raiz cuadrada de " + numero + " es: " + bd.doubleValue());
        
    }
    
}
