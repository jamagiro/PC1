/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pc1;

/**
 *
 * @author consultor05
 */
public class PC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Grupo g = new Grupo();
        g.nombre = "POO1";
        
        Alumno a1 = new Alumno("Davis", "u201216583");
        Alumno a2 = new Alumno("Jani", "u201418557");
        Alumno a3 = new Alumno("Irving", "u201418556");
               
        Prueba p1 = new Prueba("Escritura", 80);
        Prueba p2 = new Prueba("Lectura", 90);
        Prueba p3 = new Prueba("Conversación", 100);

        Prueba p4 = new Prueba("Escritura", 95);
        Prueba p5 = new Prueba("Lectura", 88);
        Prueba p6 = new Prueba("Conversación", 97);        
        

        Prueba p7 = new Prueba("Escritura", 90);
        Prueba p8 = new Prueba("Lectura", 85);
        Prueba p9 = new Prueba("Conversación", 96);        
        
        a1.agregarPruebas(p1);
        a1.agregarPruebas(p2);
        a1.agregarPruebas(p3);

        a2.agregarPruebas(p4);
        a2.agregarPruebas(p5);
        a2.agregarPruebas(p6);
        
        a3.agregarPruebas(p7);
        a3.agregarPruebas(p8);
        a3.agregarPruebas(p9);   
        
        g.agregarAlumnos(a1);
        g.agregarAlumnos(a2);
        g.agregarAlumnos(a3);
        
        
        if(g.irDeViaje()==true){
            System.out.println("Grupo:" + g.nombre);
            System.out.println("Nos vamos de viaje :)");
        }else{
            System.out.println("No nos vamos de viaje :(");
        }
        
    }
    
}
