import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class estrella {
    private int[][] arreglo ;
    private int inicio;
    private int fin;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> listaVisitados = new ArrayList<Integer>();
    Map<Integer, Integer> distanciasLineales = new HashMap<>();

    public estrella(int[][] arreglo, int inicio, int fin, Map<Integer, Integer> distanciasLineales) {
        this.arreglo = arreglo;
        this.inicio = inicio;       
        this.fin = fin;
        this.distanciasLineales = distanciasLineales;
        metodoEstrella(inicio);
    }
    
public void metodoEstrella(int numero){
    if(numero == this.fin){
        System.out.println("Ya llego");
    }else{
        System.out.println(numero);
        listaVisitados.add(numero);
        sc.nextLine();
        metodoEstrella(comparacionDeNumeros(numero));
    }

}
public int comparacionDeNumeros(int numero) {
    // Obtener el primer número y su posición del arreglo
    int[] primerNumero = colocarPrimerNumero(numero);
    int numeroMenor = primerNumero[0];
    int posicionNM = primerNumero[1];

    // Iterar sobre el arreglo para encontrar el número menor
    for (int i = 0; i < this.arreglo.length; i++) {
        if (this.arreglo[numero][i] != 0 && !yaVisitado(i)) {
            // Calcular el peso de la arista y la distancia total actual  
            int pesoArista = this.arreglo[numero][i];
            int totalActual = pesoArista + distanciasLineales.getOrDefault(i, 0);
           // System.out.println("el suma actual de "+i+" es "+totalActual);
            // Verificar si la distancia total actual es menor que el número menor
            if (totalActual < numeroMenor) {
                // Actualizar el número menor y la posición
                numeroMenor = totalActual;
                posicionNM = i;
            }
        }
    }
    return posicionNM;
}

public int[] colocarPrimerNumero(int numero){
    int numeroMenor[] = new int[2];
    for(int i=0; i<this.arreglo.length; i++){
        if(this.arreglo[numero][i] != 0 && !yaVisitado(i)){
            numeroMenor[0] = this.arreglo[numero][i];
            numeroMenor[1] = i;
            break;
        }
    }
    return numeroMenor;
}

public boolean yaVisitado(int numero) {
    return this.listaVisitados.contains(numero);
}

}
