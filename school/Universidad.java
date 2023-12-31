package Tokio.school;

public class Universidad {
// creamos el metodo estatico imprimir nominar para que recorra la lista de personal y que nos imprima por consola sus caracteristicas
	public static void imprimirNominas(Personal[] listaPersonal) {
		for (Personal personal : listaPersonal) {
			String nombre = personal.getNombre();
			String dni = personal.getDni();
			String categoria = personal.getCategoria();
			int salario = personal.calcularSalario();
			System.out.printf("Nombre: %s | Dni: %s | Categoría: %s | Salario: %.2f euros\n", nombre, dni , categoria, salario / 100.0);
		}
	}
// creamos un metodo estatico obtenerPresupuestoTotal para que haga el calculo de los gatos contemplando la informacion del personal
	public static int obtenerPresupuestoTotal(Personal[] listaPersonal) {
		int presupuestoTotal = 0;
		for (Personal personal : listaPersonal) {
			presupuestoTotal += personal.calcularSalario();
		}
		return presupuestoTotal;
	}
}
