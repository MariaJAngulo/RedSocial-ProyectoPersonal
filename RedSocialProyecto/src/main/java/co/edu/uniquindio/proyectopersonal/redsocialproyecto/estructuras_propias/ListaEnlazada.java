package co.edu.uniquindio.proyectopersonal.redsocialproyecto.estructuras_propias;

import java.util.List;

public class ListaEnlazada<T> {

    private Nodo<T> nodo;
    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public ListaEnlazada(T Tipo){}

    public void agregar(T dato) {
        Nodo<T> nodo = new Nodo<>(dato);
        if (primero == null) {
            primero = nodo;
            ultimo = nodo;
        }else {
            ultimo.siguiente(nodo);
            ultimo = nodo;
        }
    }

    public T devolverDato(int indice){
        if (indice==0){
            return primero.getDato();
        }else {
            Nodo<T> nodo = new Nodo<>();
            int contador=1;
            nodo=primero.getSiguiente();
            if(contador==indice){
                return nodo.getDato();
            }else{
                return
            }
        }
    }

}