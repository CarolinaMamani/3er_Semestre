class Persona:
    def __init__(self, id_persona, nombre, apellido, email): #metodo dander init
        self._id_persona = id_persona
        self._nombre = nombre
        self._apellido = apellido
        self._email = email
        
    def __str__(self): #Metodo dander str
        return f'''
            Id Persona: {self._id_persona}, 
            Nombre: {self._nombre}, 
            Apellido: {self._apellido}, 
            Email: {self._email}
        '''
    
    #metodos gtters and setters de los 4 atributos
    @property
    def id_persona(self):
        return self._id_persona
    @id._persona.setter
    def id_persona(self, id_persona):
        self._id_persona = id_persona
    
    
    @property
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
        
        
    @property
    def apellido(self):
        return self._apellido
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
        
        
    @property
    def email(self):
        return self._email
    @email.setter
    def email(self, email):
        self._email = email