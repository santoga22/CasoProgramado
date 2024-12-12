/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramado2;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Matrix {
    
// Métodos para imprimir Matríz
    public void printMatrix(Hotel matrix[][], int row, int col) {

        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result = result + matrix[i][j].toString();
                //result=result + matrix[i] ; Es lo mismo pq internamente utiliza el toString
                result = result + "\n";
            }

        }
        JOptionPane.showMessageDialog(null, result);

    }

    public void printMatrix(Hotel matrix[][]) {

        String result = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result = result + matrix[i][j].toString();
                //result=result + matrix[i] ; Es lo mismo pq internamente utiliza el toString
                result = result + "\n";
            }

        }
        JOptionPane.showMessageDialog(null, "Bienvenidos al sistema del Hotel\n    OK para ver habitaciones");
        JOptionPane.showMessageDialog(null, result);
    }
}
