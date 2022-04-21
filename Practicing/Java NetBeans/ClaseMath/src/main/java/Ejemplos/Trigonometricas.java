
package Ejemplos;

public class Trigonometricas {
    public static void main(String[] args) {
        
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        //Sen
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("EL seno de " + anguloEnGrados + " es: " + anguloEnRadianes);
        
        //Cos
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("EL coseno de " + anguloEnGrados + " es: " + anguloEnRadianes);
        
        //Tan
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("La tangente de " + anguloEnGrados + " es: " + anguloEnRadianes);
        
        double valorIngresado = 0.707;
        
        //Arccos
        anguloEnRadianes  = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("El arco coseno de " + valorIngresado + " es: " + anguloEnGrados + "°");
        
        //Arcsen
        anguloEnRadianes  = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("El arco seno de " + valorIngresado + " es: " + anguloEnGrados + "°");
        
        //Arctan
        anguloEnRadianes  = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("El arco tangente de " + valorIngresado + " es: " + anguloEnGrados + "°");
        
        
    }
}
