class Estudiante:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def presentarse(self):
        return f"Soy {self.nombre} y tengo {self.edad} años."

# Instanciación
estudiante1 = Estudiante("Ana", 20)
print(estudiante1.presentarse())
