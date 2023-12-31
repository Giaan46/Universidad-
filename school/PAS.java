package Tokio.school;

public class PAS extends Personal {
    // variables
    private int horasSemana;
    private int importeHora;
    private int horasExtra;
// constructor
    public PAS(String nombre, String categoria,String dni, int horasSemana, int importeHora) {
        super(nombre, categoria, dni);
        this.horasSemana = horasSemana;
        this.importeHora = importeHora;
        this.horasExtra = 0;
    }

    public void agregarHorasExtra(int horas) {
        this.horasExtra += horas;
    }
// sobre escribimos el metodo calcular salario
    @Override
    public int calcularSalario() {
        int semanasMes = 4;
        int salarioBase = horasSemana * importeHora * semanasMes * 100; // Salario en céntimos de Euro
        int salarioHorasExtra = horasExtra * 600; // Cada hora extra se paga a 6 euros (en céntimos de Euro)
        return salarioBase + salarioHorasExtra;
    }
}
