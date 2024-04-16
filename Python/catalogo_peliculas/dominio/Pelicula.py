
class Pelicula:
    # creamos el dander init
    def __init__(self, nombre):
        self._nombre = nombre
        
    # dander str
    def __str__(self):
        return f'Pelicula: {self._nombre}'
    
    #creamos el metodo get
    @property
    def nombre(self):
        return self._nombre
    
    #metodo set
    def nombre(self, nombre):
        self._nombre = nombre #para modificar el nombre