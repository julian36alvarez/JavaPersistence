public class MensajesModel {
    int id_mensaje;
    String mensaje;
    String autor;
    String fechaMensaje;

    public MensajesModel() {
    }

    public MensajesModel(String mensaje, String autor, String fechaMensaje) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fechaMensaje = fechaMensaje;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
