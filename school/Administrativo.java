package Tokio.school;

public class Administrativo extends PAS {
    // variables
    private int horasSemana;
    private int importeHora;
   // constructor
    public Administrativo(String nombre, String categoria, String dni, int horasSemana, int importeHora) {
        super(nombre, categoria, dni,horasSemana,importeHora);
        this.horasSemana = horasSemana;
        this.importeHora = importeHora;
    }
// sobre escirbimos el metodo calcular salrio
    @Override
    public int calcularSalario() {
        int semanasMes = 4;
        return horasSemana * importeHora * semanasMes * 100; // Salario en céntimos de Euro
    }
}