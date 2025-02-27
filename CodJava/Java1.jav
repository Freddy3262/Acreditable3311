public class Coche {
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String descripcion() {
        return "Coche: " + marca + " " + modelo;
    }

    public static void main(String[] args) {
        // Instanciación
        Coche coche1 = new Coche("Toyota", "Corolla");
        System.out.println(coche1.descripcion());
    }
}
