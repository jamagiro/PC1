/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc1;

import java.util.ArrayList;

/**
 *
 * @author consultor05
 */
public class Alumno {

    String nombre;
    String codigo;
    ArrayList<Prueba> listaPruebas = new ArrayList<>();

    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void agregarPruebas(Prueba pru){
        listaPruebas.add(pru);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Prueba> getListaPruebas() {
        return listaPruebas;
    }

    public void setListaPruebas(ArrayList<Prueba> listaPruebas) {
        this.listaPruebas = listaPruebas;
    }

}
