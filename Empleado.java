// EMPLEADO hereda de PERSONA
public class Empleado extends Persona {

    private int idEmpleado;
    private String usuario;
    private String contrasena;
    private Agencia agencia;   // FK de agenca

    public Empleado() {
    }

    public Empleado(int idPersona, String nombre, String apellido, int dni, String email,
                    String nacionalidad, String provincia, String ciudad, String genero,
                    String direccion, int idEmpleado, String usuario, String contrasena,
                    Agencia agencia) {
        super(idPersona, nombre, apellido, dni, email, nacionalidad, provincia, ciudad,
              genero, direccion);
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.agencia = agencia;
    }

    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public Agencia getAgencia() { return agencia; }
    public void setAgencia(Agencia agencia) { this.agencia = agencia; }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", usuario=" + usuario
                + ", agencia=" + (agencia != null ? agencia.getNombre() : null)
                + ", " + super.toString() + '}';
    }
}
