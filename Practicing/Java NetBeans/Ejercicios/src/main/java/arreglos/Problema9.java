
package arreglos;

public class Problema9 {
    
    public static void main(String[] args) {
        
        int Arreglo[][] = new int[3][12];
        
        //Dulces
        int MAYOR = 1, MES = 0;
        //Promedio de bebidas
        float PROM = 0, AUM = 0;
        //Bebidas mayor y menor
        int MAYOR2 = 1, MENOR = 100000, MESMAYOR = 0, MESMENOR = 0;
        int AUX = 1, AUX2 = 100000;
        String MESMAYOR2 = "", MESMENOR2 = "";
        //Mayor costo de produccion de dulces
        String MES2 = "";
        //Menor costo en diciembre
        int DIC = 100000, RUB = 0;
        String RUBRO = "";
        
        //Llenado del arreglo
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 12; j++){
                
                Arreglo[i][j] = (int)(Math.random() * 10000);
                
            }
            
        }
        
        System.out.println("*****************************");
        System.out.println("* PROUDCCION DEL AÑO PASADO *");
        System.out.println("*****************************");
        System.out.println("");
        
        //Impresion del arreglo
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 12; j++){
                
                if(i == 0){
                    if(j == 0){
                        System.out.print("   DULCES ");
                        System.out.print("[" + Arreglo[i][j] + "]");
                    } else {
                        System.out.print("[" + Arreglo[i][j] + "]");
                    }
                }
                if(i == 1){
                    if(j == 0){
                        System.out.print("  BEBIDAS ");
                        System.out.print("[" + Arreglo[i][j] + "]");
                    } else {
                        System.out.print("[" + Arreglo[i][j] + "]");
                    }
                } 
                if(i == 2){
                    if(j == 0){
                        System.out.print("CONSERVAS ");
                        System.out.print("[" + Arreglo[i][j] + "]");
                    } else {
                        System.out.print("[" + Arreglo[i][j] + "]");
                    }
                }
                
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        //Mayor costo de produccion de dulces
        for(int i = 0; i == 0; i++){
            for(int j = 0; j < 12; j++){
                
                if(Arreglo[i][j] > MAYOR){
                    
                    MAYOR = Arreglo[i][j];
                    MES = j;
                    
                    if(j == 0){
                        MES2 = "Enero";
                    } else if(j == 1){
                        MES2 = "Febrero";
                    } else if(j == 2){
                        MES2 = "Marzo";
                    } else if(j == 3){
                        MES2 = "Abril";
                    } else if(j == 4){
                        MES2 = "Mayo";
                    } else if(j == 5){
                        MES2 = "Junio";
                    } else if(j == 6){
                        MES2 = "Julio";
                    } else if(j == 7){
                        MES2 = "Agosto";
                    } else if(j == 8){
                        MES2 = "Septiembre";
                    } else if(j == 9){
                        MES2 = "Octubre";
                    } else if(j == 10){
                        MES2 = "Noviembre";
                    } else if(j == 11){
                        MES2 = "Diciembre";
                    }
                    
                }
                
            }
            
        }
        System.out.println("En el mes " + MES2 + " se registro mayor costo de produccion, con $" + MAYOR);
        
        //Promedio Anual de las bebidas
        for(int i = 1; i == 1; i++){
            for(int j = 0; j < 12; j++){
                
                AUM = AUM + Arreglo[i][j];
                
            }
        }
        PROM = AUM / 12;
        System.out.println("El promedio anual de los costos de bebidas es: " + PROM);
        
        //Mayor costo de bebidas
        for(int i = 1; i == 1; i++){
            for(int j = 0; j < 12; j++){
                
                if(Arreglo[i][j] > AUX){
                    AUX = Arreglo[i][j];
                    MESMAYOR = j;
                    
                    if(j == 0){
                        MESMAYOR2 = "Enero";
                    } else if(j == 1){
                        MESMAYOR2 = "Febrero";
                    } else if(j == 2){
                        MESMAYOR2 = "Marzo";
                    } else if(j == 3){
                        MESMAYOR2 = "Abril";
                    } else if(j == 4){
                        MESMAYOR2 = "Mayo";
                    } else if(j == 5){
                        MESMAYOR2 = "Junio";
                    } else if(j == 6){
                        MESMAYOR2 = "Julio";
                    } else if(j == 7){
                        MESMAYOR2 = "Agosto";
                    } else if(j == 8){
                        MESMAYOR2 = "Septiembre";
                    } else if(j == 9){
                        MESMAYOR2 = "Octubre";
                    } else if(j == 10){
                        MESMAYOR2 = "Noviembre";
                    } else if(j == 11){
                        MESMAYOR2 = "Diciembre";
                    }
                }
                
            }
        }
        //Menor costo de bebidas
        for(int i = 1; i == 1; i++){
            for(int j = 0; j < 12; j++){
                
                if(Arreglo[i][j] < AUX2){
                    AUX2 = Arreglo[i][j];
                    MESMENOR = j;
                    
                    if(j == 0){
                        MESMENOR2 = "Enero";
                    } else if(j == 1){
                        MESMENOR2 = "Febrero";
                    } else if(j == 2){
                        MESMENOR2 = "Marzo";
                    } else if(j == 3){
                        MESMENOR2 = "Abril";
                    } else if(j == 4){
                        MESMENOR2 = "Mayo";
                    } else if(j == 5){
                        MESMENOR2 = "Junio";
                    } else if(j == 6){
                        MESMENOR2 = "Julio";
                    } else if(j == 7){
                        MESMENOR2 = "Agosto";
                    } else if(j == 8){
                        MESMENOR2 = "Septiembre";
                    } else if(j == 9){
                        MESMENOR2 = "Octubre";
                    } else if(j == 10){
                        MESMENOR2 = "Noviembre";
                    } else if(j == 11){
                        MESMENOR2 = "Diciembre";
                    }
                }
                
            }
        }
        
        System.out.println("En " + MESMAYOR2 + " se registro el mayor costo de produccion en bebidas");
        System.out.println("En " + MESMENOR2 + " se registro el menor costo de produccion en bebidas");
        
        for(int i = 0; i < 3; i++){
            for(int j = 11; j == 11; j++){
                
                if(Arreglo[i][j] < DIC){
                    
                    DIC = Arreglo[i][j];
                    RUB = i;
                    
                    if(i == 0){
                        RUBRO = "Dulces";
                    } else if(i == 1){
                        RUBRO = "Bebidas";
                    } else if(i == 2){
                        RUBRO = "Conservas";
                    }     
                    
                }
                
            }
        }
        
        System.out.println("El menor costo de produccion en diciembre fue obtenido por el rubro de " + RUBRO);
        
    }
    
}
