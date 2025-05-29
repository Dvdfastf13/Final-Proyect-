/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinalp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author david
 */
public class ProyectoFinalP {

public static ArrayList<Usuario> usuarios = new ArrayList<>();
public static ArrayList<Dlibros> dlibros = new ArrayList<>();
public static ArrayList<Cupones> cuppones = new ArrayList<>();
public static ArrayList<Reportev>reportev = new ArrayList<>();
public static ArrayList<Direvende>direccion= new ArrayList<>();
public static LinkedList<Usuario> usuario = new LinkedList<>();

public static void main(String[] args) {

    Usuario u = new Usuario();
    u.setUsuario("admin");
    u.setNombre("admin");
    u.setPassword("admin");
    u.setRol(1);
    u.setConfirmar("admin");
    
    usuarios.add(u);
    
        
        Login v = new Login();
        v.setVisible(true);
}
}
                