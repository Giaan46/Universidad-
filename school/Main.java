package Tokio.school;

import java.util.Scanner;

import static Tokio.school.Universidad.imprimirNominas;
import static Tokio.school.Universidad.obtenerPresupuestoTotal;

public class Main {

	public static void main(String[] args) {
       // abrimos un scanner
		Scanner scanner = new Scanner(System.in);

		// Creamos instancias de personal
		Personal administrativo = new Administrativo("Gian", "Administrativo","3498234f", 37, 7);
		Personal informatico = new Informatico("Luca", "Informático","7634532r",40, 6);
		Profesor profesor = new Profesor("Gabriel", "Profesor","23423h", 37, 8);
		Investigador investigador = new Investigador("Miriam", "Investigador","1323423p", 35, 7);

		// Agregamos sexenios al profesor
		profesor.agregarSexenio();

		// Creamos una lista de personal
		Personal[] listaPersonal = {administrativo, informatico, profesor, investigador};

		//llamamos al metodo imprimir las n�minas y lo imprimimos por pantalla
		System.out.println("Nóminas:");
		imprimirNominas(listaPersonal);

		//llamamos al metodo presupuesto total y lo imprimimos por pantalla
		int presupuestoTotal = obtenerPresupuestoTotal(listaPersonal);
		System.out.printf("Presupuesto total: %.2f euros\n", presupuestoTotal / 100.0);
       // cerramos el scanner
		scanner.close();
	}
		

		

		


	}


