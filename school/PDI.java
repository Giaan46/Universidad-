package Tokio.school;

public class PDI extends Personal {
    // variables
    private int horasSemana;
    private int importeHora;
    private int sexenios;
// constructor
    public PDI(String nombre, String categoria,String dni, int horasSemana, int importeHora) {
        super(nombre, categoria,dni);
        this.horasSemana = horasSemana;
        this.importeHora = importeHora;
        this.sexenios = 0;
    }

    public void agregarSexenio() {
        this.sexenios++;
    }
// sobreescribimos el metodo calcularsalario
    @Override
    public int calcularSalario() {
        int semanasMes = 4;
        int salarioBase = horasSemana * importeHora * semanasMes * 100; // Salario en céntimos de Euro
        int complementoSexenios = sexenios * 10000; // Cada sexenio reconocido añade 100 euros al mes (en céntimos de Euro)
        return salarioBase + complementoSexenios;
    }
}
