
package beans;


public class Usuario {
    private int username;
    private String contrasena;
    private String tipo_identificacion;
    private int n_identificacion;
    private String nombre;
    private String apellido;
    private String direccion;
    private int celular;
    private String email;

    public Usuario(int username, String contrasena, String tipo_identificacion, int n_identificacion, String nombre, String apellido, String direccion, int celular, String email) {
        this.username = username;
        this.contrasena = contrasena;
        this.tipo_identificacion = tipo_identificacion;
        this.n_identificacion = n_identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public int getN_identificacion() {
        return n_identificacion;
    }

    public void setN_identificacion(int n_identificacion) {
        this.n_identificacion = n_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", tipo_identificacion=" + tipo_identificacion + ", n_identificacion=" + n_identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", celular=" + celular + ", email=" + email + '}';
    }
    
    
}

