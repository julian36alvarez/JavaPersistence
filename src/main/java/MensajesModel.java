import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MensajesModel {
    int id_mensaje;
    String mensaje;
    String autor;
    Timestamp fechaMensaje;

    public MensajesModel() {
    }

    public static final Calendar tzUTC = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

    public MensajesModel(String mensaje, String autor, Timestamp fechaMensaje) {
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

    public Timestamp getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(Timestamp fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
