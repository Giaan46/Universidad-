package Tokio.school;

public abstract class Personal {
    // inicializamos variables de la clase personal
    private String nombre;
    private String categoria;
    private String dni;
  // constructor
    public Personal(String nombre, String categoria, String dni) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.dni = dni;
    }
  // getters y setters
    public abstract int calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }
    public String getDni(){
        return dni;
    }
}
