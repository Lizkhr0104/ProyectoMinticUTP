package beans;

import java.sql.Date;

public class Alquiler {
    private int id_patineta;
    private int username; 
    private Date fecha_alquiler; 
    private String nombre_patineta;
    private String tipo_patineta;

    public Alquiler(int id_patineta, int username, Date fecha_alquiler, String nombre_patineta, String tipo_patineta) {
        this.id_patineta = id_patineta;
        this.username = username;
        this.fecha_alquiler = fecha_alquiler;
        this.nombre_patineta = nombre_patineta;
        this.tipo_patineta = tipo_patineta;
    }

    public int getId_patineta() {
        return id_patineta;
    }

    public void setId_patineta(int id_patineta) {
        this.id_patineta = id_patineta;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Date fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public String getNombre_patineta() {
        return nombre_patineta;
    }

    public void setNombre_patineta(String nombre_patineta) {
        this.nombre_patineta = nombre_patineta;
    }

    public String getTipo_patineta() {
        return tipo_patineta;
    }

    public void setTipo_patineta(String tipo_patineta) {
        this.tipo_patineta = tipo_patineta;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id_patineta=" + id_patineta + ", username=" + username + ", fecha_alquiler=" + fecha_alquiler + ", nombre_patineta=" + nombre_patineta + ", tipo_patineta=" + tipo_patineta + '}';
    }
            
    
}
