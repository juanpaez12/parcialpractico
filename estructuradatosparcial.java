import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Juan Paez
 */
public class estructuradatosparcial {
    
    public static Scanner sc = new Scanner(System.in);
    public static int i,j;
    public static void main(String[] args) {
        int M,N;
        System.out.println("filas");
        M = sc.nextInt();
        System.out.println("columnas");
        N = sc.nextInt();
        System.out.println("Ingrese matriz");
        
        String [ ][ ]mat = new String[M][N];
        
        llenar(mat);
        System.out.println("Matriz");
        mostrar(mat);
    }
    private static void llenar(String[][]mat)   {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]=sc.next();
            }
        }
        
    }

    private static void mostrar(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+"\t");
            }
          System.out.println();
        }
    }
}
