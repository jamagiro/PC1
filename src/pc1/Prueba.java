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
public class Prueba {
    
    String tipoPrueba;
    int nota;

    public Prueba(String tipoPrueba, int nota) {
        this.tipoPrueba = tipoPrueba;
        this.nota = nota;
    }
  
    
    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
}
