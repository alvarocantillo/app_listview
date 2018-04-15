package com.example.usuario.tallerlistview;

import java.util.ArrayList;

/**
 * Created by android on 14/04/2018.
 */

public class Datos {
private static ArrayList<Operaciones> operaciones = new ArrayList<>();

public static void guardar(Operaciones p){
    operaciones.add(p);
}
public static ArrayList<Operaciones> obtener(){
    return operaciones;
}
}
