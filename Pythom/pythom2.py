class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor

    def info(self):
        return f"Título: {self.titulo}, Autor: {self.autor}"

# Instanciación
libro1 = Libro("1984", "George Orwell")
print(libro1.info())
