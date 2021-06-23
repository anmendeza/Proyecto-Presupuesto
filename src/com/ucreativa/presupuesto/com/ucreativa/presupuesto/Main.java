package com.ucreativa.presupuesto;


import javax.swing.*;
import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {

        //1. Sistema pregunta al usuario si hubieron gastos extra ademas de los gastos fijos mensuales
        PagosServicios ps = new PagosServicios();
        if (JOptionPane.showInputDialog("Se contemplan gastos extra este mes? (S/N)").equals("S")) {
            try {
                ps.setExtras(Integer.parseInt(JOptionPane.showInputDialog("Accese monto de gastos extra contemplados este mes")));
            } catch (FindException e) {
                e.printStackTrace();
            }
        }

        //2. Sistema suma los gastos extra en conjunto con los demas gastos en PagosServicios
        Presupuesto pr = new Presupuesto(ps);
        System.out.println("El liquido disponible este mes es de " + pr.LiquidoDisponible());


        //3. Sistema consulta si hay nuevas metas y las agrega al repositorio
        while (JOptionPane.showInputDialog("Desea agregar una nueva meta? (S / N)").equals("S")) {
            String nombre = JOptionPane.showInputDialog("Nombre de la nueva meta");
            String estado = JOptionPane.showInputDialog("Estado  (Pendiente / Hecho) ");
            String categoria = JOptionPane.showInputDialog("Categoria (Lujo / Necesidad) ");
            int monto = 0;
            try{
                monto = Integer.parseInt(JOptionPane.showInputDialog("Costo aproximado de la meta?"));
            } catch (FindException e){
                e.printStackTrace();
            }

            pr.AgregarNuevaMeta(nombre, estado, categoria, monto);
        }

        //4. Sistema sugiere cual es la meta mas cercana con el liquido disponible
        System.out.println(pr.MetaPosible());
    }
}