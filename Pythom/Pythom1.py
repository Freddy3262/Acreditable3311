class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def descripcion(self):
        return f"Coche: {self.marca} {self.modelo}"

# Instanciación
coche1 = Coche("Toyota", "Corolla")
print(coche1.descripcion())
