<?php
class Libro {
    public $titulo;
    public $autor;

    public function __construct($titulo, $autor) {
        $this->titulo = $titulo;
        $this->autor = $autor;
    }

    public function info() {
        return "Título: $this->titulo, Autor: $this->autor";
    }
}

// Instanciación
$libro1 = new Libro("1984", "George Orwell");
echo $libro1->info();
?>
