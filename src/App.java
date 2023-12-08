import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
             
        int[][] matriz = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0, 140, 118, 0, 0, 75},
            {0, 0, 80, 0, 0, 211, 90, 0, 0, 0, 0, 0, 0 , 101, 0, 0, 0, 85, 0, 0},
            {0, 80, 0, 120, 0, 0, 75, 0, 0, 0, 0, 0, 0 , 138, 114, 0, 0, 0, 0, 0},
            {0, 0, 120, 0, 0, 0, 0, 0, 0, 0, 75, 0, 0 , 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 86, 0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0},
            {0, 211, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0, 99, 0, 0, 0, 0},
            {0, 90, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0, 98, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 87, 0 , 0, 0, 0, 0, 0, 92, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 0, 0 , 0, 0, 0, 111, 0, 0, 0},
            {0, 0, 0, 75, 0, 0, 0, 0, 0, 70, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 87, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0, 151, 0, 0, 0, 71},
            {0, 101, 138, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 97, 0, 0, 0, 0, 0},
            {0, 0, 114, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 97, 0, 80, 0, 0, 0, 0},
            {140, 0, 0, 0, 0, 99, 0, 0, 0, 0, 0, 0, 151, 0, 80, 0, 0, 0, 0, 0},
            {118, 0, 0, 0, 0, 0, 0, 0, 0, 111, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0},
            {0, 85, 0, 0, 0, 0, 0, 98, 0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 142, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 92, 0, 0, 0, 0 , 0, 0, 0, 142, 0, 0, 0},
            {75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71 , 0, 0, 0, 0, 0, 0, 0},
        };
        Map<Integer, Integer> miHashMap = new HashMap<>();
        
        // Llenar el HashMap con datos
        miHashMap.put(0, 366);
        miHashMap.put(1, 0);
        miHashMap.put(2, 160);
        miHashMap.put(3, 242);
        miHashMap.put(4, 161);
        miHashMap.put(5, 176);
        miHashMap.put(6, 77);
        miHashMap.put(7, 151);
        miHashMap.put(8, 226);
        miHashMap.put(9, 244);
        miHashMap.put(10, 241);
        miHashMap.put(11, 234);
        miHashMap.put(12, 380);
        miHashMap.put(13, 100);
        miHashMap.put(14, 193);
        miHashMap.put(15, 253);
        miHashMap.put(16, 329);
        miHashMap.put(17, 80);
        miHashMap.put(18, 199);
        miHashMap.put(19, 374);
         // Imprimir la matriz
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
              //  System.out.print(matriz[i][j] + "\t");
            }
           // System.out.println();  // Nueva línea después de cada fila
        }
        
        Boraz boraz=new Boraz(matriz, 0, 1);
        System.out.println("Estrella");
        estrella estrella=new estrella(matriz, 0, 1, miHashMap);

    }
}


        
    

       
       
       
  
