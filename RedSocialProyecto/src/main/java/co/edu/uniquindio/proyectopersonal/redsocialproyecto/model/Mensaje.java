package co.edu.uniquindio.proyectopersonal.redsocialproyecto.model;


import java.util.Date;
import java.util.UUID;

public class Mensaje {
    private Usuario emisor;
    private Usuario receptor;
    private UUID idmensaje;
    private String contenido;
    private Date fecha;

    public Mensaje(Usuario emisor, Usuario receptor, UUID idmensaje, String contenido, Date fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.idmensaje = idmensaje;
        this.contenido = contenido;
        this.fecha = fecha;
    }
}
