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
public class ArbolB {
     //Se declara la raiz 
    public Nodo raiz;
    int altura;
    public ArbolB() {
        raiz = null;
    }
    
    
    //metodo que agrega un Nodo
     public void agregarNodo(int d, String nom) {
        //En un arbol binario los nuevos nodos que se van a gregando 
        //si son menores que el padre se insertan en la izquierda 
        //Si son mayores se insertan a la derecha 
        Nodo nuevo = new Nodo(d, nom);
        if (raiz == null) {
            raiz = nuevo;

        } else {//Se crean dos nodos  aparte
            Nodo aux = raiz; //Apúnta a la raiz
            Nodo padre;
            //Se procede a hacer un ciclo 
            while (true) {
                padre = aux;//padre tambien apunta a la raiz
                //controla el posicionamiento del nodo en el arbol

                if (d < aux.dato) {
                    aux = aux.hijoIzq;
                    //si ocurre lo siguiente es porque el nodo 
                    //ya se convierte en una hoja 
                    if (aux == null) {
                        padre.hijoIzq = nuevo;//se termina la insersion 
                        return;
                    }
                } else {//Si el nodo es mayor o igual
                    aux = aux.hijoDer;
                    if (aux == null) {//encuentra lugar adecuado
                        padre.hijoDer = nuevo;
                        return;
                    }
                }
            }

        }
    }
     
      //RRECORRIDOS ARBOL

    //InOrden 
    //IZQ RAIZ DER
    public void inOrden(Nodo r) {
        if (r != null) {
            inOrden(r.hijoIzq);//Izquierdo recursividad
            System.out.println(r.dato);//visita la raiz
            inOrden(r.hijoDer);//Derecho recursividad
        }
    }

    //preOrden 
    //RAIZ IZQ DER
    public void preOrden(Nodo r) {
        if (r != null) {
            System.out.println(r.dato);//Visita la raiz
            preOrden(r.hijoIzq);//Izquierdo recursividad
            preOrden(r.hijoDer);//Derecho recursividad
        }
    }

    //postOrden
    //IZQ DER RAIZ
    public void postOrden(Nodo r) {
        if (r != null) {

            postOrden(r.hijoIzq);//Izquierdo recursividad
            postOrden(r.hijoDer);//Derecho recursividad
            System.out.println(r.dato);//Visita la raiz
        }
    }
//Metod para saber si esta vacio
     // metodo arbol vacio 
    public boolean esVacio() {
        return raiz == null;
    }
//MEtodo para obtener altura 
    public int altura(Nodo nodo,int nivel){
    if (nodo==null){
        return -1;
    
    }else{
        //se aplica recursividad
        
    altura(nodo.hijoIzq,nivel+1);
     
    if(nivel>altura){
        altura=nivel;
        
    }
    altura(nodo.hijoDer,nivel+1);
    }
    return altura;
    }
    
}
