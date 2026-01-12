package co.edu.uniquindio.proyectopersonal.redsocialproyecto.model;

import javax.management.relation.Role;
import java.util.UUID;

public class Moderador {
    private UUID id;
    private String nombre;
    private String email;
    private Role role;

    public Moderador() {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.role = role;
    }

    public void administrarUsuarios(ListaEnlazada <Usuario> usuarios){
    }
    public void gestionarContenido(ListaEnlazada <Contenido> contenido){
        ListaEnlazada listaEnlazada = new ListaEnlazada<>;
        return listaEnlazada;
    }
    

}
