package beans;


public class Patinetas {
    private int id_patineta;
    private String nombre_patineta;
    private String tipo_patineta;
    private double valor_dia;

    public Patinetas(int id_patineta, String nombre_patineta, String tipo_patineta, double valor_dia) {
        this.id_patineta = id_patineta;
        this.nombre_patineta = nombre_patineta;
        this.tipo_patineta = tipo_patineta;
        this.valor_dia = valor_dia;
    }

    public int getId_patineta() {
        return id_patineta;
    }

    public void setId_patineta(int id_patineta) {
        this.id_patineta = id_patineta;
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

    public double getValor_dia() {
        return valor_dia;
    }

    public void setValor_dia(double valor_dia) {
        this.valor_dia = valor_dia;
    }

    @Override
    public String toString() {
        return "Patinetas{" + "id_patineta=" + id_patineta + ", nombre_patineta=" + nombre_patineta + ", tipo_patineta=" + tipo_patineta + ", valor_dia=" + valor_dia + '}';
    }
    
    
    
}
