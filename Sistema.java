/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
 
    private List<Carrera> carreras;
    private List<Alumno> alumnos;
    private List<Profesor> profesores;
    private List<Coordinador> coordinadores;

    // Scanner para ingresar datos
    private final Scanner scanner;

    // Constructor
    public Sistema() {
        carreras = new ArrayList<>();
        alumnos = new ArrayList<>();
        profesores = new ArrayList<>();
        coordinadores = new ArrayList<>();

        scanner = new Scanner(System.in);
    }

    // Método principal para mostrar el menú
    public void menu() {

        int opcion;

        do {
         
            System.out.println("MENU DEL SISTEMA");
            System.out.println("1. Matricular alumno");
            System.out.println("2. Inscribir alumno a una materia");
            System.out.println("3. Registrar asistencia");
            System.out.println("4. Cargar situación final");
            System.out.println("5. Mostrar números de carrera");
            System.out.println("6. Mostrar alumnos de una materia");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1 -> matricularAlumno();

                case 2 -> inscribirAlumno();

                case 3 -> registrarAsistencia();

                case 4 -> cargarSituacionFinal();

                case 5 -> mostrarNumerosCarrera();

                case 6 -> mostrarAlumnosMateria();

                case 0 -> System.out.println("Saliendo del sistema...");

                default -> System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);
    }

    public void matricularAlumno() {
        System.out.println("Opción: Matricular alumno");
    }

    public void inscribirAlumno() {
        System.out.println("Opción: Inscribir alumno a una materia");
    }

    public void registrarAsistencia() {
        System.out.println("Opción: Registrar asistencia");
    }

    public void cargarSituacionFinal() {
        System.out.println("Opción: Cargar situación final");
    }

    public void mostrarNumerosCarrera() {
        System.out.println("Opción: Mostrar números de carrera");
    }

    public void mostrarAlumnosMateria() {
        System.out.println("Opción: Mostrar alumnos de una materia");
    }

    // Método main
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        sistema.menu();
    }
}




 