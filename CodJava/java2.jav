public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String info() {
        return "Título: " + titulo + ", Autor: " + autor;
    }

    public static void main(String[] args) {
        // Instanciación
        Libro libro1 = new Libro("1984", "George Orwell");
        System.out.println(libro1.info());
    }
}
