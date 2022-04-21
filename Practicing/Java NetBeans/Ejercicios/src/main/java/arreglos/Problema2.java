package arreglos;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Candidatos[] = new int[13];
        int Voto = 0;
        int FLAG = 1;
        int marcador = 1;
        int ACUMTOTAL = 0;
        int GANADOR = 1;
        int marcador2 = 0;

        System.out.println("******************************");
        System.out.println("* SISTEMA DE CONTEO DE VOTOS *");
        System.out.println("******************************");
        System.out.println("");
        System.out.println("Para cancelar el conteo solo presiona 0");

        while (FLAG != 0) {

            System.err.println("Voto " + marcador + ": ");
            Voto = in.nextInt();

            if (Voto == 0) {
                
                FLAG = 0;

            } else {

                Candidatos[Voto] = Candidatos[Voto] + 1;

                marcador++;
                
                ACUMTOTAL = ACUMTOTAL + 1;

            }

        }
        
        System.out.println("TOTAL DE VOTOS: " + ACUMTOTAL);
        System.out.println("");
        
        for(int i = 1; i <= 12; i++){
            
            System.out.println("Votos para el candidato " + i + ": " + Candidatos[i]);
            
        }
        
        for(int i = 1; i <= 12; i++){
            
            if(Candidatos[i] > GANADOR){
                
                GANADOR = Candidatos[i];
                
                marcador2 = i;
                
            }
            
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("El ganador de la campaña fue el candidato " + marcador2 + " gano con un total de: " + GANADOR + " votos");
        System.out.println("Y ccon un porcentaje del %" + ((GANADOR * 100) / (ACUMTOTAL)));

    }

}
