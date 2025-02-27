public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String presentarse() {
        return "Soy " + nombre + " y tengo " + edad + " años.";
    }

    public static void main(String[] args) {
        // Instanciación
        Estudiante estudiante1 = new Estudiante("Ana", 20);
        System.out.println(estudiante1.presentarse());
    }
}
