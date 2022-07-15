/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int op;
        Enlace c = new Enlace();
        do {
            System.out.println("Ingrese la placa: ");
            String pl = sc.nextLine();
            System.out.println("Ingrese el valor del auto");
            double va  = sc.nextDouble();
            sc.nextLine();

            Auto a = new Auto();
            a.establecerPlaca(pl);
            a.establecerValorMatricula(va);
            c.insertarAuto(a);
            System.out.println("Pulse 1 para finalizar");
            op = sc.nextInt();
            if (op == 1) {
                bandera = false;
            }
        } while (bandera);
    }
}
