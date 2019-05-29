/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arboles;

/**
 *
 * @author cornelius
 */
public class NodoBinario {
    public Object dato;
    public NodoBinario izq;
    public NodoBinario der;
    public NodoBinario padre;

    public NodoBinario(){
        this.izq = null;
        this.der = null;
        this.padre = null;
    }

    public NodoBinario(Object dato){
        super();
        this.dato = dato;
    }
}
