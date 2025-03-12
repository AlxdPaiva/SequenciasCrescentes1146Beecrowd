/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequenciascrescentes1146beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SequenciasCrescentes1146Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int X = 1;
        while (X != 0) {
            X = entrada.nextInt();
            for (int i = 1; i <= X; i++) {
                System.out.print(i);
                if (i % X == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
    
}
