package com.example.usuario.tallerlistview;

import java.util.ArrayList;

/**
 * Created by android on 14/04/2018.
 */

public class Datos {
private static ArrayList<Operacion> operaciones = new ArrayList<>();

public static void guardar(Operacion o){
    operaciones.add(o);
}
public static ArrayList<Operacion> obtener(){return operaciones;}
}
