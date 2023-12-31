package Tokio.school;

public class Investigador extends PDI {
    // varianbles
    private int horasSemana;
    private int importeHora;
// constructos
    public Investigador(String nombre, String categoria, String dni, int horasSemana, int importeHora) {
        super(nombre, categoria, dni,horasSemana,importeHora);
        this.horasSemana = horasSemana;
        this.importeHora = importeHora;
    }
  // sobre escribirmos el metodo calcular salario
    @Override
    public int calcularSalario() {
        int semanasMes = 4;
        return horasSemana * importeHora * semanasMes * 100; // Salario en céntimos de Euro
    }
}