from psycopg2 import pool
from logger_base import log
import sys

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5433'
    _HOST = '127.0.0.1'
    _MIN_CON = 1 #minimo de conecciones del connection pool
    _MAX_CON = 5 # no colocar tantos
    _pool = None
    
      
    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn() #objeto de pool de conecciones, metodo getconn manda un abjeto hacia la base de datos
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion
    
    @classmethod
    def obtenerCursor(cls):
        pass
    
    #Pool de conecciones:
    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host = cls._HOST,
                                                      user = cls._USERNAME,
                                                      password = cls._PASSWORD,
                                                      port = cls._DB_PORT,
                                                      database = cls._DATABASE)
                log.debug(f'creacion del pol exitosa: {cls._pool}')
            except Exception as e:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()#salida de la coneccion
        else:
            return cls._pool
    
if __name__ == '__main__':
    pass