
package complementarios.probelma10;

public class Problema1010 {
    private int[][] COORDENADAS;
    
    public Problema1010(int[][] COORDENADAS){
        this.COORDENADAS = COORDENADAS;
    }
    
    public void Perimetro(){
        float perimetro = 0;
        
        perimetro = perimetro + (float)(Math.sqrt((Math.pow((COORDENADAS[0][0] + COORDENADAS[1][0]), 2)) + 
                                                  (Math.pow((COORDENADAS[0][1]) + COORDENADAS[1][1], 2))));
        
        perimetro = perimetro + (float)(Math.sqrt((Math.pow((COORDENADAS[0][0] + COORDENADAS[2][0]), 2)) + 
                                                  (Math.pow((COORDENADAS[0][1]) + COORDENADAS[2][1], 2))));
        
        perimetro = perimetro + (float)(Math.sqrt((Math.pow((COORDENADAS[1][0] + COORDENADAS[2][0]), 2)) + 
                                                  (Math.pow((COORDENADAS[1][1]) + COORDENADAS[2][1], 2))));
        
        System.out.println("* El perimetro es: " + perimetro);
        
    }
    
    public void Area(){
        float area = 0;
        
        area = (float)(0.5 * (((COORDENADAS[1][0] - COORDENADAS[0][0]) * (COORDENADAS[2][1] - COORDENADAS[0][1]))
                - ((COORDENADAS[2][0] - COORDENADAS[0][0]) * (COORDENADAS[1][1]  - COORDENADAS[0][1]))));
        
        if(area < 0){
            area = area * -1;
        }
        
        System.out.println("* Superficie: " + area);
        
    }
}
