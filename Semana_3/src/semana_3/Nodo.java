/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

/**
 *
 * @author hp
 */
public class Nodo {
    public int dato;
    public Nodo siguiente; //Puntero enlace
    //constructor para insertar al final
    public Nodo(int d){
        this.dato=d;
    }
    //Constructor para Insertar al incio
    public Nodo(int d, Nodo n){
        dato=d;
        siguiente=n;
    }
}
