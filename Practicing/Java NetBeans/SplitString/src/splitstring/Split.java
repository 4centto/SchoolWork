package splitstring;

import java.util.ArrayList;

public class Split {

    private char expression;
    private String cadena;

    public Split(String expression, String cadena) {
        this.expression = expression.charAt(0);
        this.cadena = cadena;
    }

    public String[] split() {
        String str;
        ArrayList list = new ArrayList();
        char[] registro = this.cadena.toCharArray();
        String aux = "";
        for (int i = 0; i < registro.length; i++) {
            char s = this.expression;
            if (Character.compare(registro[i], s) != 0) {
                aux += registro[i];
            } else {
                list.add(aux);
                aux = "";
            }
        }
        
        //Formatear de ArrayList a String[]
        String[] arreglo = new String[list.size()];
      
        for(int i = 0; i < list.size(); i++){
            arreglo[i] = list.get(i).toString();
        }
        return arreglo;
    }

}
