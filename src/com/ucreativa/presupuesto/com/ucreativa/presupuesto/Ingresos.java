package com.ucreativa.presupuesto;

public class Ingresos {

    private int salarioAndrea = 800000;
    private int salarioOscar = 1210000;         //Estos valores han sido seteados con la intencion de que sus aproximados sean fijos por mes



    public int getSalarioAndrea() {
        return salarioAndrea;
    }
    public int getSalarioOscar() { return salarioOscar; }       //Agrego metodos get para obetener los valores de los atributos


    public int totalIngresos(){                 //Sumatoria de montos totales
        return salarioAndrea + salarioOscar;
    }
}
