<?php
class Coche {
    public $marca;
    public $modelo;

    public function __construct($marca, $modelo) {
        $this->marca = $marca;
        $this->modelo = $modelo;
    }

    public function descripcion() {
        return "Coche: $this->marca $this->modelo";
    }
}

// Instanciación
$coche1 = new Coche("Toyota", "Corolla");
echo $coche1->descripcion();
?>
