package co.edu.uniquindio.proyectopersonal.redsocialproyecto.model;

import java.util.UUID;

public class Usuario {
    private UUID id;
    private String nombre;
    private Rol rol;
    private ListaEnlazada<Conexiones> conexiones;
    private ListaEnlazada<Publicaciones> publicaciones;
    private ListaEnlazada<Valoraciones> valoraciones;
    private ListaEnlazada<GrupoEstudio> gruposEstudio;
    private ListaEnlazada<Mensaje> mensajes;
    private Set <Intereses> intereses;

    public Usuario(Set<Intereses> intereses, ListaEnlazada<Mensaje> mensajes, ListaEnlazada<GrupoEstudio> gruposEstudio, ListaEnlazada<Valoraciones> valoraciones, ListaEnlazada<Publicaciones> publicaciones, ListaEnlazada<Conexiones> conexiones, Rol role, String nombre, UUID id) {
        this.intereses = intereses;
        this.mensajes = mensajes;
        this.gruposEstudio = gruposEstudio;
        this.valoraciones = valoraciones;
        this.publicaciones = publicaciones;
        this.conexiones = conexiones;
        this.rol = rol;
        this.nombre = nombre;
        this.id = id;
    }

    public void enviarMensaje(Usuario receptor, String contenido){
    }

    public void publicarContenido(Contenido contenido){
    }

    public boolean autenticar(String contrasenia){
        return  true;
    }
    public void registro(String contrasenia){
    }
    public void valorarContenido(UUID contenidoid, int valoracion, String comentario ){
    }
    public void solicitarAyuda(String tema, int urgencia){
    }
    public ListaEnlazada getSugerenciasAmigos(ListaEnlazada<Usuario> usuarios){
        ListaEnlazada listaEnlazada = new ListaEnlazada<>;
        return listaEnlazada;
    }
    public void getSugerenciasGrupos(ListaEnlazada<GrupoEstudio> grupos){
        ListaEnlazada listaEnlazada = new ListaEnlazada<>;
        return listaEnlazada;
    }

}

