package com.ucreativa.presupuesto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
//Esta clase trabaja como una clase Service

    private PagosServicios ps;
    private Deudas dbt;
    private Ingresos inc;
    private int liquidoDisponible;
    ArrayList<Metas> listaDeMetas;              //Aca creo un arreglo de metas


    public Presupuesto(PagosServicios pagoServicios){
        ps = pagoServicios;                     //Constructor: Instancias Inicializadas en Clase Presupuesto
        dbt = new Deudas();
        inc = new Ingresos();
        listaDeMetas = new ArrayList<Metas>();
    }

    public int LiquidoDisponible(){
        liquidoDisponible = inc.totalIngresos() - ps.Totales() - dbt.Totales();
        return liquidoDisponible;
    }

    public void AgregarNuevaMeta(String nombre, String estado, String categoria, int precio){
        Metas meta = new Metas(nombre, estado, categoria, precio);      //Improvements: crear base de datos para esta funcionalidad
        listaDeMetas.add(meta);
    }
    public String MetaPosible(){
        ArrayList<Metas> Obtenibles = new ArrayList<Metas>();
        String retorno = "Las metas optenibles este mes son: ";
        for(int i = 0; i < listaDeMetas.size(); i++){
            if( listaDeMetas.get(i).getEstado().equals("Pendiente")){
                if( listaDeMetas.get(i).getPrecio()<this.liquidoDisponible){
                      Obtenibles.add(listaDeMetas.get(i));
                }
            }else{
                retorno = "No hay alcance para cubrir una meta este mes";
            }

        }
        for(int i = 0; i < Obtenibles.size(); i++){
            retorno+= Obtenibles.get(i).getNombre();
            retorno+= " con un valor aproximado de: ";
            retorno+= Obtenibles.get(i).getPrecio();
            retorno+= " ";

        }
        return retorno;
    }


}
