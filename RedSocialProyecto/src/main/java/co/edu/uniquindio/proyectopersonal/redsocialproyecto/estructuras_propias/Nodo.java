package co.edu.uniquindio.proyectopersonal.redsocialproyecto.estructuras_propias;

public class Nodo <T> {
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(T Dato){}

    public Nodo(){}

    public void siguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }

    public Nodo<T> getSiguiente(){
        return this.siguiente;
    }

    public T getDato(){
        return dato;
    }
}
