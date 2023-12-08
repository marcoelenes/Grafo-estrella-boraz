import java.util.ArrayList;
import java.util.Scanner;

public class Boraz {
    private int[][] arreglo ;
    private int inicio;
    private int fin;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> listaVisitados = new ArrayList<Integer>();


    public Boraz(int[][] arreglo, int inicio, int fin) {
        this.arreglo = arreglo;
        this.inicio = inicio;
        this.fin = fin;
        metodoBoraz(inicio);
    }

    public void metodoBoraz(int numero){
        if(numero == this.fin){
            System.out.println("Ya llego");
        }else{
            System.out.println(numero);
            listaVisitados.add(numero);
           // sc.nextLine();

            metodoBoraz(comparacionDeNumeros(numero));
        }

    }
    public int comparacionDeNumeros(int numero){
        int numeroMenor = colocarPrimerNumero(numero)[0];
        int posicionNM = colocarPrimerNumero(numero)[1];
        for(int i=0; i<this.arreglo.length; i++){
            if(this.arreglo[numero][i] != 0 && !yaVisitado(i)
            ){
                if(this.arreglo[numero][i] < numeroMenor){
                    numeroMenor = this.arreglo[numero][i];
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
