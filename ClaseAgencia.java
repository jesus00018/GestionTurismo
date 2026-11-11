public class Agencia {

    private int idAgencia;
    private String direccion;
    private String nombre;
    private String email;

    public Agencia() {
    }

    public Agencia(int idAgencia, String direccion, String nombre, String email) {
        this.idAgencia = idAgencia;
        this.direccion = direccion;
        this.nombre = nombre;
        this.email = email;
    }
    
//getters y setters
    public int getIdAgencia() { return idAgencia; }
    public void setIdAgencia(int idAgencia) { this.idAgencia = idAgencia; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Agencia{" + "idAgencia=" + idAgencia + ", direccion=" + direccion
                + ", nombre=" + nombre + ", email=" + email + '}';
    }
}
