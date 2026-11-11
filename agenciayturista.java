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


class Persona {

    private int idPersona;
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private String nacionalidad;
    private String provincia;
    private String ciudad;
    private String genero;
    private String direccion;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, int dni, String email,
                   String nacionalidad, String provincia, String ciudad, String genero,
                   String direccion) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.genero = genero;
        this.direccion = direccion;
    }

    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre
                + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email
                + ", nacionalidad=" + nacionalidad + ", provincia=" + provincia
                + ", ciudad=" + ciudad + ", genero=" + genero
                + ", direccion=" + direccion + '}';
    }
}