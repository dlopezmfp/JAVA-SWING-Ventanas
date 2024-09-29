/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafico;

/**
 *
 * @author rex_a
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread hiloAwt = new awt();
        Thread hiloSwing = new swing();
        hiloAwt.start();
        hiloSwing.start();
    }
}
