package com.ucreativa.presupuesto;

public class PagosServicios implements Totales{

    private int alimentacion = 400000;
    private int asada = 9000;
    private int electricidad = 40000;
    private int internet = 36000;           //Estos valores han sido seteados con la intencion de que sus aproximados sean fijos por mes
    private int limpieza = 120000;
    private int nanny = 325000;
    private int subscripciones = 35000;
    private int telefonia = 15000;
    private int extras = 0;


    public int getAlimentacion() {
        return alimentacion;
    }
    public int getAsada() {                         //Agrego metodos get para obetener los valores de los atributos
        return asada;
    }
    public int getElectricidad() {
        return electricidad;
    }
    public int getInternet() {
        return internet;
    }
    public int getLimpieza() {
        return limpieza;
    }
    public int getNanny() {
        return nanny;
    }
    public int getSubscripciones() {
        return subscripciones;
    }
    public int getTelefonia() {
        return telefonia;
    }
    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int Totales(){                    //Sumatoria de montos totales
        return alimentacion + asada + electricidad + internet + limpieza + nanny + subscripciones + telefonia + extras;
    }
}
