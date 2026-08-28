/*
Ejercicio 3 con clase JOptionPane
 */
package clase3;

import javax.swing.JOptionPane;

public class Ejercicio3_JOptionPane {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
     
        while (numero != 0){
            if (numero %2 == 0){
                JOptionPane.showMessageDialog(null, "El número "+numero+ " es par");
        }   else{
                JOptionPane.showMessageDialog(null, "El número "+numero+ " es impar");
        }
        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese otro número"));
    }   
        System.out.println("El número "+numero+" finaliza el programa");
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
}
