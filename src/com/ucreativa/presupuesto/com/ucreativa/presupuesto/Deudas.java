package com.ucreativa.presupuesto;

public class Deudas implements Totales {

    private int prestamo1 = 130000;
    private int prestamoCasa = 66000;           //Estos valores han sido seteados con la intencion de que sus aproximados sean fijos por mes
    private int prestamoUniversidad = 85000;


    public int getPrestamo1() { return prestamo1; }          //Agrego metodos get para obetener los valores de los atributos
    public int getPrestamoCasa() {
        return prestamoCasa;
    }
    public int getPrestamoUniversidad() {
        return prestamoUniversidad;
    }


    public int Totales(){                   //Sumatoria de montos totales
        return prestamo1 + prestamoCasa + prestamoUniversidad;
    }
}
