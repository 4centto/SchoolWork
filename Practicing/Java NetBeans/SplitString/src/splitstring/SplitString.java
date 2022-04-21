
package splitstring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SplitString {

    public static void main(String[] args) {
        
        try{
            FileReader file = new FileReader("C:\\Users\\acer_usuario\\Desktop\\SplitString\\src\\splitstring\\file.txt");
            BufferedReader bf = new BufferedReader(file);
            
            String str;
            while((str = bf.readLine()) != null){
                
                Split s = new Split("@", str);
                String[] descomposicion = s.split();
                
                System.out.println("Me llamo: " + descomposicion[0] + " " + descomposicion[1] + " " + descomposicion[2] + "\n" + 
                "Naci en el " + descomposicion[3]);
                
            }
            
        } catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
