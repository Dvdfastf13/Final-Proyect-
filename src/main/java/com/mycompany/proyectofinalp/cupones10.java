/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class cupones10 {
     public static void main(String[] args) {

    }
     
     
         public static void CuponesGuardar(Cupones cu) {

        try (FileWriter archivo = new FileWriter("Tarea10.csv", true); 
             PrintWriter escribir = new PrintWriter(archivo)) {

            escribir.println(cu.getTipo() + "|" + cu.getValor() + "|" + cu.getCodigo() + "|" + cu.getFecha());

        } catch (IOException ex) {
            Logger.getLogger(cupones10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Cupones> leer(String ruta) {
        ArrayList<Cupones> contenido = new ArrayList<>();

        try {
            File archivo = new File(ruta);
            FileReader leer = new FileReader(archivo);
            BufferedReader bloque = new BufferedReader(leer);
            String linea = bloque.readLine();
            while (linea != null) {
                String[] cupon = linea.split("\\|");
                if (cupon.length == 4) {
                    Cupones c = new Cupones();
                    c.setTipo(Integer.parseInt(cupon[0].trim()));
                    c.setValor(Integer.parseInt(cupon[1].trim()));
                    c.setCodigo(Integer.parseInt(cupon[2].trim()));
                    c.setFecha(cupon[3].trim());
                    contenido.add(c);
                }
                linea = bloque.readLine();
            }
            bloque.close();
        } catch (IOException ex) {
            Logger.getLogger(cupones10.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contenido;
    }

}