/*
 EDGAR JACOB MORENO
EXAMEN ESTRUCTURAS DE DATOS ARBOLES BINARIOS EN JAVA 
CARNE : 0117660514
 */
package CapaLogica;

/**
 *
 * @author edgar
 */
public class Nodo {
    

//En los arboles binarios el nodo debe contener 
//Dato
//Apuntador al hijo izq 
//Apuntador al Hijo Der
    int dato;
    //Punteros
    String nombre; 
    Nodo hijoIzq,hijoDer;
    //COnstructor 
    public Nodo(int n,String nom){
    this.dato=n;
    this.nombre=nom;
    //COntructor de los apuntadores 
    this.hijoDer=null;
    this.hijoIzq=null;
    
    }
    
    //metodo para imprimir datos 
    public String toString(){
    return nombre + "Su dato es " + dato; 
   
    }
    
}


