#Creamos nuestro propio class de excepcion
class NumerosIgualesException(Exception): #se extiende de la clase
    def __init__(self, mensaje):
        self.menssage = mensaje