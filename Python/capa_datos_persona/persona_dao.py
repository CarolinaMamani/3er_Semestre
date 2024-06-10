from conexion import Conexion
from Persona import Persona
from logger_base import log
class PersonaDAO:
    '''
    DAO significa: Data Access Object
    CRUD significa:
                    Create -> Insertar
                    Read -> Seleccionar
                    Update -> Actualizar
                    Delete -> Eliminar
    '''
    
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'
    
    #Definimos los metodos de clase
    @classmethod
    def seleccionar(cls):
         with Conexion.obtenerConexion():
             with Conexion.obtenerCursor() as cursor:
                 cursor.execute(cls._SELECCIONAR)
                 registros = cursor.fetchall()
                 personas = [] #creamos una lista
                 for regristro in registros:
                     persona = Persona(regristro[0],regristro[1], regristro[2], regristro[3])
                     personas.append(persona)
                 return personas
    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f'Persona insertada: {persona}')
                return cursor.rowcount
            
if __name__ == '__main__':
    # Insertar un registro
    persona1 = Persona(nombre='Lulu', apellido='Ruru', email='rulu@mail.com')
    personas_insertadas = PersonaDAO.insertar(persona1)
    log.debug(f'Personas insertadas: {personas_insertadas}')
    
    
    # Seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)
    