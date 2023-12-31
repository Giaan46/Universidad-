package Tokio.school;

public class Profesor extends PDI {
    // inicializamos variables
    private int horasSemana;
    private int importeHora;
    private int sexenios;
 // constructor
    public Profesor(String nombre, String categoria,String dni, int horasSemana, int importeHora) {
        super(nombre, categoria,dni,horasSemana,importeHora);
        this.horasSemana = horasSemana;
        this.importeHora = importeHora;
        this.sexenios = 0;
    }

    public void agregarSexenio() {
        this.sexenios++;
    }
  // sobre escribimos el metodo calcular salario con las caracteristicas de su categoria
    @Override
    public int calcularSalario() {
        int semanasMes = 4;
        int salarioBase = horasSemana * importeHora * semanasMes * 100; // Salario en céntimos de Euro
        int complementoSexenios = sexenios * 10000; // Cada sexenio reconocido añade 100 euros al mes (en céntimos de Euro)
        return salarioBase + complementoSexenios;
    }
}



