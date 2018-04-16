package com.example.usuario.tallerlistview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void Calcular_area_del_cuadrado_correctamente(){
                double a=4;
                double res = Cuadrado.calcular_acuadrado(a);
                assertEquals(16,res,0);
    }
    @Test
    public void Calcular_area_del_circulo_correctamente(){
        double a=4;
        double res = CIrculo.calcular_acirculo(a);
        assertEquals(50.24,res,0);
    }
    @Test
    public void Calcular_volumen_de_la_esfera_correctamente(){
        double a=4;
        double res = Esfera.calcular_vesfera(a);
        assertEquals(200.96,res,0);
    }
    @Test
    public void Calcular_volumen_del_cubo_correctamente(){
        double a=4;
        double res = Cubo.calcular_acubo(a);
        assertEquals(64,res,0);
    }
}