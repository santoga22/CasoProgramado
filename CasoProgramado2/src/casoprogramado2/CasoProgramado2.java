
package casoprogramado2;

import javax.swing.JOptionPane;

public class CasoProgramado2 {

    public static void main(String[] args) {

        Hotel habitaciones[][] = new Hotel[3][3];
        // Datos Fijos
        habitaciones[2][0] = new Hotel(1, "Simple", 20, "Libre");
        habitaciones[2][1] = new Hotel(2, "Doble", 90, "Ocupada");
        habitaciones[2][2] = new Hotel(3, "Simple", 35, "Sucia");
        habitaciones[1][0] = new Hotel(4, "Doble", 100, "Libre");
        habitaciones[1][1] = new Hotel(5, "Simple", 40, "Sucia");
        habitaciones[1][2] = new Hotel(6, "Doble", 80, "Libre");
        habitaciones[0][0] = new Hotel(7, "Simple", 30, "Sucia");
        habitaciones[0][1] = new Hotel(8, "Doble", 100, "Ocupada");
        habitaciones[0][2] = new Hotel(9, "Simple", 40, "Libre");
        //Declaración de métodos
        Matrix HotelMatrix = new Matrix();
        HotelMatrix.printMatrix(habitaciones);
        cambios(habitaciones);

    }
// Método de cambio

    public static void cambios(Hotel habitaciones[][]) {

        int respuesta;
        int respuestaCambio;
        int habitacionSelect;
        String nuevoEstado;
        String nuevoTipo;
        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer algún cambio?\n Sí-1\n No-2"));
            if (respuesta == 1) {
                respuestaCambio = Integer.parseInt(JOptionPane.showInputDialog("Qué desea Cambiar?\n Estado-1\n Tipo-2\n Precio-2"));
                switch (respuestaCambio) {
                    case 1:
                        habitacionSelect = Integer.parseInt(JOptionPane.showInputDialog("A qué habitación desea modificar su estado 1-9?"));
                        switch (habitacionSelect) {
                            case 1:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[2][0] = new Hotel(1, "Simple", 20, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 2:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[2][1] = new Hotel(2, "Doble", 90, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 3:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[2][2] = new Hotel(3, "Simple", 35, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 4:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[1][2] = new Hotel(6, "Doble", 80, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 5:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[1][1] = new Hotel(5, "Simple", 40, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 6:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[1][2] = new Hotel(6, "Doble", 80, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 7:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[0][0] = new Hotel(7, "Simple", 30, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 8:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[0][1] = new Hotel(8, "Doble", 100, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 9:
                                nuevoEstado = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[0][2] = new Hotel(9, "Simple", 40, nuevoEstado);
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                        }
                    case 2:

                        habitacionSelect = Integer.parseInt(JOptionPane.showInputDialog("A qué habitación desea modificar su Tipo 1-9?"));
                        switch (habitacionSelect) {
                            case 1:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[2][0] = new Hotel(1, nuevoTipo, 20, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 2:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[2][1] = new Hotel(2, nuevoTipo, 90, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 3:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[2][2] = new Hotel(3, nuevoTipo, 35, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 4:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[1][2] = new Hotel(6, nuevoTipo, 80, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 5:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[1][1] = new Hotel(5, nuevoTipo, 40, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 6:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[1][2] = new Hotel(6, nuevoTipo, 80, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 7:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[0][0] = new Hotel(7, nuevoTipo, 30, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 8:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[0][1] = new Hotel(8, nuevoTipo, 100, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                            case 9:
                                nuevoTipo = JOptionPane.showInputDialog("Ingrese Nuevo estado");
                                habitaciones[0][2] = new Hotel(9, nuevoTipo, 40, "");
                                JOptionPane.showInputDialog(habitaciones);
                                break;
                        }

                }
            }
         } while (respuesta != 2);

    }
}
