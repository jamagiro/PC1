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
public class Grupo {

    String nombre;
    String codigo;
    String cantidad;
    ArrayList<Alumno> listaAlumno = new ArrayList<>();


    
    
    public boolean irDeViaje(){
       
        double sumaNotasEscritura =0;
        double sumaNotasLectura =0;
        double sumaNotasConversacion =0; 
        
        double promedioNotasEscritura = 0;
        double promedioNotasLectura = 0;
        double promedioNotasConversacion = 0;
        
        for (int i = 0; i < listaAlumno.size(); i++) {
            Alumno a = listaAlumno.get(i); //obtienes el alumno de la lista y lo metes en tu objeto a
            for (int j = 0; j < a.getListaPruebas().size(); j++) {
                Prueba p = a.getListaPruebas().get(j);
                //1 - Escritura
                if(j==0){
                    sumaNotasEscritura+=p.getNota();
                }                
                //2 - Lectura
                if(j==1){
                    sumaNotasLectura+=p.getNota();
                }
                //3 - Conversacion
                if(j==2){
                    sumaNotasConversacion+=p.getNota();
                }
            }            
        }
        
        promedioNotasEscritura = sumaNotasEscritura/3;
        promedioNotasLectura = sumaNotasLectura/3;
        promedioNotasConversacion = sumaNotasConversacion/3;
        
        //System.out.println("promedioNotasEscritura: " + promedioNotasEscritura);
        //System.out.println("promedioNotasLectura: " + promedioNotasLectura);
        //System.out.println("promedioNotasConversacion: " + promedioNotasConversacion);
       
        if(promedioNotasEscritura > 85 && promedioNotasLectura>80 && promedioNotasConversacion>88){
            
            for (int i = 0; i < listaAlumno.size(); i++) {
                Alumno a = listaAlumno.get(i);
                System.out.println(a.getNombre());
               
                
            }
            
            
            
            //System.out.println("Se van de viaje");
            return true;
        }
        
        
        return false;
    }    
    
    public void agregarAlumnos(Alumno alum){
        listaAlumno.add(alum);
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

}
